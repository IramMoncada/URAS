package uras;

import ClaseConectar.ConexionBD;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
//LA TABLA VENTAS ES PARA GUARDAR LOS FOLIOS DE LOS TICKETS
public class InterVendedor extends javax.swing.JFrame {
     ConexionBD cc = new ConexionBD();
    Connection cn =cc.abrir_conexion();
    JTextField pregunta = new JTextField();
         JPanel myPanel = new JPanel();
    DefaultTableModel mi_modelo;
    double total_venta;
    static String mi_usuario;
    boolean bandera=true;
 
    public InterVendedor() {
        initComponents();
         setLocationRelativeTo(null);
          ((JPanel)getContentPane()).setOpaque(false);
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
         mostrardatos("");
         total();
         mi_modelo=tabla2();
         user_label.setText(mi_usuario);
    }
  void mostrardatos(String valor)
  {
    DefaultTableModel modelo= new DefaultTableModel() //tabla ineditable
    {
      public boolean isCellEditable(int row, int column) 
      {return false;}
    };
    modelo.addColumn("PRODUCTO");
     modelo.addColumn("PRECIO");
    modelo.addColumn("CANTIDAD");
    TablaProductos.setModel(modelo);
   
    
    String sql="";
    if(valor.equals(""))//Si el campo esta vacio nos mostraaro toda la base de datos
    {
        sql="SELECT * FROM productos";
    }
    else{//si no esta vacio el campo entonces muestra  el producto deseado
        //modificacion de buscar por valor, a buscar por referencia
        String valor1=  "%"+valor+"%"; 

        sql="SELECT * FROM productos WHERE nombre LIKE '"+valor1+"'";
    }
 
    String []datos = new String [3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            TablaProductos.setModel(modelo);
            TablaProductos.getColumnModel().getColumn(0).setPreferredWidth(200);
        } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  
    void total() //cuenta total
    {
       try
       { 
        int rows=mi_modelo.getRowCount();
        double miTotal=0.0,val1,val2;
          for(int i=0;i<rows;i++) 
          {
              val1=Double.parseDouble(String.valueOf(TablaProductos2.getValueAt(i,1)));
              val2=Double.parseDouble(String.valueOf(TablaProductos2.getValueAt(i,2)));

            miTotal= miTotal + ( val1*val2); 
          }
          resultado.setText(Double.toString(miTotal));
          total_venta=miTotal;
       }
        catch (Exception e) 
        { resultado.setText("0");}
    }
  
   DefaultTableModel tabla2()
   {
    DefaultTableModel modelo= new DefaultTableModel()//celdas de columna 3 editables
       {
         public boolean isCellEditable(int row, int column) 
         { return false;}
       };
    modelo.addColumn("PRODUCTO");
     modelo.addColumn("PRECIO");
    modelo.addColumn("CANTIDAD");
    
    TablaProductos2.setModel(modelo);
    TablaProductos2.getColumnModel().getColumn(0).setPreferredWidth(200);
    
    return modelo;
   }

   String update()
     { String folio_funcion="";
        //update de productos
           int rows=mi_modelo.getRowCount();
           for(int i=0;i<rows;i++)  //update una por una
           { 
             String nombre_carrito=TablaProductos2.getValueAt(i,0).toString();//id de productos del carrito             
             String cantidad_carrito= TablaProductos2.getValueAt(i, 2).toString();
                int carrito=Integer.parseInt(cantidad_carrito);// cantidad del producto del carrito        
           
             String consul="SELECT cantidad FROM productos WHERE nombre='"+nombre_carrito+"'";//cantidad del almacen segun id
               System.out.println(consul);
                 try
                 { 
                     Statement st=cn.createStatement();
                     ResultSet rs=st.executeQuery(consul);//aqui es
                      if(rs.next()) 
                      {
                       String cantidad_bd= rs.getString(1);
                       int bd=Integer.parseInt(cantidad_bd);
                       int result=bd-carrito;
                       String modifica="UPDATE productos SET cantidad='"+ result +"' WHERE nombre='"+nombre_carrito+"'";
                         try{ 
                               PreparedStatement pst=cn.prepareStatement(modifica);
                               pst.executeUpdate();
                             }
                         catch(Exception e){JOptionPane.showMessageDialog(null, "No se descontaron productos");}
                      }
                      
                 }
                   catch(Exception e)
                   {         System.out.println("No se hizo un update");
                            bandera=false;
                   }
                              
                 
           }//del for   
           
           mostrardatos("");
          //////////////////////////////// termina actualizacion de cantidades 
        //insert ventas
         try 
         {    
            PreparedStatement pst= cn.prepareStatement("INSERT INTO ventas (folio,total,vendedor) VALUES(?,?,?)");
            
               pst.setString(1,null);
               pst.setString(2,Double.toString(total_venta)) ;
               pst.setString(3,mi_usuario);
               pst.executeUpdate();
             
                System.out.println("se hizo la venta paps");
         } catch (SQLException ex) {Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(this,"No se concreto venta");
              bandera=false;
         }
         
              String consul2="SELECT last_insert_id()  FROM ventas";
         try
                 {
                     Statement st=cn.createStatement();
                     ResultSet rs=st.executeQuery(consul2);
                     if(rs.next())
                        folio_funcion=rs.getString(1);
                      
                 }
         catch(Exception e)
               {System.out.println("no se obtuvo el last id paps"); }
         
        ////////////////////////////////////////////////////////
       int row=mi_modelo.getRowCount();
 for(int j=0;j<row;j++)  //update una por una
                     { 
                   //vendedor
                         //copia los elementos del seleccionado
                        String nombre=TablaProductos2.getValueAt(j, 0).toString();
                        String precio = TablaProductos2.getValueAt(j, 1).toString();
                        String cantidad= TablaProductos2.getValueAt(j, 2).toString();
                       
                        double total= Double.parseDouble(precio)*Double.parseDouble(cantidad);
                        
                        try {
            PreparedStatement pst= cn.prepareStatement("INSERT INTO ventas_productos (id_ventas,nombre,precio,cantidad,total,vendedor) VALUES(?,?,?,?,?,?)");
            
               pst.setString(1,null);
               pst.setString(2,nombre);
               pst.setString(3,precio);
               pst.setString(4,cantidad);
               pst.setString(5,Double.toString(total));
               pst.setString(6,mi_usuario);
               
             
                
                
                pst.executeUpdate();
                mostrardatos("");
                            System.out.println("Se hizo la venta paps");
        } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"No se concreto venta");
              
        } }
       ///////////////////////////////////////////////////////////7  
         
       return folio_funcion;
     }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos2 = new javax.swing.JTable();
        resultado = new javax.swing.JLabel();
        Completar = new javax.swing.JButton();
        user_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cancel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Cancel.setText("Cancelar");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos del Almacén");

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Productos Seleccionados en Carrito");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");

        Add.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Add.setText("Agregar");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Búsqueda");

        TablaProductos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Existencia", "Producto", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaProductos);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("URAS");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton3.setText("Mostrar Todo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TablaProductos2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TablaProductos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Existencia", "Producto", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaProductos2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TablaProductos2);

        resultado.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));

        Completar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Completar.setText("Completar venta");
        Completar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompletarActionPerformed(evt);
            }
        });

        user_label.setBackground(new java.awt.Color(0, 0, 0));
        user_label.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(Completar)))
                                .addGap(0, 125, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Borrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user_label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Completar)
                .addGap(4, 4, 4)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          dispose();
        Wuser user= new Wuser();
       
        user.ejecutar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    mostrardatos(txtBuscar.getText());//mostrara solo las coincidencias         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
mostrardatos("");        
    }//GEN-LAST:event_jButton3ActionPerformed

   private boolean valida_carrito(String nombre)
   {
        int cant=mi_modelo.getRowCount();
       for(int i=0;i<cant;i++)    
       {
          String nombre2 = TablaProductos2.getValueAt(i, 0).toString();
          if(nombre==nombre2)
              return true;//cuando id ya exista
       }
    return false; 
   }
    
    private String obten_ubicacion(String producto){
        String sql="SELECT ubicacion FROM productos WHERE nombre = '"+producto+"'";
        String ubicacion="";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while(rs.next())
              {
                   ubicacion=rs.getString(1);
              }
        } catch(Exception E){
         ubicacion="No se encontro ubicacion";
        }        
     return ubicacion;
    }
    
      private void salida_almacen (String producto, String cantidad)
    {
        String responsable=mi_usuario;//obtener usuario activo (nombre)
        Calendar c = Calendar.getInstance();
                             String dia = Integer.toString(c.get(Calendar.DATE));
                             String mes = Integer.toString(c.get(Calendar.MONTH));
                             String annio = Integer.toString(c.get(Calendar.YEAR));
                             String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
                             String minutos = Integer.toString( c.get(Calendar.MINUTE));
        
        try {
            PreparedStatement pst= cn.prepareStatement("INSERT INTO almacen (id_mov,tipo,producto,cantidad,hora,fecha,responsable) VALUES(?,?,?,?,?,?,?)");
               pst.setString(1,null);
               pst.setString(2,"SALIDA");
               pst.setString(3,producto);
               pst.setString(4,cantidad);
               pst.setString(5,hora+":"+minutos);
               pst.setString(6,dia+"/"+mes+"/"+annio);
               pst.setString(7,responsable); 
               pst.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
        private void entrada_almacen (String producto, String cantidad)
    {
        String responsable=mi_usuario;//obtener usuario activo (nombre)
        Calendar c = Calendar.getInstance();
                             String dia = Integer.toString(c.get(Calendar.DATE));
                             String mes = Integer.toString(c.get(Calendar.MONTH));
                             String annio = Integer.toString(c.get(Calendar.YEAR));
                             String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
                             String minutos = Integer.toString( c.get(Calendar.MINUTE));
        
        try {
            PreparedStatement pst= cn.prepareStatement("INSERT INTO almacen (id_mov,tipo,producto,cantidad,hora,fecha,responsable) VALUES(?,?,?,?,?,?,?)");
               pst.setString(1,null);
               pst.setString(2,"ENTRADA");
               pst.setString(3,producto);
               pst.setString(4,cantidad);
               pst.setString(5,hora+":"+minutos);
               pst.setString(6,dia+"/"+mes+"/"+annio);
               pst.setString(7,responsable); 
               pst.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
      
      
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
         //clic en agregar producto
          try {
            int item=TablaProductos.getSelectedRow();   //obtiene la posicion del elemento seleccionado 
       String producto=TablaProductos.getValueAt(item,0 ).toString(); //copia los elementos del seleccionado
       String precio=TablaProductos.getValueAt(item, 1).toString();
       String ubicacion=obten_ubicacion(producto);//ubicacion de la tabla productos del producto
       JTextField numero = new JTextField(5);
        JPanel myPanel = new JPanel();
       if(valida_carrito(producto))
           JOptionPane.showMessageDialog(null,"No puede agregar 2 veces el mismo producto");
       else{   
        myPanel.add(new JLabel("Cantidad de productos:"));
         myPanel.add(numero);
           int result = JOptionPane.showConfirmDialog(null, myPanel,("Cantidad de productos"), JOptionPane.OK_CANCEL_OPTION);
                                                            //caja de confirmacion de que los valores correctos
            if (result == JOptionPane.OK_OPTION)
            {    
                String cantidad=numero.getText();//cantidad asignada por vendedor
                String cantidad2=TablaProductos.getValueAt(item,2).toString();//cantidad del almacen
                double value1 = Double.parseDouble(cantidad);//cantidad asignada por vendedor
                double value2 = Double.parseDouble(cantidad2);//cantidad del almacen
                int numerosh=Integer.parseInt(cantidad);
                cantidad=Integer.toString(numerosh);
                if(numerosh<=0)
                    JOptionPane.showMessageDialog(null,"No puede agregar cantidades menores a 1");
                else
                if(value1<=value2)
                {
                    String almacen_result="El producto: "+producto+"\nSe encuentra ubicado en el cajon: "+ubicacion+" del almacén";
                    JOptionPane.showMessageDialog(null,almacen_result);
                    mi_modelo.addRow(new Object[]{producto,precio,cantidad});// los asigna a mi_modelo que es el modelo de tabla 2
                    total();
                    salida_almacen(producto,numero.getText());
                }
                else{JOptionPane.showMessageDialog(this, "No hay suficiente producto en almacen");}
            }
           }
          }
         catch (NumberFormatException e){JOptionPane.showMessageDialog(this, "Cantidad solo puede ser numeros enteros");}
           catch (RuntimeException e){JOptionPane.showMessageDialog(this, "No ha seleccionado un item");}
              
    }//GEN-LAST:event_AddActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
      
        try{
         int item=TablaProductos2.getSelectedRow(); //obtiene la posicion del elemento seleccionado
           String producto=TablaProductos2.getValueAt(item,0 ).toString(); //copia los elementos del seleccionado
           String cantidad=TablaProductos2.getValueAt(item, 2).toString();
            entrada_almacen(producto,cantidad);
            mi_modelo.removeRow(item);
          }
        catch (Exception e) { 
            JOptionPane.showMessageDialog(this, "No ha seleccionado un item");
         }    
        
        total();
    }//GEN-LAST:event_BorrarActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        
        int rows=mi_modelo.getRowCount(); //cuantas filas hay 
       
       if(rows!=0) //si no esta vacia, procede a eliminar
       {
         for(int i=0;i<rows;i++)  //borra una por una 
         { 
          String producto=TablaProductos2.getValueAt(0,0 ).toString(); //copia los elementos del seleccionado
           String cantidad=TablaProductos2.getValueAt(0, 2).toString();
            entrada_almacen(producto,cantidad);
            mi_modelo.removeRow(0);
         }
       }
       
       total();
    }//GEN-LAST:event_CancelActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void CompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompletarActionPerformed
   int rows=mi_modelo.getRowCount(); //cuantas filas hay 
       
       if(rows!=0) //si no esta vacia, procede a eliminar
       {
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Estas seguro??"));
        int result = JOptionPane.showConfirmDialog(null, myPanel,("Cantidad de productos"), JOptionPane.YES_NO_OPTION);
           if (result == JOptionPane.OK_OPTION)
           {
              String folio=update(); //update antes de nueva venta: actualiza productos e inserta venta 

                       //crea ticket
                       File archivo;
                       FileWriter w;
                       BufferedWriter bw;
                       PrintWriter wr;
                       try
                         {     
                             
                             archivo= new File("C:\\Users\\Iram Moncada\\Desktop\\ticket_"+folio+".txt");
                             if(archivo.createNewFile())
                                  System.out.println("Archivo creado");
                             w= new FileWriter(archivo);
                             bw= new BufferedWriter (w);
                             wr= new PrintWriter(bw);
                             //escritura de archivo
                             wr.write("    ______                   _______        _ "+"\r\n");
                             wr.write("   |  ____|                 |__   __|      | |"+"\r\n");
                             wr.write("   | |__ ___ _ __ _ __ ___     | | ___   __| | ___"+"\r\n");
                             wr.write("   |  __/ _ \\ '__| '__/ _ \\    | |/ _ \\ / _` |/ _ \\"+"\r\n");
                             wr.write("   | | |  __/ |  | | |  __/    | | (_) | (_| | (_) |"+"\r\n");
                             wr.write("   |_|  \\___|_|  |_|  \\___|    |_|\\___/ \\__,_|\\___/ "+"\r\n\r\n");
                             wr.write("                Ferre Todo, S.A. de C.V. \r\n");
                             wr.write("               AV. UNZUETA SALVADOR AGRAZ\r\n");
                             wr.write("                       Canela #101\r\n");
                             wr.write("                  Col. Granjas México\r\n");
                             wr.write("                       Iztacalco\r\n");
                             wr.write("                       México D.F.\r\n");
                             wr.write("                  México          05300\r\n\r\n");
                             wr.write("Venta Normal:                               $ ");
                             wr.write(Double.toString(total_venta));
                             wr.write("\r\n****************************************************\r\n");
                             wr.write("Producto      	     Precio      	     Cantidad\r\n\r\n");//descripcion de los productos (carrito)
                             int row=mi_modelo.getRowCount(); //cuantas filas hay en el carrito
                             for(int i=0;i<rows;i++)  //recorre fila por fila 
                               {
                                String producto=TablaProductos2.getValueAt(i,0 ).toString(); 
                                String precio=TablaProductos2.getValueAt(i, 1).toString();
                                String cantidad = TablaProductos2.getValueAt(i, 2).toString();
                                
                                wr.write(""+producto+"      	     $"+precio+"      	                "+cantidad+"\r\n");
                                
                                Double sub=( Double.parseDouble(precio) ) * (  Double.parseDouble(cantidad) );
                                 wr.write("\r\n 		                    Subtotal: $"+sub+"\r\n\r\n");
                               } 
                             wr.write("Total: $ ");
                             wr.write(Double.toString(total_venta));
                             wr.write("    MX M.N.");
                             wr.write("\r\n****************************************************\r\n");
                             wr.write("Le atendio:                            "+mi_usuario+".\r\n");
                             //fecha
                             Calendar c = Calendar.getInstance();
                             String dia = Integer.toString(c.get(Calendar.DATE));
                             String mes = Integer.toString(c.get(Calendar.MONTH));
                             String annio = Integer.toString(c.get(Calendar.YEAR));
                             String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
                             String minutos = Integer.toString( c.get(Calendar.MINUTE));
                             String segundos = Integer.toString(c.get(Calendar.SECOND));
                             wr.write("         "+dia+"/"+mes+"/"+annio+"             ");
                             wr.write(""+hora+":"+minutos+":"+segundos+"\r\n\r\n");
                             wr.write("         Pago hecho en una sola exibición\r\n\r\n");
                             wr.write("       GRACIAS POR SU COMPRA, VUELVA PRONTO!!\r\n");
                             wr.write("----------------------------------------------------\r\n");
                             //cerrar archivo
                             wr.close();
                             bw.close();
                         }
                            catch(IOException e)
                            {
                                  System.err.println("No se creo el archivo");
                            }
                   
                if(bandera)     
                {JOptionPane.showMessageDialog(this, "Venta realizada con exito");
                
                
                     int resp = JOptionPane.showConfirmDialog(null, "¿Requiere Factura?", "Alerta!", JOptionPane.YES_NO_OPTION);
                     if (resp==JOptionPane.OK_OPTION)
                     {
                        
                        dispose();
                        Facturacion_vende factura= new Facturacion_vende();
                        
                        factura.ejecutarf();
                                }
                
                }
             //elimina tabla  para nueva venta
          
                 for(int i=0;i<rows;i++)  //borra una por una 
                   mi_modelo.removeRow(0);
              }
                 total();//actualiza total
           
       }
       else
           JOptionPane.showMessageDialog(null,"Para concretar venta debe haber productos en el carrito");
    }//GEN-LAST:event_CompletarActionPerformed

    public void mostrar() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Completar;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTable TablaProductos2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JLabel user_label;
    // End of variables declaration//GEN-END:variables

    private String JLabel(String estas_seguro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

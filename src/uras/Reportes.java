package uras;

import ClaseConectar.ConexionBD;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Reportes extends javax.swing.JFrame {
    
 double total_venta;
double total_venta1;
ConexionBD cc = new ConexionBD();
Connection cn =cc.abrir_conexion();
    

    public Reportes() {
        initComponents();
        
        
        
        ((JPanel)getContentPane()).setOpaque(false);//empieza codigo fondo amarillo
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
         setLocationRelativeTo(null);
    mostrardatos();
    mostrardatos1(""); 
    total();
    total1();
    sumaTotal();
    
    }
//////////////////////////////////
 
        void sumaTotal()
          {
            double suma=0;
            suma=Double.parseDouble(total1.getText())+Double.parseDouble(total3.getText());
            System.out.println(suma);
            totalidad.setText(Double.toString(suma));
          }
    
     void mostrardatos()
        {
            String VendedorMatutino="Matutino";
            
            try 
        {
            String sql="SELECT nombre FROM AdminUsu WHERE turno='Matutino' && tipo_usu='Vendedor'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
               jLabelMatutino.setText(rs.getString("nombre"));
               VendedorMatutino = rs.getString("nombre");
            }
        } 
        catch (Exception e) 
        {
            System.err.println("Error al obtener vendedor: "+e.getMessage());
        }
            
            DefaultTableModel modelo= new DefaultTableModel() //tabla ineditable
                {
                    public boolean isCellEditable(int row, int column) 
                    {return false;}
                };
            
                    modelo.addColumn("producto");
                    modelo.addColumn("precio");
                    modelo.addColumn("cantidad");
                    modelo.addColumn("total");
                    modelo.addColumn("VENDEDOR");
    
    String sql= "";
            
            sql="SELECT * FROM ventas_productos WHERE vendedor='"+VendedorMatutino+"' ";//obtener usuario actual
     String []datos = new String [5];
        try {
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
              {
                datos[0]=rs.getString(2);
                datos[1]=rs.getString(3);
                datos[2]=rs.getString(4);
                datos[3]=rs.getString(5);
                datos[4]=rs.getString(6);
             
                
                modelo.addRow(datos);
              }
                     TablaProductos.setModel(modelo);
                     
            } 
                catch (SQLException ex) 
                {
                     Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
     

void mostrardatos1(String valor) //Vespertino
    {
    
    String VendedorVespertino="";
        try 
        {
            String sql="SELECT nombre FROM AdminUsu WHERE turno='Vespertino' && tipo_usu='Vendedor'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
               jLabelVespertino.setText(rs.getString("nombre"));
               VendedorVespertino = rs.getString("nombre");
            }
        } 
        catch (Exception e) 
        {
            System.err.println("Error al obtener vendedor: "+e.getMessage());
        }
        
        
    DefaultTableModel modelo2= new DefaultTableModel() //tabla ineditable
    {
      public boolean isCellEditable(int row, int column) 
      {return false;}
    };
                    modelo2.addColumn("producto");
                    modelo2.addColumn("precio");
                    modelo2.addColumn("cantidad");
                    modelo2.addColumn("total");
                    modelo2.addColumn("VENDEDOR");
    
    String sql= "";
     sql="SELECT * FROM ventas_productos WHERE vendedor='"+VendedorVespertino+"' ";// mostrar vendedor 2 actual
     String []datos = new String [5];
        try {
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(2);
                datos[1]=rs.getString(3);
                datos[2]=rs.getString(4);
                datos[3]=rs.getString(5);
                datos[4]=rs.getString(6);
                modelo2.addRow(datos);
            }
              TablaProductos2.setModel(modelo2); 
    
        } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
 void total() //cuenta total
    {
       try
       { 
        int rows=TablaProductos.getRowCount();
        double miTotal=0.0,miTotal1=0.0,val1,val2;
          for(int i=0;i<rows;i++) 
          {
              val1=Double.parseDouble(String.valueOf(TablaProductos.getValueAt(i,2)));
               val2=Double.parseDouble(String.valueOf(TablaProductos.getValueAt(i,3)));

            miTotal= miTotal +  val1; 
            miTotal1= miTotal1+ val2;
          }
          total.setText(Double.toString(miTotal));
          total1.setText(Double.toString(miTotal1));
          total_venta=miTotal;
       }
        catch (Exception e) 
        { total.setText("0");}
    }
 
 void total1() //cuenta total
    {
       try
       { 
        int rows=TablaProductos2.getRowCount();
        double miTotal=0.0,miTotal1=0.0, val1,val2 = 0;
          for(int i=0;i<rows;i++) 
          {
              val1=Double.parseDouble(String.valueOf(TablaProductos2.getValueAt(i,2)));
              val2=Double.parseDouble(String.valueOf(TablaProductos2.getValueAt(i,3)));
              

            miTotal= miTotal +  val1; 
            miTotal1= miTotal1 +  val2; 
          }
          total2.setText(Double.toString(miTotal));
          total3.setText(Double.toString(miTotal1));
          total_venta1=miTotal;
       }
        catch (Exception e) 
        { total2.setText("0");}
    }
  
    
    
    
    
///////////////////////////////////////////////////////////    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaProductos2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();
        total3 = new javax.swing.JLabel();
        totalidad = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        jLabelMatutino = new javax.swing.JLabel();
        jLabelVespertino = new javax.swing.JLabel();
        jButtonReporteInvitado = new javax.swing.JButton();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reporte de ventas2.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reporte de ventas:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ventas Vendedor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ventas Vendedor:");

        TablaProductos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Vendidos"
            }
        ));
        TablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaProductos);

        TablaProductos2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TablaProductos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Vendidos"
            }
        ));
        TablaProductos2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TablaProductos2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOTAL");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("VENTAS TOTALES");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton1.setText("Generar archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton2.setText("Restablecer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("frerfe");

        total2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        total2.setForeground(new java.awt.Color(255, 255, 255));
        total2.setText("jLabel9");

        total3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        total3.setForeground(new java.awt.Color(255, 255, 255));
        total3.setText("jLabel10");

        totalidad.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        totalidad.setForeground(new java.awt.Color(255, 255, 255));
        totalidad.setText("jLabel11");

        total1.setBackground(new java.awt.Color(0, 0, 0));
        total1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        total1.setForeground(new java.awt.Color(255, 255, 255));
        total1.setText("total");

        jLabelMatutino.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMatutino.setText("Matutino");

        jLabelVespertino.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVespertino.setText("Vespertino");

        jButtonReporteInvitado.setText("Reporte Ventas Invitados");
        jButtonReporteInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReporteInvitadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(31, 31, 31)
                                        .addComponent(totalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonReporteInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addGap(51, 51, 51))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(138, 138, 138)
                                        .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabelMatutino))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelVespertino))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(240, 240, 240)
                                                .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(111, 111, 111)
                                                .addComponent(total3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelMatutino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(total)
                    .addComponent(total1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelVespertino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(total2)
                    .addComponent(total3))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalidad)
                    .addComponent(jButtonReporteInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                      int r1=TablaProductos.getRowCount();
                             int r2=TablaProductos2.getRowCount();
                if(r1==0&&r2==0)
                    JOptionPane.showMessageDialog(this, "No puede restablecer tablas vacias");
                else
                {
        Calendar c = Calendar.getInstance();
                             String dia = Integer.toString(c.get(Calendar.DATE));
                             String mes = Integer.toString(c.get(Calendar.MONTH));
                             String annio = Integer.toString(c.get(Calendar.YEAR));
                             String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
                             String minutos = Integer.toString( c.get(Calendar.MINUTE));
                             String segundos = Integer.toString(c.get(Calendar.SECOND));
                        String folios;
                        folios = dia+"-"+mes+"-"+annio;
                        File archivo;
                       FileWriter w;
                       BufferedWriter bw;
                       PrintWriter wr;
                       try
                         {     
                             archivo= new File("C:\\Users\\Iram Moncada\\Desktop\\reporte_"+folios+".doc");
            if(archivo.exists())
        try {
            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("Estas seguro??"));
            int result = JOptionPane.showConfirmDialog(null, myPanel,//caja de confirmacion de que los valores correctos
            ("Se borraran todos los datos contenidos en ventas!"), JOptionPane.YES_NO_OPTION);
             if (result == JOptionPane.YES_OPTION) 
                    {
                    PreparedStatement pst= cn.prepareStatement("DELETE FROM ventas_productos");
                    pst.executeUpdate();
                     total.setText("");
                     total1.setText("");
                    total2.setText("");
                    total3.setText("");
                    totalidad.setText("");
                    JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente!");
                    }
                        mostrardatos();
                        mostrardatos1("");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Error");
        }
        else
          JOptionPane.showMessageDialog(this, "No ha hecho un reporte, por lo que no se pueden reestablecer las ventas");
            
                         }catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Error");
        }
                }
              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             dispose();
             Wadmin1 admin= new Wadmin1();
               admin.ejecutar();    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                            int r1=TablaProductos.getRowCount();
                             int r2=TablaProductos2.getRowCount();
                if(r1!=0||r2!=0)
                {
                       Calendar c = Calendar.getInstance();
                             String dia = Integer.toString(c.get(Calendar.DATE));
                             String mes = Integer.toString(c.get(Calendar.MONTH));
                             String annio = Integer.toString(c.get(Calendar.YEAR));
                             String hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
                             String minutos = Integer.toString( c.get(Calendar.MINUTE));
                             String segundos = Integer.toString(c.get(Calendar.SECOND));
                        String folios;
                        folios = dia+"-"+mes+"-"+annio;
                        File archivo;
                       FileWriter w;
                       BufferedWriter bw;
                       PrintWriter wr;
                       try
                         {     
                             archivo= new File("C:\\Users\\Iram Moncada\\Desktop\\reporte_"+folios+".doc");
                             if(archivo.exists())
                                JOptionPane.showMessageDialog(this, "Ya existe reporte de hoy, máximo uno por dia!!"); 
                             else
                                 {
                                     if(archivo.createNewFile())
                                 JOptionPane.showMessageDialog(this, "Se genero reporte!");   
                                  else
                                  JOptionPane.showMessageDialog(this, "No se genero reporte!");
                                 }
                           
                             w= new FileWriter(archivo);
                             bw= new BufferedWriter (w);
                             wr= new PrintWriter(bw);
                             
                            
                             
                             wr.write(""+dia+"/"+mes+"/"+annio+"             ");
                             wr.write(""+hora+":"+minutos+":"+segundos+"\r\n\r\n");
                              wr.write("    ______                   _______        _ "+"\r\n");
                             wr.write("   |  ____|                 |__   __|      | |"+"\r\n");
                             wr.write("   | |__ ___ _ __ _ __ ___     | | ___   __| | ___"+"\r\n");
                             wr.write("   |  __/ _ \\ '__| '__/ _ \\    | |/ _ \\ / _` |/ _ \\"+"\r\n");
                             wr.write("   | | |  __/ |  | | |  __/    | | (_) | (_| | (_) |"+"\r\n");
                             wr.write("   |_|  \\___|_|  |_|  \\___|    |_|\\___/ \\__,_|\\___/ "+"\r\n\r\n");
                             wr.write("REPORTE DE VENTAS  "+folios+" \r\n\r\n");
                             wr.write("Vendedor: Aaron Unzueta Chavez"+"\r\n\r\n");
                             wr.write("Producto      	     Precio       Cantidad       Total\r\n\r\n");
                             
                              int rows=TablaProductos.getRowCount(); //cuantas filas hay en el carrito
                             for(int i=0;i<rows;i++)  //recorre fila por fila 
                               {
                                String producto=TablaProductos.getValueAt(i,0 ).toString(); 
                                String precio=TablaProductos.getValueAt(i, 1).toString();
                                String cantidad = TablaProductos.getValueAt(i, 2).toString();
                                String total = TablaProductos.getValueAt(i, 3).toString();
                                wr.write(""+producto+"      	     $"+precio+"      	 "+cantidad+"         $"+total+"\r\n");
                                
                                
                                }
                             wr.write("\r\nTotal                          \t"+total.getText()+ "        "+total1.getText());
                             wr.write("\r\n\r\nVendedor: Carlos Alberto Reyes Cortes"+"\r\n\r\n");
                             wr.write("Producto      	     Precio       Cantidad     Total\r\n\r\n");
                              int rows1=TablaProductos2.getRowCount(); //cuantas filas hay en el carrito
                             for(int i=0;i<rows1;i++)  //recorre fila por fila 
                               {
                                String producto=TablaProductos2.getValueAt(i,0 ).toString(); 
                                String precio=TablaProductos2.getValueAt(i, 1).toString();
                                String cantidad = TablaProductos2.getValueAt(i, 2).toString();
                                String total = TablaProductos2.getValueAt(i, 3).toString();
                                wr.write(""+producto+"      	     $"+precio+"      	 "+cantidad+"         $"+total+"\r\n");
                                }
                             wr.write("\r\nTotal                          \t"+total2.getText()+ "        $"+total3.getText());
                             double suma=0;
                             suma=Double.parseDouble(total1.getText())+Double.parseDouble(total3.getText());
                               System.out.println(suma);
                             wr.write ("\r\n\r\n\r\n Total de ventas: $"+suma);
                             wr.close();
                             bw.close();
                         }
                       catch(IOException e)
                                {
                                     System.err.println("No se creo el archivo");
                                }
                }
                else
                    JOptionPane.showMessageDialog(null,"Tablas vacias, no puede generar reporte");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonReporteInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReporteInvitadoActionPerformed
        dispose();
        ReporteVentaInvitado reporIn = new ReporteVentaInvitado();
        reporIn.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonReporteInvitadoActionPerformed

 
    public void ejecutar() {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTable TablaProductos2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonReporteInvitado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMatutino;
    public static javax.swing.JLabel jLabelVespertino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total1;
    private javax.swing.JLabel total2;
    private javax.swing.JLabel total3;
    private javax.swing.JLabel totalidad;
    // End of variables declaration//GEN-END:variables
}

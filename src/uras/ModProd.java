package uras;

import ClaseConectar.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ModProd extends javax.swing.JFrame {

    
    
  public static String ubicacion=null;
  public static Boolean ubi=false;
  ConexionBD cc = new ConexionBD();
    Connection cn=cc.abrir_conexion();

    public ModProd() {
        initComponents();
         setLocationRelativeTo(null);
          ((JPanel)getContentPane()).setOpaque(false);
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
         mostrardatos("");
         
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        btnactualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cantiF = new javax.swing.JTextField();
        productF = new javax.swing.JTextField();
        precioF = new javax.swing.JTextField();
        AgregarBoton = new javax.swing.JButton();
        jBotBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Lista_proveedores = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Producto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificación de Productos");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos.setComponentPopupMenu(jPopupMenu1);
        TablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaProductos);
        if (TablaProductos.getColumnModel().getColumnCount() > 0) {
            TablaProductos.getColumnModel().getColumn(0).setResizable(false);
            TablaProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        btnactualizar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cantiF.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        productF.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        precioF.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        precioF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioFActionPerformed(evt);
            }
        });

        AgregarBoton.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        AgregarBoton.setText("Agregar");
        AgregarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBotonActionPerformed(evt);
            }
        });

        jBotBuscar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jBotBuscar.setText("Buscar");
        jBotBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotBuscarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton1.setText("Mostrar Todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Producto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("NOTA:  Para modificar un producto dar doble\n              click  a la casilla que desea modificar,\n              cambiar los valores, oprimir la tecla\n              ENTER, y presionar el botón\n                   ACTUALIZAR.\n");
        jScrollPane2.setViewportView(jTextArea1);

        Lista_proveedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        Lista_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_proveedoresActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selecccione Proveedor");

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jToggleButton1.setText("Eliminar producto");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton3.setText("Seleccionar ubicación");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(17, 17, 17)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBotBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Lista_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(precioF)
                                                        .addComponent(productF)
                                                        .addComponent(cantiF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel8)
                                                .addGap(61, 61, 61)
                                                .addComponent(AgregarBoton)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(28, 28, 28)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(323, 323, 323))))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBotBuscar)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantiF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lista_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel8)
                    .addComponent(AgregarBoton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ubicacion=null;
      jLabel8.setText("");
        dispose();        
        Wadmin1 modif= new Wadmin1();
        modif.ejecutar();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try {
            
            int fila= TablaProductos.getSelectedRow();
            if(fila>=0){
      
        
               PreparedStatement pst=cn.prepareStatement("UPDATE productos SET nombre='"+TablaProductos.getValueAt(fila, 0)+"',precio='"+TablaProductos.getValueAt(fila, 1)+"',cantidad='"+TablaProductos.getValueAt(fila, 2)+"' WHERE nombre='"+TablaProductos.getValueAt(fila, 0)+"'");
                pst.executeUpdate();
                mostrardatos("");
    
    }
              
        } catch (Exception e) {
            System.out.println(e.getMessage());   
        }
        JOptionPane.showMessageDialog(this,"Actualizado con exito!");
            productF.setText("");
      precioF.setText("");
      cantiF.setText("");
      
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void AgregarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBotonActionPerformed
if (Lista_proveedores.getSelectedIndex()>0 && ubi==true)  {    
    try{    
      AgregarDatos();
      JOptionPane.showMessageDialog(this,"Producto agregado con exito!");
      ubicacion=null;
      jLabel8.setText("");
      productF.setText("");
      precioF.setText("");
      cantiF.setText("");
}
catch(Exception e){
    JOptionPane.showMessageDialog(this,"Uno o mas campos vacios");
}}
    else
    JOptionPane.showMessageDialog(null, "Uno o mas campos vacios");
    }//GEN-LAST:event_AgregarBotonActionPerformed

    private void jBotBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotBuscarActionPerformed
        mostrardatos(txtBuscar.getText());//mostrara solo las coincidencias 
    }//GEN-LAST:event_jBotBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add yozur handling code here:
       try { 
        int fila = TablaProductos.getSelectedRow();
        String id ="";
        
        id=TablaProductos.getValueAt(fila, 0).toString();
            
           PreparedStatement pst= cn.prepareStatement("DELETE FROM productos WHERE id='"+id+"'");
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente!");
           mostrardatos("");
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(this, "No ha seleccionado un item");
         }   
 
    }//GEN-LAST:event_EliminarActionPerformed

    private void precioFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFActionPerformed

    private void Lista_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_proveedoresActionPerformed
      
    }//GEN-LAST:event_Lista_proveedoresActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        JPanel mypanel = new JPanel();
      mypanel.add(new JLabel("Estas seguro?"));
      int result= JOptionPane.showConfirmDialog(null, mypanel,("l"),JOptionPane.YES_NO_OPTION);
      
      if(result == JOptionPane.OK_OPTION)
      {
        try { 
        int fila = TablaProductos.getSelectedRow();
        String nombre=TablaProductos.getValueAt(fila, 0).toString();
           PreparedStatement pst= cn.prepareStatement("DELETE FROM productos WHERE nombre='"+nombre+"'");
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente!");
           mostrardatos("");
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(this, "No ha seleccionado un item");
         }   
      }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ubicacion estantes = new ubicacion();
        estantes.ejecutar();
    }//GEN-LAST:event_jButton3ActionPerformed

    void AgregarDatos(){
        try {
            PreparedStatement pst= cn.prepareStatement("INSERT INTO productos (nombre,precio,cantidad,ubicacion,id_proveedores) VALUES(?,?,?,?,?)");
            
      
                pst.setString(1,productF.getText());
               pst.setString(2,precioF.getText());
               pst.setString(3,cantiF.getText()); 
                pst.setString(4, ubicacion);
                int aux = Lista_proveedores.getSelectedIndex();
                String pepe = Integer.toString(aux);
                pst.setString(5, pepe );
                pst.executeUpdate();
                mostrardatos("");
        } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);}
    }
   
    
    
   public int mostrardatos(String valor){
      
       JComboBox MiComboBox = new JComboBox(); 
int perro=0;
       jLabel8.setText(ubicacion);
try{
    Statement stat = cn.createStatement();
    ResultSet rs = stat.executeQuery (
"SELECT nombre FROM proveedores");
    String []lista = new String [2];
    while (rs.next()){
       
        
        Lista_proveedores.addItem(rs.getObject("nombre"));
         perro = Lista_proveedores.getSelectedIndex();
     
    }
    

    
    
}
catch (SQLException e){
    System.out.println (e);

}
    DefaultTableModel modelo= new DefaultTableModel(){
        public boolean isCellEditable(int row, int column){
            return true;
        }
    
    };
    modelo.addColumn("PRODUCTO");
     modelo.addColumn("PRECIO");
    modelo.addColumn("CANTIDAD");

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
        
        return perro;
   }
 
    public void ejecutar() {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
                 
                new ModProd().setVisible(true);
   
         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBoton;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JComboBox Lista_proveedores;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JTextField cantiF;
    private javax.swing.JButton jBotBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static final javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField precioF;
    private javax.swing.JTextField productF;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
   
}

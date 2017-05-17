package uras;

import ClaseConectar.ConexionBD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class proveedores extends javax.swing.JFrame {
    
    ConexionBD cc = new ConexionBD();
Connection cn =cc.abrir_conexion();
    
    public proveedores() {
        initComponents();
         setLocationRelativeTo(null);
        ((JPanel)getContentPane()).setOpaque(false);//empieza codigo fondo amarillo
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
            mostrardatos("");
    }
  
     void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel(){
        public boolean isCellEditable(int row, int column){
          
        if(column!=0)
            return true;
        else return false;
        }
    
    };
    modelo.addColumn("ID");
    modelo.addColumn("NOMBRE");
     modelo.addColumn("DIRECCION");
    modelo.addColumn("PAIS");
      modelo.addColumn("TELEFONO");
        modelo.addColumn("E-MAIL");
        
    TablaProveedores.setModel(modelo);
    String sql="";
   
        sql="SELECT * FROM proveedores";
 
 
    String []datos = new String [6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                
                modelo.addRow(datos);
            }
            TablaProveedores.setModel(modelo);
            TablaProveedores.getColumnModel().getColumn(0).setPreferredWidth(0);
            TablaProveedores.getColumnModel().getColumn(0).setMinWidth(0);
            TablaProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
            
            TablaProveedores.getColumnModel().getColumn(1).setPreferredWidth(150);
            TablaProveedores.getColumnModel().getColumn(1).setMinWidth(150);
            TablaProveedores.getColumnModel().getColumn(1).setMaxWidth(150);
            
            TablaProveedores.getColumnModel().getColumn(2).setPreferredWidth(170);
            TablaProveedores.getColumnModel().getColumn(2).setMinWidth(170);
            TablaProveedores.getColumnModel().getColumn(2).setMaxWidth(170);
            
            TablaProveedores.getColumnModel().getColumn(3).setPreferredWidth(60);
            TablaProveedores.getColumnModel().getColumn(3).setMinWidth(60);
            TablaProveedores.getColumnModel().getColumn(3).setMaxWidth(60);
            
            TablaProveedores.getColumnModel().getColumn(4).setPreferredWidth(80);
            TablaProveedores.getColumnModel().getColumn(4).setMinWidth(80);
            TablaProveedores.getColumnModel().getColumn(4).setMaxWidth(80);
            
        } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProveedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Cnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cdir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cest = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Ctel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cmail = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaProveedores.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Estado", "Telefono", "E-mail"
            }
        ));
        TablaProveedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaProveedores);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE PROVEEDORES");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualizar Proveedor");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("NOTAS:\n1.- Para eliminar un proveedor\ndar click en el proveedor a eliminar \ny depués dar click en Eliminar \nProveedor.\n\n2.- Para modificar un proveedor\n    dar doble click la casilla\n    que desea modificar, cambiar\n    los valores, oprimir la tecla\n    ENTER, y presionar el botón\n    ACTUALIZAR para cada proveedor.\n\n3.- Para agregar un proveedor\n     llene los campos de la izquierda \n     <-- y dar click en actualizar.");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Nombre");

        Cnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnomActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail");

        jButton4.setText("Eliminar Proveedor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Cnom)
                                            .addComponent(Cdir)
                                            .addComponent(Cest)
                                            .addComponent(Ctel)
                                            .addComponent(Cmail, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Cnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Cdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Cest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Ctel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Cmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
            
            int fila= TablaProveedores.getSelectedRow();
            if(fila>=0)
              {
                  String t0=(String) TablaProveedores.getValueAt(fila, 0);
                   String t1=(String) TablaProveedores.getValueAt(fila, 1);
                    String t2=(String) TablaProveedores.getValueAt(fila, 2);
                     String t3=(String) TablaProveedores.getValueAt(fila, 3);
                      String t4=(String) TablaProveedores.getValueAt(fila, 4);
                       String t5=(String) TablaProveedores.getValueAt(fila, 5);
                  
               String SQL="UPDATE proveedores SET nombre=?,direccion=?,estado=?,telefono=?,email=? WHERE id_proveedores=?";
                PreparedStatement stmt=cn.prepareStatement(SQL);
                stmt.setString(1,t1);
                stmt.setString(2,t2);
                stmt.setString(3,t3);
                stmt.setString(4,t4);
                stmt.setString(5,t5);
                stmt.setString(6,t0);
                stmt.executeUpdate();
                  mostrardatos("");
                JOptionPane.showMessageDialog(this,"Actualizado con exito!");
              }
            } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);}
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnomActionPerformed

    void AgregarDatos()
    {           
        try {
            PreparedStatement pst= cn.prepareStatement("INSERT INTO proveedores (id_proveedores,nombre,direccion,estado,telefono,email) VALUES(?,?,?,?,?,?)");
            
             pst.setString(1,null);
                pst.setString(2,Cnom.getText());
               pst.setString(3,Cdir.getText());
               pst.setString(4,Cest.getText());
               pst.setString(5,Ctel.getText());
               pst.setString(6,Cmail.getText()); 
         pst.executeUpdate();
                mostrardatos("");
        } catch (SQLException ex) {
            Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public static boolean isnumber(String cadena) //metodo que valida numeros
    {
       try { Long.parseLong(cadena);}
       catch(Exception e){return false;}
       return true;
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JPanel mypanel = new JPanel();
      mypanel.add(new JLabel("Estas seguro?"));
      int result= JOptionPane.showConfirmDialog(null, mypanel,("l"),JOptionPane.YES_NO_OPTION);
      
      if(result == JOptionPane.OK_OPTION)
         {
                     int t1 = Cnom.getText().length();
                     int t2 = Cdir.getText().length();
                     int t3 = Cest.getText().length();
                     int t4 = Ctel.getText().length();
                     int t5 = Cmail.getText().length();
                     String tt4 = Ctel.getText();
              
           if(t1==0||t2==0||t3==0||t4==0||t5==0)//si uno o mas estan vacios
               JOptionPane.showMessageDialog(this,"Uno o mas campos vacios");
           else{    if(isnumber(tt4))
                        {
                      AgregarDatos();
                      JOptionPane.showMessageDialog(this,"Producto agregado con exito!");
                      Cnom.setText("");
                      Cdir.setText("");
                      Cest.setText("");
                      Ctel.setText("");
                      Cmail.setText("");
                        }
                      else
                        JOptionPane.showMessageDialog(this,"El campo telefono solo puede contener numeros!");
               }
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JPanel mypanel = new JPanel();
      mypanel.add(new JLabel("Estas seguro?"));
      int result= JOptionPane.showConfirmDialog(null, mypanel,("l"),JOptionPane.YES_NO_OPTION);
      
      if(result == JOptionPane.OK_OPTION)
      {
          try { 
                    int fila = TablaProveedores.getSelectedRow();
                    String id ="";

                    id=TablaProveedores.getValueAt(fila, 0).toString();
    
                       PreparedStatement pst= cn.prepareStatement("DELETE FROM proveedores WHERE id_proveedores='"+id+"'");
                       pst.executeUpdate();
 
                       JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente!");
                       mostrardatos("");
        } catch (Exception e) { System.out.println(e);
            JOptionPane.showMessageDialog(this, "Error");
         }   
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void ejecutar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cdir;
    private javax.swing.JTextField Cest;
    private javax.swing.JTextField Cmail;
    private javax.swing.JTextField Cnom;
    private javax.swing.JTextField Ctel;
    private javax.swing.JTable TablaProveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

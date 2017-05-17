package uras;

import ClaseConectar.ConexionBD;
import java.sql.*;
import javax.swing.*;
import uras.InterVendedor;
import uras.RecuperarCuenta;
import uras.Welcome;


public class Wuser extends javax.swing.JFrame {
    //String User1="user1";
    //String User2="user2
    ConexionBD cc = new ConexionBD();
    Connection cn =cc.abrir_conexion();
    MD5_1 crypto = new MD5_1();
    
    void acceder(String usuario, String passEncriptada)
    {
        String sql="SELECT * FROM AdminUsu WHERE nick='"+usuario+"' && password='"+passEncriptada+"'";
        String vendedor="";
        String nombreVendedor="";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {                
                vendedor = rs.getString("tipo_usu");
                nombreVendedor = rs.getString("nombre");
            }
            
            InterVendedor ventana=new InterVendedor();
            //Wuser ventanaWuse=new Wuser();
            if (vendedor.equals("Vendedor"))
            {
                JOptionPane.showMessageDialog(null, "Datos validos");
                InterVendedor.mi_usuario= nombreVendedor;
                dispose();
                ventana.mostrar();
                
                //FIA proyecto final
            }
            else if(vendedor.equals("Vendedor Invitado"))
            {
                JOptionPane.showMessageDialog(null, "Bienvenido Invitado");
                InterVendedor.mi_usuario= nombreVendedor;
                dispose();
                ventana.mostrar();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Algo fallo");
            }
            
        } catch (Exception e)
        {
            System.err.println("Error al acceder: "+e.getMessage());
        }
              
    }

    public Wuser() 
    {
        initComponents();
        setLocationRelativeTo(null);
        
        ((JPanel)getContentPane()).setOpaque(false);//empieza codigo fondo amarillo
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        this.getRootPane().setDefaultButton(Enter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cancel = new javax.swing.JButton();
        Enter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jButtonRecuperarContraseña = new javax.swing.JButton();
        jLabelOlvido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cancel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Cancel.setText("Cancelar");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Enter.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        Enter.setText("Entrar");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        label1.setBackground(new java.awt.Color(51, 51, 51));
        label1.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("UPIICSA RESOURCE ADMINISTRATION SYSTEM");

        label2.setBackground(new java.awt.Color(51, 51, 51));
        label2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("EMPLEADO");

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButtonRecuperarContraseña.setText("Recuperar");
        jButtonRecuperarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecuperarContraseñaActionPerformed(evt);
            }
        });

        jLabelOlvido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOlvido.setText("¿Olvido Usuario o Contraseña?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOlvido)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButtonRecuperarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Enter)
                        .addGap(53, 53, 53)
                        .addComponent(Cancel)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelOlvido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRecuperarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Enter))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        
        dispose();
        Welcome miWelcome= new Welcome();
       
        miWelcome.ejecutar();

    }//GEN-LAST:event_CancelActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
    
       String usu=jTextField2.getText();
       String passNormal=new String(jPasswordField2.getPassword());
       String passEncriptada = crypto.Encriptar(passNormal);
        //md5 mimd5= new md5();
        //String pass=mimd5.getStringMessageDigest(pas);
        acceder(usu, passEncriptada);      
    }//GEN-LAST:event_EnterActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
     
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButtonRecuperarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecuperarContraseñaActionPerformed
        // TODO add your handling code here:
        dispose();
        RecuperarCuenta recupera=new RecuperarCuenta();
        recupera.llenarCombo("Vendedor","Vendedor Invitado");
        recupera.ObtenerEmail("Vendedor","Vendedor Invitado");
        recupera.setVisible(true);
    }//GEN-LAST:event_jButtonRecuperarContraseñaActionPerformed


    public void ejecutar() {
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
            java.util.logging.Logger.getLogger(Wuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Enter;
    private javax.swing.JButton jButtonRecuperarContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelOlvido;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}

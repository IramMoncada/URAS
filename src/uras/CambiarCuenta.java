package uras;
import ClaseConectar.ConexionBD;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CambiarCuenta extends javax.swing.JFrame {

    ConexionBD cc = new ConexionBD();
    Connection cn =cc.abrir_conexion();
    MD5_1 crypto=new MD5_1();
    
    public CambiarCuenta() {
         initComponents();
         setLocationRelativeTo(null);
         
         ((JPanel)getContentPane()).setOpaque(false);//empieza codigo fondo amarillo
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        llenarCombobox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNickNuevo = new javax.swing.JLabel();
        jPasswordFieldValidarNueva = new javax.swing.JPasswordField();
        jLabelPassActual = new javax.swing.JLabel();
        jLabelPassNuevo = new javax.swing.JLabel();
        jTextFieldNickNuevo = new javax.swing.JTextField();
        jButtonCambiar = new javax.swing.JButton();
        jTextFieldNickActual = new javax.swing.JTextField();
        jPasswordFieldNueva = new javax.swing.JPasswordField();
        jPasswordFieldActual = new javax.swing.JPasswordField();
        jLabelNickActual = new javax.swing.JLabel();
        jLabelPassNuevaValida = new javax.swing.JLabel();
        jComboBoxNombre = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNickNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNickNuevo.setText("Nick Nuevo:");

        jLabelPassActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassActual.setText("Password Actual:");

        jLabelPassNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassNuevo.setText("Password Nueva:");

        jButtonCambiar.setText("Validar");
        jButtonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarActionPerformed(evt);
            }
        });

        jLabelNickActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNickActual.setText("Nick Actual:");

        jLabelPassNuevaValida.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassNuevaValida.setText("Repite la Nueva Password:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassNuevaValida)
                            .addComponent(jLabelPassNuevo)
                            .addComponent(jLabelPassActual)
                            .addComponent(jLabelNickNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNickActual, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldNickActual, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(jTextFieldNickNuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPasswordFieldNueva)
                        .addComponent(jPasswordFieldValidarNueva)
                        .addComponent(jPasswordFieldActual)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabelNickActual, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNickNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNickNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassActual, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassNuevo)
                    .addComponent(jPasswordFieldNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassNuevaValida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldValidarNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNickActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarActionPerformed
        // TODO add your handling code here:
        String nickActual = jTextFieldNickActual.getText();
        String nickNuevo = jTextFieldNickNuevo.getText();
        
        String passActual =  new String(jPasswordFieldActual.getPassword());
        String passNueva = new String(jPasswordFieldNueva.getPassword());
        String passNuevaValidar = new String(jPasswordFieldValidarNueva.getPassword());
        
        String nickTemp="", passTemp=""; //passTemp igual a passActual
        
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nick,password FROM AdminUsu WHERE nombre='"+this.jComboBoxNombre.getSelectedItem()+"'");
            while(rs.next())
            {
                nickTemp = rs.getString("nick");
                passTemp = rs.getString("password");
            }
            passTemp = crypto.Desencriptar(passTemp);
        }
        catch (Exception e) 
        {
            System.err.println("Error al consultar nick y password: "+e.getMessage());
        }
        System.out.println("nick = "+nickTemp+"\nPassword = "+passTemp);
        
        //if( (this.jTextFieldNickActual.getText().equals(nickTemp)) && (String.valueOf(this.jPasswordFieldActual.getPassword()).equals(passTemp)) && (passNueva.equals(passNuevaValidar)) )
        if( (nickActual.equals(nickTemp)) && (passActual.equals(passTemp)) && (passNueva.equals(passNuevaValidar)) )
        {
            try 
            {
                PreparedStatement pst=cn.prepareStatement("UPDATE AdminUsu SET nick='"+nickNuevo+"'"
                        + ",password='"+crypto.Encriptar(passNueva)+"'"
                        + " WHERE nombre='"+this.jComboBoxNombre.getSelectedItem()+"'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "!Los cambios fueron exitosos¡");
                
            }
            catch (Exception e) 
            {
                System.out.println("Error al actualizar contraseña nueva: "+e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Un campo no coincide");
        }
        
    }//GEN-LAST:event_jButtonCambiarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
        Wadmin1 inter=new Wadmin1();
        inter.setVisible(true);
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarCuenta().setVisible(true);
            }
        });
    }
    
    public void llenarCombobox()
    {
        try 
        {  
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM AdminUsu WHERE tipo_usu='Vendedor' || tipo_usu='Vendedor Invitado' || tipo_usu='Administrador'");
            while(rs.next())
            {
                this.jComboBoxNombre.addItem(rs.getString("nombre"));
            }
        }
        catch (Exception e)
        {
            System.err.println("Error al llenar Combobox: "+e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNickActual;
    private javax.swing.JLabel jLabelNickNuevo;
    private javax.swing.JLabel jLabelPassActual;
    private javax.swing.JLabel jLabelPassNuevaValida;
    private javax.swing.JLabel jLabelPassNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldActual;
    private javax.swing.JPasswordField jPasswordFieldNueva;
    private javax.swing.JPasswordField jPasswordFieldValidarNueva;
    private javax.swing.JTextField jTextFieldNickActual;
    private javax.swing.JTextField jTextFieldNickNuevo;
    // End of variables declaration//GEN-END:variables
}

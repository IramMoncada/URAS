package uras;
import java.sql.*;
import ClaseConectar.ConexionBD;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.mail.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import uras.Wuser;
import uras.Wuser;

public class RecuperarCuenta extends javax.swing.JFrame {

    ConexionBD cc = new ConexionBD();
    Connection cn =cc.abrir_conexion();
    MD5_1 desencriptar=new MD5_1();
    String[] correos=new String[2];
    static String Username="luiixo0@gmail.com"; //correo de uras uras@hotmail.com
    static String PassWord=""; //password del correo de uras contraseñaURAS123
    static String Mensaje;
    String tipoUsu="";
    
    public RecuperarCuenta() {
        initComponents();
         setLocationRelativeTo(null);
         
         ((JPanel)getContentPane()).setOpaque(false);//empieza codigo fondo amarillo
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        //llenarCombo();
        //ObtenerEmail();
        //ObtenerNickyPassword();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxEmpleado = new javax.swing.JComboBox<String>();
        jLabelSelecciona = new javax.swing.JLabel();
        jButtonEnvair = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSelecciona.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSelecciona.setText("Selecciona tu nombre");

        jButtonEnvair.setText("Recuperar");
        jButtonEnvair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnvairActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabelSelecciona)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButtonEnvair)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSelecciona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnvair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnvairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnvairActionPerformed
     
        String emailEnviar="";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT email FROM AdminUsu WHERE nombre='"+String.valueOf(this.jComboBoxEmpleado.getSelectedItem())+"'");
            while (rs.next())
            {
                emailEnviar = rs.getString("email");
            }
            
            SendMail(emailEnviar);
            //ObtenerNickyPassword();
        }
        catch (Exception e)
        {
            System.out.println("Error al enviar Mensaje: "+e.getMessage());
        }
    }//GEN-LAST:event_jButtonEnvairActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
        Wuser user=new Wuser();
        user.setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RecuperarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarCuenta().setVisible(true);
            }
        });
    }
    
    public void llenarCombo(String tipoUsu, String UsuInvi)
    {
        String sql="SELECT nombre FROM AdminUsu WHERE tipo_usu='"+tipoUsu+"' || tipo_usu='"+UsuInvi+"'";
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next())
            {
                this.jComboBoxEmpleado.addItem(rs.getString("nombre"));
            }
        }
        catch (Exception e) 
        {
            System.err.println("Error al agegar ComboBox: "+e.getMessage());
        }
    }
    ///////////////////////////
    public void ObtenerEmail(String tipoUsuO, String UsuInvi)
    {
        String sql = "SELECT email FROM AdminUsu WHERE tipo_usu='"+tipoUsuO+"' || tipo_usu='"+UsuInvi+"'";
        int indexcorreo = 0;
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                correos[indexcorreo]=rs.getString("email");
                indexcorreo+=1;
            }
            
            System.out.println("Los Correos Son: ");
            for (int i = 0; i < indexcorreo; i++) 
            {
                System.out.println("Correo "+i+".- "+correos[i]);
            }
        } 
        catch (Exception e)
        {
            System.err.println("Error al obtener los Correos: "+e.getMessage());
        }
        
    }
    ////////////////////////
    
    
    public String ObtenerNickyPassword()
    {
        String obtnernick="", obtenerpassword="", passwordDesencriptado="", mensaje="";
        String sql="SELECT * FROM AdminUsu WHERE nombre='"+String.valueOf(this.jComboBoxEmpleado.getSelectedItem())+"'";
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next())
            {                
                obtnernick = rs.getString(8);
                obtenerpassword = rs.getString(9);
            }
            passwordDesencriptado = desencriptar.Desencriptar(obtenerpassword);
            System.out.println("El nick es: "+obtnernick+"\nPassword es: "+obtenerpassword+"\nPassword Desencriptada es: "+passwordDesencriptado);
            mensaje = "El nick es: "+obtnernick+"\nPassword es: "+passwordDesencriptado;
        }
        catch (Exception e) 
        {
            System.err.println("Error Texto Mensaje: "+e.getMessage());
        }
        return mensaje;
    }
    
    public void SendMail(String para) {
        
        String Subject = "Ferreteria URAS";
        String Mensage = "Hola soy URAS esta es tu información para entrar:\n"+ObtenerNickyPassword();
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Username, PassWord);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(para));
            message.setSubject(Subject);
            message.setText(Mensage);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null,"Error al enviar: "+e.getMessage());
            throw new RuntimeException(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnvair;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxEmpleado;
    private javax.swing.JLabel jLabelSelecciona;
    // End of variables declaration//GEN-END:variables
}

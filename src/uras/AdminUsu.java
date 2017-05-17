package uras;

import ClaseConectar.ConexionBD;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import uras.Wadmin1;
import uras.Wadmin1;

public class AdminUsu extends javax.swing.JFrame {
    
    MD5_1 md5=new MD5_1();
    
    ConexionBD cc = new ConexionBD();
    Connection cn =cc.abrir_conexion();
    public AdminUsu() {
         initComponents();
         setLocationRelativeTo(null);
         
         ((JPanel)getContentPane()).setOpaque(false);//empieza codigo fondo amarillo
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        Mostrar_Tabla_Usuarios();
        
        jPanelInvitado.setVisible(false);
        jComboBoxTipoUsu.setSelectedIndex(1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jPanelDireccion = new javax.swing.JPanel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelCalle = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelInterior = new javax.swing.JLabel();
        jLabelExt = new javax.swing.JLabel();
        jLabelColonia = new javax.swing.JLabel();
        jLabelDelega = new javax.swing.JLabel();
        jLabelCP = new javax.swing.JLabel();
        jTextFieldCP = new javax.swing.JTextField();
        jTextFieldCalle = new javax.swing.JTextField();
        jTextFieldExt = new javax.swing.JTextField();
        jTextFieldDelegacion = new javax.swing.JTextField();
        jTextFieldColonia = new javax.swing.JTextField();
        jTextFieldInt = new javax.swing.JTextField();
        jPanelDatos = new javax.swing.JPanel();
        jTextFieldApellidoMaterno = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelApePaterno = new javax.swing.JLabel();
        jTextFieldCOM = new javax.swing.JTextField();
        jLabelApeMaterno = new javax.swing.JLabel();
        jTextFieldApellidoPaterno = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jComboBoxTipoUsu = new javax.swing.JComboBox<String>();
        jLabelEmail = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox<String>();
        jLabelArroba = new javax.swing.JLabel();
        jLabelTipoUsu = new javax.swing.JLabel();
        jLabelTurno = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelRFCoCURP = new javax.swing.JLabel();
        jTextFieldFFCoCURP = new javax.swing.JTextField();
        jLabelDatos = new javax.swing.JLabel();
        jPanelInvitado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPeriodoFin1 = new javax.swing.JLabel();
        jDateChooserFin = new com.toedter.calendar.JDateChooser();
        jDateChooserInicio = new com.toedter.calendar.JDateChooser();
        jLabelPeriodoInicio1 = new javax.swing.JLabel();
        jButtonGuardarUsu = new javax.swing.JButton();
        jPanelNickyPass = new javax.swing.JPanel();
        jLabelNick = new javax.swing.JLabel();
        jTextFieldNick = new javax.swing.JTextField();
        jLabelPass = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelConfirmarPassword = new javax.swing.JLabel();
        jPasswordFieldPasswordRepetida = new javax.swing.JPasswordField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableUsuarios);

        jPanelDireccion.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelDireccion.setText("Dirección");

        jLabelCalle.setText("Calle:");

        jLabelNumero.setText("Número:");

        jLabelInterior.setText("Int:");

        jLabelExt.setText("Ext:");

        jLabelColonia.setText("Colonia:");

        jLabelDelega.setText("Delegación:");

        jLabelCP.setText("Código Postal:");

        jTextFieldCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCPKeyTyped(evt);
            }
        });

        jTextFieldExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldExtKeyTyped(evt);
            }
        });

        jTextFieldInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIntKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelDireccionLayout = new javax.swing.GroupLayout(jPanelDireccion);
        jPanelDireccion.setLayout(jPanelDireccionLayout);
        jPanelDireccionLayout.setHorizontalGroup(
            jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionLayout.createSequentialGroup()
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDireccionLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelDireccion))
                    .addGroup(jPanelDireccionLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelCalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDireccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNumero)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelInterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabelExt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldExt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDireccionLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelColonia)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDireccionLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelDelega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDelegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDireccionLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelDireccionLayout.setVerticalGroup(
            jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelDireccion)
                .addGap(17, 17, 17)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalle)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExt)
                    .addComponent(jLabelNumero)
                    .addComponent(jLabelInterior)
                    .addComponent(jTextFieldInt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldExt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelColonia)
                    .addComponent(jTextFieldColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDelega)
                    .addComponent(jTextFieldDelegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCP)
                    .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanelDatos.setBorder(new javax.swing.border.MatteBorder(null));

        jTextFieldApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoMaternoKeyTyped(evt);
            }
        });

        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jLabelNombre.setText("Nombre:");

        jLabelApePaterno.setText("Apellido Paterno:");

        jTextFieldCOM.setText("hotmail.com");

        jLabelApeMaterno.setText("Apellido Materno:");

        jTextFieldApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoPaternoKeyTyped(evt);
            }
        });

        jLabelTelefono.setText("Teléfono: ");

        jComboBoxTipoUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Vendedor Invitado", "Administrador" }));
        jComboBoxTipoUsu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoUsuItemStateChanged(evt);
            }
        });
        jComboBoxTipoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuActionPerformed(evt);
            }
        });

        jLabelEmail.setText("E-mail:");

        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matutino", "Vespertino" }));

        jLabelArroba.setText("@");

        jLabelTipoUsu.setText("Tipo Usuario:");

        jLabelTurno.setText("Turno:");

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabelRFCoCURP.setText("CURP:");

        jLabelDatos.setText("Datos");

        jPanelInvitado.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("Perido Invitado:");

        jLabelPeriodoFin1.setText("Fin:");

        jLabelPeriodoInicio1.setText("Inicio:");

        javax.swing.GroupLayout jPanelInvitadoLayout = new javax.swing.GroupLayout(jPanelInvitado);
        jPanelInvitado.setLayout(jPanelInvitadoLayout);
        jPanelInvitadoLayout.setHorizontalGroup(
            jPanelInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInvitadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelPeriodoInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabelPeriodoFin1)
                .addGap(18, 18, 18)
                .addComponent(jDateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanelInvitadoLayout.setVerticalGroup(
            jPanelInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInvitadoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanelInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeriodoFin1)
                    .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPeriodoInicio1)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDatos)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelRFCoCURP)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldFFCoCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabelApePaterno)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelApeMaterno)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabelTelefono)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabelArroba, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldCOM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelTipoUsu)
                                .addGap(12, 12, 12)
                                .addComponent(jComboBoxTipoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabelTurno)
                                .addGap(12, 12, 12)
                                .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelDatos)
                .addGap(6, 6, 6)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelRFCoCURP))
                    .addComponent(jTextFieldFFCoCURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelApePaterno))))
                .addGap(23, 23, 23)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApeMaterno)
                            .addComponent(jLabelTelefono))))
                .addGap(27, 27, 27)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelEmail))
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelArroba, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTipoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoUsu)
                            .addComponent(jLabelTurno))))
                .addGap(11, 11, 11)
                .addComponent(jPanelInvitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonGuardarUsu.setText("Guardar");
        jButtonGuardarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarUsuActionPerformed(evt);
            }
        });

        jPanelNickyPass.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelNick.setText("Nick:");

        jLabelPass.setText("Password:");

        jLabelConfirmarPassword.setText("Repetir la Password:");

        javax.swing.GroupLayout jPanelNickyPassLayout = new javax.swing.GroupLayout(jPanelNickyPass);
        jPanelNickyPass.setLayout(jPanelNickyPassLayout);
        jPanelNickyPassLayout.setHorizontalGroup(
            jPanelNickyPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNickyPassLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelNick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNick, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabelPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabelConfirmarPassword)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldPasswordRepetida, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNickyPassLayout.setVerticalGroup(
            jPanelNickyPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNickyPassLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelNickyPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNick)
                    .addComponent(jTextFieldNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPass)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfirmarPassword)
                    .addComponent(jPasswordFieldPasswordRepetida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
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
                .addGap(83, 83, 83)
                .addComponent(jButtonGuardarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNickyPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNickyPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonGuardarUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuActionPerformed
        
       if(evt.getSource() == jComboBoxTipoUsu)
       {
           JComboBox cb = (JComboBox)evt.getSource();
           String text = (String)cb.getSelectedItem();
           switch(text)
           {
               case "Vendedor": 
                   jPanelInvitado.setVisible(false);
                   jLabelTurno.setVisible(true);
                   jComboBoxTurno.setVisible(true);
                   jLabelRFCoCURP.setText("CURP:");
                   jPanelDireccion.setVisible(true);
                   jLabelTelefono.setVisible(true);
                   jTextFieldTelefono.setVisible(true);
                   VaciarCampos();
                break;
                
               case "Vendedor Invitado": 
                   jPanelInvitado.setVisible(true);
                   jLabelTurno.setVisible(true);
                   jComboBoxTurno.setVisible(true);
                   jLabelRFCoCURP.setText("CURP:");
                   jPanelDireccion.setVisible(true);
                   jLabelTelefono.setVisible(true);
                   jTextFieldTelefono.setVisible(true);
                   VaciarCampos();
                break;
                
               case "Administrador": 
                   jPanelInvitado.setVisible(false);
                   jLabelTurno.setVisible(false);
                   jComboBoxTurno.setVisible(false);
                   jLabelRFCoCURP.setText("CURP:");
                   jPanelDireccion.setVisible(false);
                   jLabelTelefono.setVisible(false);
                   jTextFieldTelefono.setVisible(false);
                   VaciarCampos();
                   break;
           }
       }
    }//GEN-LAST:event_jComboBoxTipoUsuActionPerformed

    private void jButtonGuardarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarUsuActionPerformed
        // TODO add your handling code here:
        String Direccion[] = new String[6];
        Direccion[0] = this.jTextFieldCalle.getText();
        Direccion[1] = this.jTextFieldExt.getText();
        Direccion[2] = this.jTextFieldInt.getText();
        Direccion[3] = this.jTextFieldColonia.getText();
        Direccion[4] = this.jTextFieldDelegacion.getText();
        Direccion[5] = this.jTextFieldCP.getText();
        
        String Direccio = "Calle "+Direccion[0] +", Ext#"+Direccion[1] + ", Int#"+Direccion[2] + " col. "+Direccion[3] + ", "+Direccion[4] + ", "+Direccion[5];
        System.out.println("Direccion = "+Direccio);
        
        String NombreCompleto[] = new String[3];
        NombreCompleto[0] = this.jTextFieldNombre.getText();
        NombreCompleto[1] = this.jTextFieldApellidoPaterno.getText();
        NombreCompleto[2] = this.jTextFieldApellidoMaterno.getText();
        
        String nombre = NombreCompleto[0]+" "+NombreCompleto[1]+" "+NombreCompleto[2];
        System.out.println("Nombre = "+nombre);
        
        String correo[] = new String[2];
        correo[0] = this.jTextFieldEmail.getText();
        correo[1] = this.jTextFieldCOM.getText();
        String email = correo[0]+"@"+correo[1];
        System.out.println("correo es: "+email);
        
        String PassOriginal = new String(jPasswordFieldPassword.getPassword());
        String PassConfirmar = new String(jPasswordFieldPasswordRepetida.getPassword());
        
        if(jTextFieldFFCoCURP.getText().equals("") || jTextFieldNombre.getText().equals("") || jTextFieldApellidoPaterno.getText().equals("") || jTextFieldTelefono.getText().equals("") || jTextFieldEmail.getText().equals("") || jTextFieldNick.getText().equals("") || jPasswordFieldPassword.getPassword().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Algun campo esta vacio");
        }
        else
        {
            if(this.jComboBoxTipoUsu.getSelectedItem().equals("Vendedor"))
            {
                try 
                {
                    String turno[]= new String[2];
                    int numeroVendedor=0;
                    Statement st=cn.createStatement();
                    ResultSet rs=st.executeQuery("SELECT turno FROM AdminUsu WHERE tipo_usu='Vendedor'");
                    while(rs.next())
                    {
                        turno[numeroVendedor] = rs.getString("turno");
                        numeroVendedor+=1;
                    }
                    if(numeroVendedor == 2)
                    {
                        JOptionPane.showMessageDialog(null, "Solo Puedes agregar dos Vendedores");

                    }
                    else 
                    {
                        //if(turno[0].equals("Matutino") || turno[0].equals("Vespertino"))
                        if(this.jComboBoxTurno.getSelectedItem().equals(turno[0]) || this.jComboBoxTurno.getSelectedItem().equals(turno[1]))
                        {
                            JOptionPane.showMessageDialog(null,"Ya tienes ese turno ocupado");
                        }
                        else
                        {
                        darAltaVendedor(PassOriginal, PassConfirmar, nombre, Direccio, email,null,null);
                        }
                    } 
                } 
                catch (Exception e)
                {
                    System.err.println("Error al agregar: "+e.getMessage());
                    JOptionPane.showMessageDialog(null,"Ocurrio un error: "+e.getMessage());
                }
            }
            else if(this.jComboBoxTipoUsu.getSelectedItem().equals("Vendedor Invitado"))//invitado
            {
                Date fechaInico = this.jDateChooserInicio.getDate();
                Date fechaFin = this.jDateChooserFin.getDate();
                
                if(fechaInico.after(fechaFin))
                {
                    JOptionPane.showMessageDialog(null, "¿Enserio termina de trabajar \"dias anteriores\"?");
                }
                else
                {
                    SimpleDateFormat formatoInico = new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat formatoFin = new SimpleDateFormat("yyyy-MM-dd");
                    System.out.println("Fecha inicio: "+formatoInico.format(fechaInico)+"\nFecha Fin: "+formatoFin.format(fechaFin));

                darAltaInvitado(PassOriginal, PassConfirmar, nombre, Direccio, email, formatoInico.format(fechaInico), formatoFin.format(fechaFin));
                }
                
            }
            else //Administrador es registrado
            {
                try 
                {
                    int numeroVendedor=0;
                    Statement st=cn.createStatement();
                    ResultSet rs=st.executeQuery("SELECT nombre FROM AdminUsu WHERE tipo_usu='Administrador'");
                    while(rs.next())
                    {
                        numeroVendedor+=1;
                    }
                    if(numeroVendedor == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Solo Puedes agregar un Administrador");

                    }
                    else 
                    {
                       AltaAdmin(PassOriginal, PassConfirmar, nombre, email);
                    } 
                } 
                catch (Exception e)
                {
                    System.err.println("Error al agregar: "+e.getMessage());
                    JOptionPane.showMessageDialog(null,"Ocurrio un error al dar de alta Administrador: "+e.getMessage());
                }

            }
        }
    }//GEN-LAST:event_jButtonGuardarUsuActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
        try 
        {
            int fila = jTableUsuarios.getSelectedRow();
            if(fila>=0)
            {
                PreparedStatement pst=cn.prepareStatement("UPDATE AdminUsu SET nombre='"+this.jTableUsuarios.getValueAt(fila, 1)+"'"
                        +",direccion='"+this.jTableUsuarios.getValueAt(fila, 2)+"'"
                        +",telefono='"+this.jTableUsuarios.getValueAt(fila, 3)+"'"
                        //+",tipo_usu='"+this.jTableUsuarios.getValueAt(fila, 4)+"'"
                        //+",turno='"+this.jTableUsuarios.getValueAt(fila, 5)+"'"
                        +",email='"+this.jTableUsuarios.getValueAt(fila, 6)+"'"
                        +"WHERE curp='"+this.jTableUsuarios.getValueAt(fila, 0)+"'");
               pst.executeUpdate();
               JOptionPane.showMessageDialog(null, "¡Actualización exitosa!");
               Mostrar_Tabla_Usuarios();
            }
        }
        catch (Exception e)
        {
            System.err.println("Error en actualizar Usuario: "+e.getMessage());  
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        try 
        {
            int fila = jTableUsuarios.getSelectedRow();
            //jTableUsuarios
            if(jTableUsuarios.getValueAt(fila, 4).equals("Administrador"))
            {   
                    JOptionPane.showMessageDialog(null, "No puedes eliminar al Administrador\no se acaba el negocio");
            }
            else
            {
                int respuesta = JOptionPane.showConfirmDialog(null, "¡Esta seguro de eliminar este Usuario!","¡Alerta!",JOptionPane.YES_NO_OPTION);
                if(respuesta == JOptionPane.OK_OPTION)
                {
                    if(fila >= 0)
                    {
                        PreparedStatement pst=cn.prepareStatement("DELETE FROM AdminUsu WHERE curp='"+this.jTableUsuarios.getValueAt(fila, 0)+"'");
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "¡Usuario Eliminado con Exito!");
                        Mostrar_Tabla_Usuarios();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "¡No selecciono una fila!");
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.err.println("Error al eliminar Usuario: "+e.getMessage());
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
       
        char textoTelefono=evt.getKeyChar();
        if(textoTelefono < '0' || textoTelefono > '9') evt.consume();
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldIntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIntKeyTyped
        char textoInterior=evt.getKeyChar();
        if(textoInterior < '0' || textoInterior > '9') evt.consume();
    }//GEN-LAST:event_jTextFieldIntKeyTyped

    private void jTextFieldExtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldExtKeyTyped
        char textoExterior=evt.getKeyChar();
        if(textoExterior < '0' || textoExterior > '9') evt.consume();
    }//GEN-LAST:event_jTextFieldExtKeyTyped

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char textoNombre=evt.getKeyChar();
        if((textoNombre < 'a' || textoNombre > 'z') && (textoNombre < 'A' || textoNombre > 'Z' )) evt.consume();
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoPaternoKeyTyped
        char textoApellidoP=evt.getKeyChar();
        if((textoApellidoP < 'a' || textoApellidoP > 'z') && (textoApellidoP < 'A' || textoApellidoP > 'Z' )) evt.consume();
    }//GEN-LAST:event_jTextFieldApellidoPaternoKeyTyped

    private void jTextFieldApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoMaternoKeyTyped
        char textoApellidoM=evt.getKeyChar();
        if((textoApellidoM < 'a' || textoApellidoM > 'z') && (textoApellidoM < 'A' || textoApellidoM > 'Z' )) evt.consume();
    }//GEN-LAST:event_jTextFieldApellidoMaternoKeyTyped

    private void jTextFieldCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCPKeyTyped
        char textoCP=evt.getKeyChar();
        if(textoCP < '0' || textoCP > '9') evt.consume();
    }//GEN-LAST:event_jTextFieldCPKeyTyped

    private void jComboBoxTipoUsuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuItemStateChanged
       
    }//GEN-LAST:event_jComboBoxTipoUsuItemStateChanged

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
        Wadmin1 admin=new Wadmin1();
        admin.setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUsu().setVisible(true);
            }
        });
    }
    
    public void Mostrar_Tabla_Usuarios()
    {
        DefaultTableModel model=new DefaultTableModel();
        //TableRowSorter sorter=new TableRowSorter(model);
        model.addColumn("RFC_Curp");
        model.addColumn("Nombre");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Tipo Usuario");
        model.addColumn("Turno");
        model.addColumn("E-Mail");
        model.addColumn("Inicio");
        model.addColumn("Fin");
        this.jTableUsuarios.setModel(model);
        
        String fila[] = new String[9];
        String sql="SELECT * FROM AdminUsu";
        
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                fila[0]=rs.getString(1);
                fila[1]=rs.getString(2);
                fila[2]=rs.getString(3);
                fila[3]=rs.getString(4);
                fila[4]=rs.getString(5);
                fila[5]=rs.getString(6);
                fila[6]=rs.getString(7);
                fila[7]=String.valueOf(rs.getDate(10));
                fila[8]=String.valueOf(rs.getDate(11));
               
                
                model.addRow(fila);
            }
        }
        catch (Exception e)
        {
            System.err.println("Error al mostrar datos en la tabla: "+e.getMessage());
        }
    }
    
    public String nickDisponible()
    {
      String nick = "";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nick FROM AdminUsu ");
            while(rs.next())
            {
                nick = rs.getString("nick");
                if(nick.equals(this.jTextFieldNick.getText()))
                {
                    JOptionPane.showMessageDialog(null, "La cuenta ya esta ocupada :(");
                    nick="";
                    rs.close();
                }
            }
        }
        catch (Exception e) 
        {
            System.err.println("Error al buscar nick: "+e.getMessage());
        }
          
        return nick;
    }
    
    public void darAltaInvitado(String PassOriginal,String PassConfirmar, String nombre, String Direccio, String email, String inicio, String fin ) 
    {
       SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
       java.util.Date fechainicioUtil = null;
       java.sql.Date fechaIniciosql=null;
       
       java.util.Date fechaFinUtil = null;
       java.sql.Date fechaFinsql=null;
       
        ///Comparar si nick exixte
        if(nickDisponible().equals(""))
        {
            JOptionPane.showMessageDialog(null, "No se registro Usuario :(");
        }
        else
        {
            if(PassOriginal.equals(PassConfirmar)) //Comparar contraseñas iguales
            {
                String sql ="INSERT INTO AdminUsu (curp,nombre,direccion,telefono,tipo_usu,turno,email,nick,password,invitado_inicio,invitado_fin) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                try 
                    {
                        fechainicioUtil = formato.parse(inicio);
                        fechaIniciosql =new  java.sql.Date(fechainicioUtil.getTime());
                        
                        fechaFinUtil = formato.parse(fin);
                        fechaFinsql = new java.sql.Date(fechaFinUtil.getTime());
                        
                        PreparedStatement pst = cn.prepareStatement(sql);
                        pst.setString(1, this.jTextFieldFFCoCURP.getText());
                        pst.setString(2, nombre);
                        pst.setString(3, Direccio);
                        pst.setString(4, this.jTextFieldTelefono.getText());
                        pst.setString(5, String.valueOf(this.jComboBoxTipoUsu.getSelectedItem()));
                        pst.setString(6, String.valueOf(this.jComboBoxTurno.getSelectedItem()));
                        pst.setString(7, email);
                        pst.setString((8), this.jTextFieldNick.getText());
                        pst.setString(9, md5.Encriptar(PassOriginal));
                        //agregar fechas
                        pst.setDate(10, fechaIniciosql);
                        pst.setDate(11, fechaFinsql);

                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"!Usuario Vendedor Invitado registrado correctamente¡");
                        Mostrar_Tabla_Usuarios();

                    } 
                catch (Exception e)
                    {
                        System.err.println("Error al registrar usuarios: "+e.getMessage());
                    }
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }
    
    //////////////
    public void darAltaVendedor(String PassOriginal,String PassConfirmar, String nombre, String Direccio, String email, String inicio, String fin ) 
    {
        ///Comparar si nick exixte
        if(nickDisponible().equals(""))
        {
            JOptionPane.showMessageDialog(null, "La cuenta ya esta ocupada :(");
        }
        else
        {
            if(PassOriginal.equals(PassConfirmar))
             {
                String sql ="INSERT INTO AdminUsu (curp,nombre,direccion,telefono,tipo_usu,turno,email,nick,password,invitado_inicio,invitado_fin) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                try 
                    {
                        PreparedStatement pst = cn.prepareStatement(sql);
                        pst.setString(1, this.jTextFieldFFCoCURP.getText());
                        pst.setString(2, nombre);
                        pst.setString(3, Direccio);
                        pst.setString(4, this.jTextFieldTelefono.getText());
                        pst.setString(5, String.valueOf(this.jComboBoxTipoUsu.getSelectedItem()));
                        pst.setString(6, String.valueOf(this.jComboBoxTurno.getSelectedItem()));
                        pst.setString(7, email);
                        pst.setString((8), this.jTextFieldNick.getText());
                        pst.setString(9, md5.Encriptar(PassOriginal));
                        //agregar fechas
                        pst.setDate(10, null);
                        pst.setDate(11, null);

                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"!Usuario Vendedor registrado correctamente¡");
                        Mostrar_Tabla_Usuarios();

                    } 
                catch (Exception e)
                    {
                        System.err.println("Error al registrar usuarios: "+e.getMessage());
                    }
            }
            else 
            {
               JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            } 
        }
    }
    ///////////

    public void AltaAdmin(String PassOriginal, String PassConfirmar, String nombre, String email )
    {
        ///Comparar si nick exixte
        if(nickDisponible().equals(""))
        {
            JOptionPane.showMessageDialog(null, "La cuenta ya esta ocupada :(");
        }
        else
        {
            if(PassOriginal.equals(PassConfirmar))
            {
                String sql= "INSERT INTO AdminUsu (curp,nombre,direccion,telefono,tipo_usu,turno,email,nick,password,invitado_inicio,invitado_fin) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                try 
                {
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.setString(1, this.jTextFieldFFCoCURP.getText());
                    pst.setString(2, nombre);
                    pst.setString(3, "");
                    pst.setString(4, this.jTextFieldTelefono.getText());
                    pst.setString(5, String.valueOf(this.jComboBoxTipoUsu.getSelectedItem()));
                    pst.setString(6, "");
                    pst.setString(7, email);
                    pst.setString((8), this.jTextFieldNick.getText());
                    pst.setString(9, md5.Encriptar(PassOriginal));
                    //agregar fechas
                    pst.setDate(10, null);
                    pst.setDate(11, null);

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null,"!Usuario Administrador registrado correctamente¡");
                    VaciarCampos();
                    Mostrar_Tabla_Usuarios();

                } catch (Exception e)
                {
                    System.err.println("Error al dar alta Administrador: "+e.getMessage());
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden :(");
            }
        }
    }
    
    public void VaciarCampos()
    {
        this.jTextFieldApellidoMaterno.setText("");
        this.jTextFieldApellidoPaterno.setText("");
        this.jTextFieldCP.setText("");
        this.jTextFieldCalle.setText("");
        this.jTextFieldColonia.setText("");
        this.jTextFieldDelegacion.setText("");
        this.jTextFieldEmail.setText("");
        this.jTextFieldExt.setText("");
        this.jTextFieldFFCoCURP.setText("");
        this.jTextFieldInt.setText("");
       this.jTextFieldNick.setText("");
       this.jTextFieldNombre.setText("");
       this.jTextFieldTelefono.setText("");
       this.jDateChooserInicio.setCalendar(null);
       this.jDateChooserFin.setCalendar(null);
       this.jPasswordFieldPassword.setText("");
       this.jPasswordFieldPasswordRepetida.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardarUsu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxTipoUsu;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private com.toedter.calendar.JDateChooser jDateChooserFin;
    private com.toedter.calendar.JDateChooser jDateChooserInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApeMaterno;
    private javax.swing.JLabel jLabelApePaterno;
    private javax.swing.JLabel jLabelArroba;
    private javax.swing.JLabel jLabelCP;
    private javax.swing.JLabel jLabelCalle;
    private javax.swing.JLabel jLabelColonia;
    private javax.swing.JLabel jLabelConfirmarPassword;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelDelega;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelExt;
    private javax.swing.JLabel jLabelInterior;
    private javax.swing.JLabel jLabelNick;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPeriodoFin1;
    private javax.swing.JLabel jLabelPeriodoInicio1;
    private javax.swing.JLabel jLabelRFCoCURP;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoUsu;
    private javax.swing.JLabel jLabelTurno;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelDireccion;
    private javax.swing.JPanel jPanelInvitado;
    private javax.swing.JPanel jPanelNickyPass;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldPasswordRepetida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldApellidoMaterno;
    private javax.swing.JTextField jTextFieldApellidoPaterno;
    private javax.swing.JTextField jTextFieldCOM;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldColonia;
    private javax.swing.JTextField jTextFieldDelegacion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldExt;
    private javax.swing.JTextField jTextFieldFFCoCURP;
    private javax.swing.JTextField jTextFieldInt;
    private javax.swing.JTextField jTextFieldNick;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}

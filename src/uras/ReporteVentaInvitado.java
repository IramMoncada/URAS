package uras;

import ClaseConectar.ConexionBD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ReporteVentaInvitado extends javax.swing.JFrame {
    
    ConexionBD cc = new ConexionBD();
Connection cn =cc.abrir_conexion();
    
    public ReporteVentaInvitado() {
        initComponents();
        
        llenarTabla();
        
        ((JPanel)getContentPane()).setOpaque(false);//empieza codigo fondo amarillo
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/grafito.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
         setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelVentasInvitado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInvitado = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelVentasInvitado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVentasInvitado.setText("Ventas Invitados:");

        jTableInvitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableInvitado);

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
                .addGap(38, 38, 38)
                .addComponent(jLabelVentasInvitado)
                .addGap(89, 89, 89)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVentasInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
        Reportes salir = new Reportes();
        salir.ejecutar();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteVentaInvitado().setVisible(true);
            }
        });
    }
    
    public void llenarTabla()
    {
        ///Obtener Nombre
        String VendedorInvitado="";
        String []datos = new String [2]; 
        int index=0;
            try 
            {   //toma nombres de
                String sql="SELECT nombre FROM AdminUsu WHERE tipo_usu='Vendedor'";
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                  datos[index]= rs.getString("nombre");
                  index++;
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
            
            
            
                
            
                sql="SELECT * FROM ventas_productos WHERE vendedor !='"+datos[0]+"' && vendedor !='"+datos[1]+"'";//obtener usuario actual
                String []datosF = new String [5];
                try 
                {
                    Statement stmt = cn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next())
                    {
                        datosF[0]=rs.getString(2);
                        datosF[1]=rs.getString(3);
                        datosF[2]=rs.getString(4);
                        datosF[3]=rs.getString(5);
                        datosF[4]=rs.getString(6);
                        modelo.addRow(datosF);
                    }
                } 
                catch (SQLException ex) 
                {
                     Logger.getLogger(ModProd.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            jTableInvitado.setModel(modelo);
    }                 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelVentasInvitado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInvitado;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseConectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author AlainBernal
 */
public class ConexionBD {
     private Connection conn;
//se registra el driver de la conexion  y se pone la ruta de la base de datos ;
   

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/ferreteria";
//asignamos el usuario y password para poder accesar a unas variables ;
    static final String USER = "root";
    static final String PASS = "12345";
     

    public Connection abrir_conexion() {

        try {
            //PASO 2: Registro del  JDBC driver
            Class.forName(JDBC_DRIVER);

            //PASO 3: Abre la conexión
            System.out.println("Conectando a la base de datos seleccionada");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
          
            System.out.println("Conectado a la base de datos correctamente");

        } catch (SQLException se) {
            System.out.println("No se puede conectar"+se.getMessage());
            //manejo de errores del JDBC 
            se.printStackTrace();
        } catch (Exception e) {
            //Manejo de errores  del  Class.forName
            e.printStackTrace();
        }
         return conn;
        
    }

    public void cerrar_conexion() {
        try {
            if (conn != null) {
                conn.close();
            }
            System.out.println("cerre la conexion con exito");
        } catch (SQLException se) {
            se.printStackTrace();
        }//termina el finally try
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        ConexionBD co = new ConexionBD();
        co.abrir_conexion();

        //co.cerrar_conexion();

    }//finaiza main
}

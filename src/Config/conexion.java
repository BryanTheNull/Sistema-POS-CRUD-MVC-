package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Bryan Vera
 * @version 1.0
 * @since 2024-04-06 Descripcion: Clase para manejar la conexión con la base de
 * datos MySQL.
 */
public class conexion {

    // Datos para ingresar a la BD
    private String ip = "127.0.0.1"; //Ej: 127.0.0.1
    private String bd = "datos";
    private String url = "jdbc:mysql://" + ip + ":3306/" + bd;
    private String user = "root"; //Acá debes incorporar el user del motor de bases de datos.
    private String pass = "Holasoytu.58"; //Acá debes incorporar la password del motor de bases de datos. 
    Connection con;

    // Realizr conexión a la BD
    public java.sql.Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            //System.out.println("¡CONEXION A LA BASE DE DATOS EXITOSA!");
        } catch (ClassNotFoundException | SQLException e) { // Capturar errores de mysqlConecctot y Consultas sql
            System.err.println("Error: Sin conexion a base de datos ");
        }
        return con;
    }
}

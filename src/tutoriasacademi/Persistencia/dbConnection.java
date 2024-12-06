package tutoriasacademi.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    
    static String url = "jdbc:mysql://localhost:3306/Proyecto";
    static String user = "root";
    static String pass = "whiskas123";

    // Método para obtener la conexión a la base de datos
    public static Connection getConnection() {
        Connection con = null;
        try {
            // Obtener la conexión con la base de datos
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos:");
            e.printStackTrace();
        }
        return con;
    }
}

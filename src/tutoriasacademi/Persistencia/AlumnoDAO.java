


package tutoriasacademi.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlumnoDAO {
    private final Connection connection;

    public AlumnoDAO() {
        this.connection = dbConnection.getConnection();
    }

    public void insertarEstudiante(String nombre, int edad) {
        String query = "INSERT INTO estudiante (nombre, edad) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, edad);
            stmt.executeUpdate();
            System.out.println("Estudiante insertado exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar estudiante:");
            e.printStackTrace();
        }
    }

    public void consultarEstudiantes() {
        String query = "SELECT * FROM estudiante";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("Lista de estudiantes:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.printf("ID: %d, Nombre: %s, Edad: %d%n", id, nombre, edad);
            }
        } catch (SQLException e) {
            System.err.println("Error al consultar estudiantes:");
            e.printStackTrace();
        }
    }
}

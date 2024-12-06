package tutoriasacademi.Persistencia;

public class ConexionSQL {
    public static void main(String[] args) {
        
        // Crear una instancia de la clase dbConnection
        dbConnection dbc = new dbConnection();

        // Usar el método getConnection() para establecer la conexión
        dbc.getConnection();

        // Crear una instancia de AlumnoDAO para usar sus métodos
        AlumnoDAO alumnoDAO = new AlumnoDAO();

        // Insertar un estudiante
        alumnoDAO.insertarEstudiante("Carlos López", 22);

        // Consultar estudiantes
        alumnoDAO.consultarEstudiantes();
    }
}

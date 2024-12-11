package tutoriasacademi.ArrayList;
import java.util.ArrayList;
import tutoriasacademi.logica.Alumno;

public class AlumnoArrayList {
    
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public AlumnoArrayList() {
        this.alumnos = new ArrayList<>();
    }
 public ArrayList<Alumno> getLista() {
        return alumnos;
    }
    public void agregarAlumno(Alumno alumno) {
          if (alumno == null) {
        System.out.println("No se puede agregar un alumno nulo.");
        return;
    }
    this.alumnos.add(alumno);
    System.out.println("Alumno agregado: " + alumno.getUsuario());
}
    public Alumno obtenerAlumno(int index) {
        return this.alumnos.get(index);
    }

    public int cantidadAlumnos() {
        return this.alumnos.size();
    }
    public ArrayList<Alumno> obtenerTodos() {
    return this.alumnos;
}
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.hashset;
import java.util.HashSet;
import java.util.Set;
import tutoriasacademi.logica.Alumno;
/**
 *
 * @author alexr
 */
import java.util.HashSet;
import java.util.Set;
import tutoriasacademi.logica.Alumno;

public class AlumnoHashSet {

    private Set<Alumno> alumnosSet;

    public AlumnoHashSet() {
        this.alumnosSet = new HashSet<>();
    }

    public boolean agregarAlumno(Alumno alumno) {
        return alumnosSet.add(alumno); 
    }

    public Alumno buscarAlumnoPorUsuario(String usuario) {
        for (Alumno alumno : alumnosSet) {
            if (alumno.getUsuario().equalsIgnoreCase(usuario)) {
                return alumno;
            }
        }
        return null;
    }

    public boolean eliminarAlumnoPorUsuario(String usuario) {
        Alumno alumno = buscarAlumnoPorUsuario(usuario);
        if (alumno != null) {
            alumnosSet.remove(alumno);
            return true;
        }
        return false; 
    }

    public int cantidadAlumnos() {
        return alumnosSet.size();
    }

    public void mostrarAlumnos() {
        for (Alumno alumno : alumnosSet) {
            System.out.println("Usuario: " + alumno.getUsuario() + ", Nombre: " + alumno.getNombre());
        }
    }
}

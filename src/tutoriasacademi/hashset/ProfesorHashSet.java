/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.hashset;
import java.util.HashSet;
import java.util.Set;
import tutoriasacademi.logica.Profesor;
/**
 *
 * @author alexr
 */
public class ProfesorHashSet {
    private Set<Profesor> profesoresSet;

    public ProfesorHashSet() {
        this.profesoresSet = new HashSet<>();
    }

    public boolean agregarProfesor(Profesor profesor) {
        return profesoresSet.add(profesor); // Agrega al conjunto
    }

    public Profesor buscarProfesorPorUsuario(String usuario) {
        for (Profesor profesor : profesoresSet) {
            if (profesor.getUsuario().equalsIgnoreCase(usuario)) {
                return profesor;
            }
        }
        return null;
    }

    public boolean eliminarProfesorPorUsuario(String usuario) {
        Profesor profesor = buscarProfesorPorUsuario(usuario);
        if (profesor != null) {
            profesoresSet.remove(profesor);
            return true;
        }
        return false;
    }

    public int cantidadProfesores() {
        return profesoresSet.size(); 
    }

    public void mostrarProfesores() {
        for (Profesor profesor : profesoresSet) {
            System.out.println("Usuario: " + profesor.getUsuario() + ", Nombre: " + profesor.getNombre());
        }
    }
}

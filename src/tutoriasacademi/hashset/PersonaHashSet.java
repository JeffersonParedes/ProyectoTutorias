/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.hashset;
import java.util.HashSet;
import java.util.Set;
import tutoriasacademi.logica.Persona;
/**
 *
 * @author alexr
 */
public class PersonaHashSet {
    private Set<Persona> personasSet;

    public PersonaHashSet() {
        this.personasSet = new HashSet<>();
    }

    public boolean agregarPersona(Persona persona) {
        return personasSet.add(persona); 
    }

    public Persona buscarPersonaPorUsuario(String usuario) {
        for (Persona persona : personasSet) {
            if (persona.getUsuario().equalsIgnoreCase(usuario)) {
                return persona;
            }
        }
        return null; 
    }

    public boolean eliminarPersonaPorUsuario(String usuario) {
        Persona persona = buscarPersonaPorUsuario(usuario);
        if (persona != null) {
            personasSet.remove(persona);
            return true;
        }
        return false; 
    }

    public int cantidadPersonas() {
        return personasSet.size(); 
    }

    public void mostrarPersonas() {
        for (Persona persona : personasSet) {
            System.out.println("Usuario: " + persona.getUsuario() + ", Nombre: " + persona.getNombre());
        }
    }
}

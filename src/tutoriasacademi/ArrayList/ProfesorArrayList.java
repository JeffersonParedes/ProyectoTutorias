/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.ArrayList;
import java.util.ArrayList;
import tutoriasacademi.logica.Profesor;

/**
 *
 * @author alexr
 */
public class ProfesorArrayList {
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public ProfesorArrayList() {
        this.profesores = new ArrayList<>();
    }
 public ArrayList<Profesor> getLista() {
        return profesores;
    }
    public void agregarProfesor(Profesor tutor) {
        this.profesores.add(tutor);
    }

    public Profesor obtenerProfesor(int index) {
        return this.profesores.get(index);
    }

    public int cantidadProfesores() {
        return this.profesores.size();
    }
    public ArrayList<Profesor> obtenerTodo() {
        return this.profesores;
    }
}


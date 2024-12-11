/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;
import tutoriasacademi.ArrayList.AlumnoArrayList;
import tutoriasacademi.ArrayList.ProfesorArrayList;
/**
 *
 * @author alexr
 */
public class Facade {

    private AlumnoArrayList listaAlumnos;
    private ProfesorArrayList listaProfesores;

    public Facade() {
        this.listaAlumnos = new AlumnoArrayList();
        this.listaProfesores = new ProfesorArrayList();
    }

    public boolean registrarAlumno(Alumno alumno) {
        return listaAlumnos.agregarAlumno(alumno);
    }

    public Alumno buscarAlumno(String usuario) {
        return listaAlumnos.buscarAlumnoPorUsuario(usuario);
    }
    public boolean registrarProfesor(Profesor profesor) {
        return listaProfesores.agregarProfesor(profesor);
    }

    public Profesor buscarProfesor(String usuario) {
        return listaProfesores.buscarProfesorPorUsuario(usuario);
    }

    public void mostrarAlumnos() {
        listaAlumnos.mostrarAlumnos();
    }

    public void mostrarProfesores() {
        listaProfesores.mostrarProfesores();
    }
}

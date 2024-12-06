/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;
import java.util.Date;
/**
 *
 * @author jeffersonparedespretel
 */
public class Alumno extends Persona {
    private String NivelEducativo;
    private String CentroEducativo;
    private Date fechaNacimiento;

    public Alumno(String NivelEducativo, String CentroEducativo, String Nombre, String Apellido, String Correo, String Nacionalidad, String Genero, Date fechaNacimiento, String Usuario, String Clave) {
        super( Nombre, Apellido, Correo, Nacionalidad, Genero, Usuario, Clave);
        this.NivelEducativo = NivelEducativo;
        this.CentroEducativo = CentroEducativo;
        this.fechaNacimiento = fechaNacimiento;
    }
    

    public String getNivelEducativo() {
        return NivelEducativo;
    }

    public void setNivelEducativo(String NivelEducativo) {
        this.NivelEducativo = NivelEducativo;
    }

    public String getCentroEsucativo() {
        return CentroEducativo;
    }

    public void setCentroEsucativo(String CentroEsucativo) {
        this.CentroEducativo = CentroEsucativo;
    }
 public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;

/**
 *
 * @author jeffersonparedespretel
 */
public class HorarioSeleccionado {
    private String Fecha;
    private double HoraInicio;
    private double HotaFinal;

    public HorarioSeleccionado(String Fecha, double HoraInicio, double HotaFinal) {
        this.Fecha = Fecha;
        this.HoraInicio = HoraInicio;
        this.HotaFinal = HotaFinal;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(double HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public double getHotaFinal() {
        return HotaFinal;
    }

    public void setHotaFinal(double HotaFinal) {
        this.HotaFinal = HotaFinal;
    }
    
    
}

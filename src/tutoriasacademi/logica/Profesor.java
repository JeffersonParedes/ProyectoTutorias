
package tutoriasacademi.logica;

public class Profesor extends Persona {
    private String Especialidad;
    private String Descripcion;
    private double CostoPorHora;
    private MaterialDeEstudio MaterialDeEstudio;
    private Disponibilidad Disponibilidad;

    public Profesor(String Especialidad, String Descripcion, double CostoPorHora, MaterialDeEstudio MaterialDeEstudio, Disponibilidad Disponibilidad, String Nombre, String Apellido, String Correo, String Nacionalidad, String Genero, String Usuario, String Clave) {
        super( Nombre, Apellido, Correo, Nacionalidad, Genero, Usuario, Clave);
        this.Especialidad = Especialidad;
        this.Descripcion = Descripcion;
        this.CostoPorHora = CostoPorHora;
        this.MaterialDeEstudio = MaterialDeEstudio;
        this.Disponibilidad = Disponibilidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getCostoPorHora() {
        return CostoPorHora;
    }

    public void setCostoPorHora(double CostoPorHora) {
        this.CostoPorHora = CostoPorHora;
    }

    public MaterialDeEstudio getMaterialDeEstudio() {
        return MaterialDeEstudio;
    }

    public void setMaterialDeEstudio(MaterialDeEstudio MaterialDeEstudio) {
        this.MaterialDeEstudio = MaterialDeEstudio;
    }

    public Disponibilidad getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    
    
    
}

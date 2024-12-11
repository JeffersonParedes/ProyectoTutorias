
package tutoriasacademi.logica;

public class Reserva {
    private int codigo;
    private Alumno Alumno;
    private Profesor Profesor;
    private Pago  Pago;
    private String TipoDeTutoria;

    public Reserva(int codigo, Alumno Alumno, Profesor Profesor, Pago Pago, String TipoDeTutoria) {
        this.codigo = codigo;
        this.Alumno = Alumno;
        this.Profesor = Profesor;
        this.Pago = Pago;
        this.TipoDeTutoria = TipoDeTutoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Profesor getProfesor() {
        return Profesor;
    }

    public void setProfesor(Profesor Profesor) {
        this.Profesor = Profesor;
    }

    public Pago getPago() {
        return Pago;
    }

    public void setPago(Pago Pago) {
        this.Pago = Pago;
    }

    public String getTipoDeTutoria() {
        return TipoDeTutoria;
    }

    public void setTipoDeTutoria(String TipoDeTutoria) {
        this.TipoDeTutoria = TipoDeTutoria;
    }
    
}


package tutoriasacademi.logica;

public class Tutoria {
    private int Reseña;
    private String  Estado;
    private String Retroalimantacion;

    public Tutoria(int Reseña, String Estado, String Retroalimantacion) {
        this.Reseña = Reseña;
        this.Estado = Estado;
        this.Retroalimantacion = Retroalimantacion;
    }

    public int getReseña() {
        return Reseña;
    }

    public void setReseña(int Reseña) {
        this.Reseña = Reseña;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getRetroalimantacion() {
        return Retroalimantacion;
    }

    public void setRetroalimantacion(String Retroalimantacion) {
        this.Retroalimantacion = Retroalimantacion;
    }
    
}


package tutoriasacademi.logica;

abstract class Persona {
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Nacionalidad;
    private String Genero;
    private String Usuario;
    private String Clave;

    public Persona( String Nombre, String Apellido, String Correo, String Nacionalidad, String Genero, String Usuario, String Clave) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Nacionalidad = Nacionalidad;
        this.Genero = Genero;
        this.Usuario = Usuario;
        this.Clave = Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    @Override
    public String toString() {
        return "Persona{"  + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Correo=" + Correo + ", Nacionalidad=" + Nacionalidad + ", Genero=" + Genero + ", Usuario=" + Usuario + ", Clave=" + Clave + '}';
    }
    
    
    
}

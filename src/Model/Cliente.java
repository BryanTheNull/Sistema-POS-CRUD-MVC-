package Model;

/**
 * @author Bryan Vera
 * @version 1.0
 * @since 2024-04-17 Descripcion: Clase de Cliente utilizada como molde para
 * manejar infromacion traida desde la base de datos a las tablas necesarias.
 */
public class Cliente {

    // Atributos 
    private int ID_Cliente;
    private String Rut;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Celular;

    // Constructor Vacio
    public Cliente() {
    }

    // Constructor
    public Cliente(int ID_Cliente, String Rut, String Nombre, String Apellido, String Email, String Celular) {
        this.ID_Cliente = ID_Cliente;
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Celular = Celular;
    }
    
    // Getter and Setter
    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    

}

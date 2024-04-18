package Model;



/**
 * @author @version 1.0
 * @since 2024-04-17 Descripcion: Clase de Producto utilizada como molde para
 * manejar infromacion traida desde la base de datos a las tablas necesarias.
 */
public class Producto {

    // Atributos
    private int ID_Producto;
    private int ID_Categoria;
    private int ID_Proveedor;
    private String Codigo;
    private String Nombre;
    private float Precio;
    private int Stock;

    // Constructor Vacio
    public Producto() {
    }

    // Constructor
    public Producto(int ID_Producto, int ID_Categoria, int ID_Proveedor, String Codigo, String Nombre, float Precio, int Stock) {
        this.ID_Producto = ID_Producto;
        this.ID_Categoria = ID_Categoria;
        this.ID_Proveedor = ID_Proveedor;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
    }

    // Getter and Setter
    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }
    
    
    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }
    
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

}

public abstract class Producto {
    private String nombre;
    private String descripcion;
    private String Categoria;
    private double precio;
    private String UrlFoto;

    public Producto(String nombre, String descripcion, String Categoria, double precio, String UrlFoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Categoria = Categoria;
        this.precio = precio;
        this.UrlFoto = UrlFoto;
    }
    abstract void mostrarDetalles();
    abstract void mostrarPrecio();
}

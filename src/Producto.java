public abstract class Producto {
    protected String nombre;
    protected String descripcion;
    protected String Categoria;
    protected double precio;
    protected String UrlFoto;

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

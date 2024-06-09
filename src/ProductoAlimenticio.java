public class ProductoAlimenticio extends Producto {
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String descripcion, String Categoria, double precio, String UrlFoto, String fechaCaducidad) {
        super(nombre, descripcion, Categoria, precio, UrlFoto);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + Categoria);
        System.out.println("Precio: " + precio);
        System.out.println("URL Foto: " + UrlFoto);
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("El precio del producto alimenticio es: " + precio);
    }
}

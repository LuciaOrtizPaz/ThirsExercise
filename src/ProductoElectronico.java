public class ProductoElectronico extends Producto {
    private int garantiaMeses;

    public ProductoElectronico(String nombre, String descripcion, String Categoria, double precio, String UrlFoto, int garantiaMeses) {
        super(nombre, descripcion, Categoria, precio, UrlFoto);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + Categoria);
        System.out.println("Precio: " + precio);
        System.out.println("URL Foto: " + UrlFoto);
        System.out.println("Garantía (meses): " + garantiaMeses);
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("El precio del producto electrónico es: " + precio);
    }
}

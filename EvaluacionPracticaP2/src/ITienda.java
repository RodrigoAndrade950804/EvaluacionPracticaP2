public interface ITienda {
    void agregarProducto(IProducto producto);
    void listarProductos();
    double obtenerPromedioPrecioProductos();
    int obtenerProductoMasCostoso();
}
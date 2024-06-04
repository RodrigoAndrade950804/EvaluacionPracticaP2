import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda{
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }


    //Implementar los métodos




    //Punto extra. El valor a buscar puede ser parte del nombre.
    public Boolean buscarProductoPorNombre(String nombre){
        //Implementar método
        return true;
    }

        //metodos
    @Override
    public void agregarProducto(IProducto producto) {
    }

    @Override
    public void listarProductos() {

    }


    public void listarProductos(String productos) {
    }

    @Override
    public double obtenerPromedioPrecioProductos() {

        return 0;
    }

    @Override
    public int obtenerProductoMasCostoso() {
        return 0;
    }
}

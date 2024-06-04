/* Examen Progreso 2
Instrucciones:

- Tenemos una tienda en línea que vende productos electrónicos.
    Esta tienda actualmente vende teléfonos, laptops y tablets.
    Todos los productos tienen Modelo, Marca y precio, y solamente las Laptops tienen años de garantía.

Se tienen dos interfaces: IProducto e ITienda
Implemente o complete correctamente las clases, constructores y funciones para que el Main se ejecute correctamente.

** No se debe modificar nada en la clase Main

- Suba el link de github. El último commit debe ser antes de que finalice la hora del examen
 */

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda() {
            @Override
            public void agregarProducto(IProducto producto) {

            }

            @Override
            public void listarProductos() {

            }

            @Override
            public double obtenerPromedioPrecioProductos() {
                return 0;
            }

            @Override
            public int obtenerProductoMasCostoso() {
                return 0;
            }
        };

        // Agregar productos
        tienda.agregarProducto(new Telefono("Galaxy S21", "Samsung", 800.00F));
        tienda.agregarProducto(new Laptop("MacBook Pro", "Apple", 2500.00F));
        tienda.agregarProducto(new Tablet("IpadAir", "Apple", 1100.00F));

        // Listar productos
        System.out.println("Lista de productos:");
        tienda.listarProductos();

        // Obtener promedio de precios de los productos ($1466)
        double promedio = tienda.obtenerPromedioPrecioProductos();
        System.out.println("\nEl promedio de los precios de los productos es: "+promedio);


        // Obtener el producto más costoso (MacBook Pro)
        int producto_mas_costoso = tienda.obtenerProductoMasCostoso();
        System.out.println("\nEl producto más costoso es: "+ producto_mas_costoso);


        //Por puntos extras... incluir aquí el método
        Boolean existe = tienda.buscarProductoPorNombre("IpadAir");
        if(existe){
            System.out.println("SI existe el producto");
        }
        else{
            System.out.println("NO existe el producto");
        }

    }
}
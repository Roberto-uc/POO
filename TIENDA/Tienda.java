public class Tienda {
    private String nombre;
    private String direccion;

    public Tienda(){
        this.nombre = "KIN";
        this.direccion = "SOLEDAD CALLE 5";
    }

    public Tienda(String nombre){
        this.nombre=nombre;
        this.direccion = "desconocido";
    }

    public static void main(String[] args) {

    Tienda tienda1 = new Tienda("DUNO");
        
    Cliente cliente1 = new Cliente("JUANCHO", "981");
    //CLIENTE SOBRECARGADO
    Cliente cliente2 = new Cliente("SANCHO");
    
    Producto  shampo = new Producto("shampo", 30, 100);
    Producto  papel = new Producto ("papel", 25 ,100);
    Producto  jabon = new Producto("jabon", 15, 100);
    Producto  pasta = new Producto ("pasta", 20, 100);
    //PRODUCTO SOBRECARGADO
    Producto agua = new Producto();

    Venta venta1 = new Venta();
    venta1.agregarProductos(pasta,5);
    venta1.agregarProductos(papel,2);
    venta1.agregarProductos(shampo,120);

    venta1.calcularTotal();
    venta1.imprimirNota();

    }




}

import java.util.ArrayList;

public class Venta {
    private double total;
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;

    public Venta(){
        productos = new ArrayList<>();
        cantidades= new ArrayList<>();
        total = 0.0;
    }

    public ArrayList<Integer> getCantidades() { return cantidades; }
    public ArrayList<Producto> getProductos() {  return productos; }
    
    public void agregarProductos(Producto p, int cantidad) {
        if (p.getCantidad() < cantidad) {
            System.out.println("- SIN STOCK SUFICIENTE PARA "+p.getNombre().toUpperCase()+"-");
        } else {
            productos.add(p);
            cantidades.add(cantidad);
            p.disminuirCantidad(cantidad); 
        }
    }

    public void calcularTotal(){ 
        total=0.0;
        for(int i = 0; i < productos.size(); i++){
            Producto producto= productos.get(i);
            int cantidad = cantidades.get(i);
            total += cantidad * producto.getPrecio();
        }
        this.total= total;
    }
    
    public void imprimirNota(){ 
         calcularTotal();
         for(int i = 0; i < productos.size();i++){
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i);
            System.out.println("PRODUCTO:"+ producto.getNombre().toUpperCase()+
                              " | CANTIDAD: "+cantidad+
                              " | PRECIO C/U: "+ producto.getPrecio()+
                              " | SUBTOTAL :"+ cantidad * producto.getPrecio());
         }
         System.out.println("EL TOTAL DE LA COMPRA ES: "+total);
    }

}

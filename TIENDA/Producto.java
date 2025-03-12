public class Producto{

   private String nombre;
   private double precio;
   private int cantidad;

   public Producto(String nombre, double precio, int cantidad){
       setNombre(nombre);
       setPrecio(precio);
       setCantidad(cantidad);
   }

   public Producto(){
       this.nombre = "agua";
       this.precio = 15.0;
       this.cantidad = 100;
   }

   public String getNombre(){ return nombre;}
   public double getPrecio(){return precio;}
   public int getCantidad(){return cantidad;}

   public void setNombre(String nombre){
    if(nombre == null || nombre.isEmpty()){
        this.nombre="-PRODUCTO-";
    }else{
        this.nombre=nombre;
    }
   }

   public void setPrecio(double precio){
    if(precio < 0.0 ){
        System.out.println("PRECIO INVALIDO");
        this.precio= 0.0 ;
    }else{
        this.precio=precio;
    }
   }

   public void setCantidad(int cantidad) {
       if(cantidad < 0){ 
        System.out.println("CANTIDAD INVALIDA");
        this.cantidad=0;
       }else{ 
       this.cantidad = cantidad;
       }
   }

   public void aumentarCantidad( int cantidad){ 
      if(cantidad <= 0){ 
        System.out.println("CANTIDAD DE COMPRA INVALIDA");
      }else{
        this.cantidad+=cantidad;
      }
   }

   public void disminuirCantidad(int cantidad){
     if(this.cantidad < cantidad){
        System.out.println("CANTIDAD INVALIDA");
     }else{ 
        this.cantidad-=cantidad;
     }
   }

}
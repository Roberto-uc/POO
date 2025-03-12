public class Propietario {
    private String nombre;
    private Vehiculo carro;
    private String tel;

    public Propietario(String nombre){
        setNombre(nombre);
        this.carro=(new Vehiculo("GTR", "BLANCO"));
    }

    public Propietario(String nombre, String tel){
           setNombre(nombre);
           setTel(tel);
           this.carro=(new Vehiculo("GTR", "BLANCO"));
    }
    
    public Vehiculo getCarro() {
        return carro;
    }
    public String getNombre() {
        return nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }
    public void setNombre(String nombre) {
        this.nombre = (nombre.equals("") || nombre.isEmpty())? "DESCONOCIDO" :nombre;
    }

    public void setTel(String tel) {
        this.tel =(tel == null || tel.isEmpty()) ? " -TELEFONO- " : tel;
    }
    public String toString() {
        return "--PROPIETARIO--\n" +
               "Nombre: " + getNombre() + "\n" +
               carro; 
    }

}

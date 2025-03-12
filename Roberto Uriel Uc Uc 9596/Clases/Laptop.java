public class Laptop {
    private String marca;
    private String modelo;
    private String almacenamiento;
    private String procesador;
    private int anio;
    private int ram;
    private double tamanio;

    public Laptop(String marca, String modelo, String almacenamiento, String procesador, int anio, int ram, double tamanio){

        this.setMarca(marca); 
        this.setModelo(modelo);
        this.setAlmacenamiento(almacenamiento);
        this.setProcesador(procesador);
        this.setAnio(anio);
        this.setRam(ram);
        this.setTamanio(tamanio);

    }
     
    //GETTER
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public String  getProcesador(){
        return procesador;
    }

    public int getAnio(){
        return anio;
    }

    public int getRam(){
        return ram;
    }

    public double getTamanio(){
        return tamanio;
    }

    // SETTERS
    public void setMarca(String marca) {

        if (marca == null || marca.isEmpty()) {
            this.marca = "HP"; 
        } else {
            this.marca = marca;
        }

    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            this.modelo = "Modelo desconocido"; 
        } else {
            this.modelo = modelo;
        }
    }

    public void setAlmacenamiento(String almacenamiento) {
        if (almacenamiento == null || almacenamiento.isEmpty()) {
            this.almacenamiento = "256";
        } else {
            this.almacenamiento = almacenamiento;
        }
    }

    public void setProcesador(String procesador) {
        if (procesador == null || procesador.trim().isEmpty()) {
            this.procesador = "Procesador desconocido"; 
        } else {
            this.procesador = procesador;
        }
    }

    public void setAnio(int anio) {
        if (anio < 2000 || anio > 2025) { 
            this.anio = 2020; 
        } else {
            this.anio = anio;
        }
    }

    public void setRam(int ram) {
        if (ram <= 0) {
            this.ram = 4; 
        } else {
            this.ram = ram;
        }
    }

    public void setTamanio(double tamanio) {
        if (tamanio <= 0) {
            this.tamanio = 13.3; 
        } else {
            this.tamanio = tamanio;
        }
    }

     // Método para mostrar los detalles de la laptop
     public void mostrarDetalles() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Almacenamiento: " + this.almacenamiento + " GB");
        System.out.println("Procesador: " + this.procesador);
        System.out.println("Año: " + this.anio);
        System.out.println("RAM: " + this.ram + " GB");
        System.out.println("Tamaño de pantalla: " + this.tamanio + " pulgadas");

     }
    public static void main(String[] args) {
        // Crear una laptop con valores no válidos
        System.out.println("Laptop con valores no válidos:");
        Laptop laptop1 = new Laptop("", "", "", "", 1999, -1, -15.6);
        laptop1.mostrarDetalles();
    }
}

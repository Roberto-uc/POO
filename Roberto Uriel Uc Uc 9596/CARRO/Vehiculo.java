public class Vehiculo {
    private String modelo, color;
    private Motor motor;

    public Vehiculo(String modelo, String color){
           setModelo(modelo);
           setColor(color);
           this.motor=(new Motor("NISSAN","gasolina",600));
    }

    public Vehiculo(String modelo){
           setModelo(modelo);
           this.color= "NEGRO";
           this.motor=(new Motor("NISSAN","gasolina",600));
    }

    public Motor getMotor() {
        return motor;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("El color no puede ser nulo o vacío");
        }
        this.color = color;
    }

    public void setModelo(String m) {
        this.modelo = (m == null || m.isEmpty()) ? "DESCONOCIDO" : m;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String toString(){
        return "---VEHICULO---"+"\n"+
               "Modelo: "+getModelo()+"\n"+
               "Color: "+getColor()+"\n"+
                getMotor();   
    }

}

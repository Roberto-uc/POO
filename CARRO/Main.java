public class Main {
    public static void main(String [] args){
    
        //PROPIETARIO 1
    
        Propietario juanito = new Propietario("JUANITO");
        //DATOS DEL PROPIETARIO 1
        System.out.println(juanito);

    
        //Nuevo motor 2 sobre escrito ******
        Motor motor2 = new Motor(200);
        //Nuevo vehiculo 2.
        Vehiculo carro2 = new Vehiculo("VISION");
        //Propietario con el constructor sobrecargado
        Propietario angel = new Propietario("Angel","981");
        
        carro2.setMotor(motor2);
        angel.setCarro(carro2);
        //Datos del propietarios 2
        System.out.println(angel);

        Motor motor3 = new Motor("Honda","",120);
        Vehiculo carro3 = new Vehiculo("CITY","NEGRO");
        Propietario juancho = new Propietario("JUANCHO");
        
        /* 
        carro3.setMotor(motor3);
        juancho.setCarro(carro3);

        System.out.println(juancho);

        */



    }
}

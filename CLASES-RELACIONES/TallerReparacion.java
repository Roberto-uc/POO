public class TallerReparacion {
    public static void main(String[] args) {
        //  Instanciar telfonos
        Telefono telefono1 = new Telefono("Samsung", "Galaxy S20", "TEL-001", "Pantalla");
        //telefono sobrecargado
        Telefono telefono2 = new Telefono("Samsung");
        
        // Crear a los técnicos
        Tecnico tecnico1 = new Tecnico("Ana López", "TEC-001");
        //TECNICO SOBRECARGADO
        Tecnico tecnico2 = new Tecnico("000"); 
        
        // Asignar los teléfonos
        tecnico1.asignarTelefono(telefono1);
        tecnico2.asignarTelefono(telefono1);
        
        // Crear clietes
        Cliente cliente1 = new Cliente("JUANITO","981");
        //CLIENTE SOBRECARGADO
        Cliente cliente2 = new Cliente("PANCHO","TEL-002");
        
        // Como esta el taller.
        System.out.println("Estado del Taller: \n "); 
        
        System.out.println("Tecnico 2: "+tecnico2.getNombre() +"\n"+
                         "Estado: "+tecnico2.getEstado()+"\n"+
                         "Telefono asignado: "+ tecnico2.getTelefonoAsignado());
                         
    }
}
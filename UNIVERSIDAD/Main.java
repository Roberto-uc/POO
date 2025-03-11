public class Main {
    
    public static void main(String []args){
              
           Materia quimica = new Materia("Quimica", 0);

            Profesor oscar = new Profesor("Oscar");
            oscar.agregarMateria(quimica);

            Universidad uvm = new Universidad("UNIVERSIDAD UVM");
            uvm.agregarProfesor(oscar);

            
           System.out.println(uvm);
           System.out.println(oscar);
    }

}

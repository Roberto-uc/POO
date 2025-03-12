import java.util.ArrayList;

public class Universidad{

    private String nombre;
    private ArrayList<Profesor> listaProfesor = new ArrayList<>();

    public Universidad(String nombre){
        SetNombre(nombre);
    }

    public void agregarProfesor(Profesor profesor) {
        listaProfesor.add(profesor);
    }
    

    public String getNombre(){return nombre;}

    public Profesor getProfesor(int pos){ 
        if (pos < 0 || pos >= listaProfesor.size()) {
             System.out.println("-POSICION INVALIDA-");
             return null;
        }else{
            return listaProfesor.get(pos);
        }
    }
    
    public void SetNombre(String nombre){
        this.nombre = (nombre == null || nombre.isEmpty()) ? "-NOMBRE-" : nombre;
    }


    public ArrayList<Profesor> getListaProfesores(){
        return listaProfesor;
    }

   
    public String toString(){
        return "NOMBRE: "+ getNombre()+"\n"+
               "LISTA DE PROFESORRES: " + listaProfesor.size();
    }
    

}
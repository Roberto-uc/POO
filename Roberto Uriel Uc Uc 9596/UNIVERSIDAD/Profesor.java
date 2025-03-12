import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String nombre;
    private Universidad universidad; 
    private List<Materia> materias;   

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public void asignarUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.isEmpty()) ? "-NOMBRE-" : nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + "\nMaterias: " + materias;
    }
    

}


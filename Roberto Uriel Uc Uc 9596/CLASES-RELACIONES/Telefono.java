public class Telefono {
    private String marca;
    private String modelo;
    private String estado;
    private String id;
    private String problema;

    public Telefono(String marca, String modelo, String id, String problema) {
        setMarca(marca);
        setModelo(modelo);
        setId(id);
        setProblema(problema);
        setEstado("Pendiente"); 
    }

    public Telefono(String marca){
        this(marca,"DES","DES","SI DEFO");
    }

     // Getters
     public String getMarca() { return marca; }
     public String getModelo() { return modelo; }
     public String getEstado() { return estado; }
     public String getId() { return id; }
     public String getProblema() { return problema; }

    // Setters 
    public void setMarca(String marca) {
        if(marca == null || marca.isEmpty()) {
            this.marca = "Generico";
        } else {
            this.marca = marca;
        }
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isEmpty()) {
            this.modelo = "Basico";
        } else {
            this.modelo = modelo;
        }
    }

    public void setEstado(String estado) {
        // Validación básica de estado
        if(estado.equals("reparado") || estado.equals("en reparación") || estado.equals("pendiente")) {
            this.estado = estado;
        } else {
            this.estado = "pendiente";
        }
    }
    

    public void setId(String id) {
        if(id == null || id.isEmpty()) {
            this.id = "ID-000"; 
        } else {
            this.id = id;
        }
    }

    public void setProblema(String problema) {
        if(problema == null || problema.isEmpty()) {
            this.problema = "Problema no especificado";
        } else {
            this.problema = problema;
        }
    }

   
}
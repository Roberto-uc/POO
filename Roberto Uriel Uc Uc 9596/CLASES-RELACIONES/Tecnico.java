public class Tecnico {
    private String nombre;
    private String numero;
    private String estado;
    private String telefonoAsignado;

    public Tecnico(String nombre, String numero){
        setNombre(nombre);
        setNumero(numero);
        setEstado("libre");
    }

    public Tecnico(String numero){
         this.numero = numero;
         this.estado = "libre";
         this.nombre = "EMILIO";
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getNumero() { return numero; }
    public String getEstado() { return estado; }
    public String getTelefonoAsignado() { return telefonoAsignado; }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) {
            this.nombre = "Innombrado";
        } else {
            this.nombre = nombre;
        }
    }

    public void setNumero(String numero) {
        if(numero == null || numero.isEmpty()) {
            this.numero = "Sin número";
        } else {
            this.numero = numero;
        }
    }

    public void setEstado(String estado) {
        if(estado.equals("ocupado") || estado.equals("libre")) {
            this.estado = estado;
        } else {
            this.estado = "libre";
        }
    }

    public void asignarTelefono(Telefono telefono) {
        if(this.estado.equals("libre")) {
            this.telefonoAsignado = telefono.getId();
            this.estado = "ocupado";
            telefono.setEstado("en reparación");
        } else {
            System.out.println("El técnico ya está ocupado");
        }
    }

    
}
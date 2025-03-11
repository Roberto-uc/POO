public class Cliente {
    private String nombre;
    private String numero;
    private String telefonoReparacion;

    public Cliente(String nombre, String numero, String telefonoReparacion) {
        setNombre(nombre);
        setNumero(numero);
        setTelefonoReparacion(telefonoReparacion);
    }

    public Cliente(String nombre,String telefonoReparacion){
        this.nombre= nombre;
        this.numero ="-NUMERO-";
        setTelefonoReparacion(telefonoReparacion);
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getNumero() { return numero; }
    public String getTelefonoReparacion() { return telefonoReparacion; }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) {
            this.nombre = "Anonimo";
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

    public void setTelefonoReparacion(String id) {
    if (id == null || id.isEmpty()) {
        this.telefonoReparacion = "Sin teléfono";
    } else {
        this.telefonoReparacion = id;
    }
}
}
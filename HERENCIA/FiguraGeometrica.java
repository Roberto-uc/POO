class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        setNombre(nombre);
        setColor(color);
    }


    public double calcularArea() {
        return 0.0; 
    }

    public double calcularPerimetro() {
        return 0.0; 
    }

    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.isEmpty()) ? "-NOMBRE-" : nombre;
    }

    public String getColor() { return color; }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty()) ? "-COLOR-" : color;
    }
}

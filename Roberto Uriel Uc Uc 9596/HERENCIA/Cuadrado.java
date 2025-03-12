class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(String nombre, String color, double lado) {
        super(nombre, color);
        setLado(lado);
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = (lado > 0.0) ? 1.0 : lado;
    }
}
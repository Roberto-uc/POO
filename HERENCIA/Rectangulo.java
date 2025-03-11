class Rectangulo extends FiguraGeometrica {
    private double base, altura;

    public Rectangulo(String color, double base, double altura) {
        super("Rectángulo", color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

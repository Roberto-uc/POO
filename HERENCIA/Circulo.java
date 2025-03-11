class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super("Circulo", color);
        setRadio(radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    public double calcularDiametro() {
        return 2 * radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = (radio > 0) ? radio : 1.0;
    }
}

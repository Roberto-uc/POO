class Trapecio extends FiguraGeometrica {
    private double baseMayor, baseMenor, altura, lado1, lado2;

    public Trapecio(String color, double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        super("Trapecio", color);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    @Override
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}

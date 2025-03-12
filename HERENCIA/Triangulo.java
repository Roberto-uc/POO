class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String nombre, String color, double base, double altura, double lado1, double lado2, double lado3) {
        super(nombre, color);
        setBase(base);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return getLado1() + getLado2() + getLado3();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = (base > 0) ? base : 1.0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = (altura > 0) ? altura : 1.0;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = (lado1 > 0) ? lado1 : 1.0;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = (lado2 > 0) ? lado2 : 1.0;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = (lado3 > 0) ? lado3 : 1.0;
    }
}

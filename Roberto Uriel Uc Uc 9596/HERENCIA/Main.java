public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo("Triangulo","Rojo", 5, 4, 5, 5, 5);
        t.mostrarInfo();
        System.out.println();

        Circulo c = new Circulo("Ciruclo", "blanco", 3);
        c.mostrarInfo();
        System.out.println("Diámetro: " + c.calcularDiametro());
        System.out.println();

        Rectangulo r = new Rectangulo("Verde", 6, 8);
        r.mostrarInfo();
        System.out.println();

        Cuadrado q = new Cuadrado("Cuadradito","Amarillo", 5);
        q.mostrarInfo();
        System.out.println();

        Trapecio trap = new Trapecio("Naranja", 8, 5, 4, 3, 3);
        trap.mostrarInfo();
    }
}

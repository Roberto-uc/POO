import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        int a = 0, i = 0, sumatoria = 0;
        
        while(a <=0 || a  > 10){
        System.out.println("Ingrese un numero postivo menor o igual a 10 \n¿Cuantos numeros desea ingresar ?");
        a = scanner.nextInt();
        }
        
        int[] arreglo = new int[a];

        while(i < a){
            System.out.println("Ingrese el numero: "+(i+1));
            arreglo[i] = scanner.nextInt();
            sumatoria = sumatoria + arreglo[i];
            i++;
        }
        
        System.out.println("La suma de los numeros ingresado es: "+sumatoria);

        scanner.close();
    }
}

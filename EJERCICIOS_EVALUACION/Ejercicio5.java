import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        int[] arreglo = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int a = 0, b = 0;
        
        System.out.println("Ingresa 10 nummeros ");
        for(int i = 0; i < 10; i++){
            System.out.println("Ingresa el numero "+(i+1)+" :");
            arreglo[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < 10; i++){

            if(arreglo[i] % 2 == 0){
                pares[a] = arreglo[i];
                a++;
            }else{
                impares[b] = arreglo[i];
                b++;
            }
        }
        System.out.println("Pares: ");
        for(int i = 0; i < pares.length; i++){
            System.out.println(pares[i]);
        }
        
        System.out.println("Impares");
        for(int i = 0; i < impares.length;i++){
            System.out.println(impares[i]);
        }
    scanner.close();
    }
}


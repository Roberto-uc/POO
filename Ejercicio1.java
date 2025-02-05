import java.util.Scanner;
 
public class Ejercicio1 {
    
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.println("Ingrese 5 numeros ");

        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese un numero: "+(i+1)+": ");
            numeros[i] = scanner.nextInt();

            if(numeros[i]>0){
                positivos = positivos +1;
            }

            if(numeros[i] == 0){
                ceros = ceros +1;
            }

            if(numeros[i] < 0){
                negativos = negativos +1;
            }
        }
        

        System.out.println("Resultados: ");
        
        System.out.println("Postivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Ceros: "+ceros);

        scanner.close();
    }

}

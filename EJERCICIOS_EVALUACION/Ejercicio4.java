import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);
    String[] arreglo = new String[5];
    int i = 0;
    
    do{
        System.out.println("Ingresa una palabra "+(i+1)+" :");
        arreglo[i] = scanner.nextLine();
        i++;

    }while(i <5 );

    int intentos = 3;
    boolean acerto = false;
    
    System.out.println("Adivina una de las palabras ingresadas :");

    do{
    System.out.println("Tienes "+intentos+" intentos: ");
    String palabraAdivina = scanner.nextLine();
    
    int a = 0;
    do{
        
    if( arreglo[a].equals(palabraAdivina)){
        System.out.println("Correcto, bien hecho");
        acerto = true;
        break;
    }
    a++;
    }while(a <5);

    if(!acerto ){
        intentos--;
    }if(intentos > 0 && !acerto){
        System.out.println("Intentalo de nuevo");
    }

    }while(intentos >0 && !acerto);
    
    if(intentos == 0 ){
        System.out.println("!!!Perdiste ");
        
    }

    scanner.close();
    }
}
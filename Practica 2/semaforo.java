import java.util.Scanner;

public class semaforo{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Introduzca el valor (1-3) del semáforo actual: ");
	int valor = input.nextInt();
	if (valor == 1){
	    System.out.println("El siguiente semáforo será: Verde");
	}
	else if (valor == 2){
	    System.out.println("El siguiente semáforo será: Amarillo");
	}
	else if (valor == 3){
	    System.out.println("El siguiente semáforo será: Rojo");
	}
	else{
	    System.out.println("El valor introducido no es válido");
	}
    }
}
import java.util.Scanner;

public class switcase{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Introduzca un mes (0-12): ");
	int mes = input.nextInt();
	switch (mes){
	    case 12:
		System.out.println("Diciembre");
	    break;
	    case 11:
		System.out.println("Noviembre");
	    break;
	    case 10:
		System.out.println("Octubre");
	    break;
	    case 9:
		System.out.println("Septiembre");
	    break;
	    case 8:
		System.out.println("Agosto");
	    break;
	    case 7:
		System.out.println("Julio");
	    break;
	    case 6:
		System.out.println("Junio");
	    break;
	    case 5:
		System.out.println("Mayo");
	    break;
	    case 4:
		System.out.println("Abril");
	    break;
	    case 3:
		System.out.println("Marzo");
	    break;
	    case 2:
		System.out.println("Febrero");
	    break;
	    case 1:
		System.out.println("Enero");
	    break;
	    default:
		System.out.println("Valor inválido");
	}
    }
}
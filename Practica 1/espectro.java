import java.util.Scanner;

public class espectro{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Introduzca un valor para determinar el espectro al que pertenece: ");
	double longitud = input.nextDouble();
	if ((longitud >= 380) && (longitud < 450)){
	    System.out.println("El color del espectro introducido es: Violeta");
	}
	else if ((longitud >= 450) && (longitud < 495)){
	    System.out.println("El color del espectro introducido es: Azul");
	}
	else if ((longitud >= 495) && (longitud < 570)){
	    System.out.println("El color del espectro introducido es: Verde");
	}
	else if ((longitud >= 570) && (longitud < 590)){
	    System.out.println("El color del espectro introducido es: Amarillo");
	}
	else if ((longitud >= 590) && (longitud < 620)){
	    System.out.println("El color del espectro introducido es: Naranja");
	}
	else if ((longitud >= 620) && (longitud < 750)){
	    System.out.println("El color del espectro introducido es: Rojo");
	}
	else {
	    System.out.println("El valor introducido no pertenece al espectro visible");
	}
    }
}
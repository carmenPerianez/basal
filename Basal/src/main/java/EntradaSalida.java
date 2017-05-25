import java.util.Scanner;

public class EntradaSalida {

	public static double obtenerPeso (){
		double peso = 0;
		Scanner scaner = null;
		
		System.out.println("Introduce peso en kg: ");
		scaner = new Scanner(System.in);
		peso = scaner.nextDouble();

		return peso;
	}
	
	
	public static double obtenerAltura (){
		double altura = 0;
		Scanner scaner = null;		
			
		System.out.println("Introduce altura en cm :");
		scaner = new Scanner(System.in);
		altura = scaner.nextDouble();
		
		return altura;
	}
	
	public static int obtenerEdad (){
		int edad = 0;
		Scanner scaner = null;		
			
		System.out.println("Introduce edad en años :");
		scaner = new Scanner(System.in);
		edad = scaner.nextInt();
		
		return edad;
	}
	
	public static char obtenerSexo (){
		char sexo = 0;
		Scanner scaner = null;		
			
		System.out.println("Introduce sexo :");
		scaner = new Scanner(System.in);
		sexo = scaner.next().charAt(0);;
		
		return sexo;
	}
	
	public static double mostrarBasal (Persona persona, char sexo){
		Basal basal = new Basal();
		double b = 0.0; 
		if (sexo == 'h') {
			b = basal.calculaBasalHombre(persona);
			System.out.println("Es un hombre y su basal es: " + b);
		}
		else if (sexo == 'm') {
			b = basal.calculaBasalMujer(persona);
			System.out.println("Es una mujer y su basal es: " + b);
		}
		return b;
	}
}
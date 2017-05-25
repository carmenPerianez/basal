
public class Principal {

	public static void main(String[] args) {
		
		double peso = EntradaSalida.obtenerPeso();
		double altura = EntradaSalida.obtenerAltura();
		int edad = EntradaSalida.obtenerEdad();		
		Persona persona = new Persona(peso, altura, edad);
		char sexo = EntradaSalida.obtenerSexo();
		EntradaSalida.mostrarBasal(persona, sexo);
	}

}

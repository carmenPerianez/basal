

public class Basal {

	public  double calculaBasalHombre (Persona persona){
		double basal = 0;		
		basal = ((10 * persona.getPeso()) + 
				(6.25 * persona.getAltura()) -
				(5 * persona.getEdad()) + 5 );	
		return basal;
	}
	
	public  double calculaBasalMujer (Persona persona){
		double basal = 0;
		basal = ((10 * persona.getPeso()) + 
				(6.25 * persona.getAltura()) -
				(5 * persona.getEdad()) - 161 );
		
		return basal;
	}
}

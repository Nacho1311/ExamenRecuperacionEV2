package ev2.recuperacion;

public abstract class Animal {

	static int id = 0;
	private double peso;
	private Propietario propietario;
	static int numAnimales = 0;
	
	
	public enum sexo{
		MACHO, HEMBRA
	}


	public Animal(double peso, Propietario propietario) {
	
		this.peso = peso;
		this.propietario = propietario;
	}
	
	
	
}

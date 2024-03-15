package ev2.recuperacion;

public class Serpiente extends Animal {

	private String especie;
	private boolean venenosa;
	
	
	public Serpiente(double peso, Propietario propietario, String especie, boolean venenosa) {
		super(peso, propietario);
		this.especie = especie;
		this.venenosa = venenosa;
	}

}

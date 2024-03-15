package ev2.recuperacion;

public class Gato extends Animal  {

	private String nombre;
	private int edad;
	private String raza;
	private String codChip;
	
	
	public Gato(double peso, Propietario propietario, String nombre, int edad, String raza, String codChip) {
		super(peso, propietario);
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.codChip = codChip;
		
	}
	
	public static void cortarUñas(double peso){
		boolean cortarUñas = true;
		
		if(cortarUñas) {
			peso = peso - 20;
		} else {
			peso = peso;
		}
	}
}



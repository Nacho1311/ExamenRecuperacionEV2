package ev2.recuperacion;

public class Perro extends Animal {

	private String nombre;
	private int edad;
	private String raza;
	private String codChip;
	
	
	public Perro(double peso, Propietario propietario, String nombre, int edad, String raza, String codChip) {
		super(peso, propietario);
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.codChip = codChip;
		
	}
	
	 public static void cortarUñas(double peso){
			boolean cortarUñas = true;
			
			if(cortarUñas) {
				peso = peso - 50.0;
			} else {
			    peso = peso;
			}
		}
	 
	 public static void damePatita (String nombre) {
		 
		 
		 
		 System.out.println("El perro " +nombre+ " te da la patita.");
	 }

}

package n1exercici8;

final class Frog extends Amphibian{  

	private String Raza;
	private Frog(String Name,int Size, int Legs, String Raza){
		super(Name, Size, Legs);
		this.Raza=Raza;
		
		
		
	}
	
	 protected void Saltar() //podem accedir desde el package
	    {
	        System.out.println("L´animal salta");
	    }

}
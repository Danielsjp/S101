package n1exercici6;


final class Frog extends Amphibian{  

	private String Raza;
	public Frog(String Name,int Size, int Legs, String Raza){
		super(Name, Size, Legs);
		this.Raza=Raza;
		
		
		
	}
	
	 public void saltar()
	    {
	        System.out.println("L´animal salta");
	    }

}
package n1exercici7;


final class Frog extends Amphibian{  

	private String Raza;
	public Frog(String Name,int Size, int Legs, String Raza){
		super(Name, Size, Legs);
		this.Raza=Raza;
		
		
		
	}
	
	 public static void play()
	    {
	        System.out.println("Enjoying son");
	    }

}
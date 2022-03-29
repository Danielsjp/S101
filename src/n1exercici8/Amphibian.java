package n1exercici8;

public class Amphibian {
	
	private  String Name;
	private  int Size;
	private  int Legs;
	
	public Amphibian(){}
	public Amphibian(String Name, int Size, int Legs){
		this.Name = Name;
		this.Size=Size;
		this.Legs=Legs;

	}
	
	public static void Moure() {
		
		System.out.println("L´animal es mou");  
	}
	
	public static void Respirar() {
		
		System.out.println("L´animal respira");  
	}
	
	public static void Menjar() {
		
		System.out.println("L´animal menja");  
	}

}

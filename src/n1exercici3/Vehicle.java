package n1exercici3;

public class Vehicle {
	
private String Nom;
private Integer Velocitat;
private String Estat;

	
	protected Vehicle()
	{
		System.out.println("Constructor");  
	}
	
	{
		System.out.println("Bloque de inicializacón");  
	}
	
	public static void Iniciar() {
		System.out.println("El coche esta arrancado");  
	}
	
	public static void parar(){
	    System.out.println ("El coche esta parando");
	    
	}
	public void acelerar(){
	    System.out.println ("El coche esta acelerando");
	   
	}

}




package n1exercici4;

public class Vehicle {
	
	String Nom;
	Integer Velocitat;
	String Estat;

	
	public Vehicle()
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




package n1exercici4;

public class Vehicle {
	
	static final String Nom="Unknow"; //requiere ser inicializado ( ES UNA CONSTANTE )
	final Integer Velocitat; //es una constante, pero no requiere ser inicializado. cuando tenga un valor no se puede cambiar
	static String Estat="no se sabe"; // se puede inicializar aqui o en el constructor, el valor puede cambiar.

	
	public Vehicle()
	{
		
		Velocitat = 10;
		Estat = "parado";
		System.out.println("Constructor");  
	}
	
	public void Vehicle2()
	{
		Estat = "encendido";
		// Velocitat = 11; // no permite ser cambiado
		System.out.println("Constructor2");  
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




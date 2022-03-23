package n1exercici4;

public class Vehicle {
	
	static final String Nom="Unknow"; //requiere ser inicializado ( ES UNA CONSTANTE )
	final Integer Velocitat; //es una constante, pero no requiere ser inicializado. cuando tenga un valor no se puede cambiar
	static String Estat="no se sabe"; // se puede inicializar aqui o en el constructor, el valor puede cambiar.

	
	public Vehicle()
	{
		//static final String Nom="Unknow"; // No puede ser inicializado aqui
		//final Integer Velocitat=2;
		Velocitat = 10;
		Estat = "parado";
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




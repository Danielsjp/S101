package n1exercici5;
class Animal{  

	String Corre;
	int vel;
	int MaxVel;

	public Animal(){}
	public Animal(String Corre, int vel, int MaxVel){
		this.Corre = Corre;
		this.vel=vel;
		this.MaxVel=MaxVel;

	}

	public static void Correr(String Corre) {
		
		System.out.println("Metodo 1");  
	}

	public static void Correr(String Corre,int vel) {
		System.out.println("Metodo 2");  
	}

	public static void Correr(String Corre,int vel, int MaxVel) {
		System.out.println("Metodo 3"); 
	}

         public static void main(String args[]){  
       
         Correr("hola",5); //mostrará el metodo 2
         }  
     } 

     final class Gat extends Animal{  

	String Raza;
	public Gat(String Corre,int vel, int MaxVel, String Raza){
		super(Corre, vel, MaxVel);
		this.Raza=Raza;
		
	}

	//public Gat(String Corre2, int vel2, int MaxVel2){
	//super();

	//}

	public static void Correr(String Corre,int vel, int MaxVel, String Raza) {
		System.out.println("Metodo 4 heredado"); 
	}}
         
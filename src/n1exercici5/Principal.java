package n1exercici5;

public class Principal {

	public static void main(String[] args) {
		
		Gat.Correr("hola"); //mostrará el metodo 1 de animal porque solo recibe un string
		Gat.Correr("hola", 5); //mostrará el metodo 2 
      	Gat.Correr("hola",5,7); //mostrará el metodo 3 
		Gat.Correr("hola",5,7, "Persa"); //mostrará el metodo 4 
		
		// TODO Auto-generated method stub

	}

}

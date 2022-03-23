package n1exercici7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian amphibian;
		amphibian = (Amphibian) new Frog("Rana",3,4, "Saltarina");
		amphibian.Menjar();
		amphibian.Respirar();
		amphibian.Moure();
		
		//amphibian.play(); // no es accesible.
	}

}

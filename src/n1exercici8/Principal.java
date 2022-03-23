package n1exercici8;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian amphibian;
		amphibian = (Amphibian) new Frog("Rana",3,4, "Saltarina");
		amphibian.Menjar();
		amphibian.Respirar();
		amphibian.Moure();
		//amphibian.Saltar(); // no es accesible.
        Frog frogger = (Frog) amphibian;
        System.out.println(frogger.Raza); // permet accedir
        Frog fragger = new Frog("Rana",3,4, "Nadadora");
        fragger.Saltar(); //permet accedir al metode si la clase es publica.
		
	}

}

package interfaceAula;

public class InterfaceModelo {

	public static void main(String[] args) {
		
		Animal animal1 = new Boi();
		System.out.println("O boi fez " + animal1.emitirSom() + " e comeu " + animal1.tipoAlimento());

		Animal animal2 = new Gato();
		System.out.println("O gato fez " + animal2.emitirSom() + " e comeu " + animal2.tipoAlimento());
		
	}

}

package interfaceAula;

public class Gato implements Animal {
	
	@Override
	public String emitirSom() {
		String som;
		som = "miau";
		return som;
	
	}

	@Override
	public String tipoAlimento() {
		String tipoAlimento;
		tipoAlimento = "leite";
		return tipoAlimento;
		
	}
	
}
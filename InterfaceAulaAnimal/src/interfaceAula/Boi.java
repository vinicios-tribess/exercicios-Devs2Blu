package interfaceAula;

public class Boi implements Animal {
	
	@Override
	public String emitirSom() {
		String som;
		som = "muuu";
		return som;
		
	}

	@Override
	public String tipoAlimento() {
		String tipoAlimento;
		tipoAlimento = "capim";
		return tipoAlimento;
		
	}
	
}
package interfaceVeiculo;

public class Automovel implements Veiculo {
	

	@Override
	public String acelerar() {
		String acelerar = "Acelerando o autom�vel...";
		return acelerar;
	}

	@Override
	public String abastecer() {
		String abastecer = "Abastecendo o autom�vel...";
		return abastecer;
	}

	@Override
	public String frear() {
		String frear = "Freando o autom�vel...";
		return frear;
	}
	
}
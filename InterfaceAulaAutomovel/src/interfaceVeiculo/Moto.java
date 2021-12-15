package interfaceVeiculo;

public class Moto implements Veiculo {

	@Override
	public String acelerar() {
		String acelerar = "Acelerando a moto...";
		return acelerar;
	}

	@Override
	public String abastecer() {
		String abastecer = "Abastecendo a moto...";
		return abastecer;
	}

	@Override
	public String frear() {
		String frear = "Freando a moto...";
		return frear;
	}
	
}
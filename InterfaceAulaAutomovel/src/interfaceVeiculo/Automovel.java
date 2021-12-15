package interfaceVeiculo;

public class Automovel implements Veiculo {
	

	@Override
	public String acelerar() {
		String acelerar = "Acelerando o automóvel...";
		return acelerar;
	}

	@Override
	public String abastecer() {
		String abastecer = "Abastecendo o automóvel...";
		return abastecer;
	}

	@Override
	public String frear() {
		String frear = "Freando o automóvel...";
		return frear;
	}
	
}
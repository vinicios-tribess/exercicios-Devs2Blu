package VeiculoConstrutor;

public class Veiculo {
	
	public static void main(String[] args) {
		
		Automovel auto = new Automovel(80, 44, "M�dia", "Gasolina");
		auto.listarDados();
		System.out.println("Velocidade liberada at�: " + auto.ajustarVelocidade());
		
	}

}

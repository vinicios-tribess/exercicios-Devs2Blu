package VeiculoConstrutor;

public class Veiculo {
	
	public static void main(String[] args) {
		
		Automovel auto = new Automovel(80, 44, "Média", "Gasolina");
		auto.listarDados();
		System.out.println("Velocidade liberada até: " + auto.ajustarVelocidade());
		
	}

}

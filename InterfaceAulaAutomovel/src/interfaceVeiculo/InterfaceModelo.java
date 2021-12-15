package interfaceVeiculo;

public class InterfaceModelo {

	public static void main(String[] args) {
		
		Veiculo sedan = new Automovel();
		System.out.println(sedan.acelerar());
		
		Moto scooter = new Moto();
		System.out.println(scooter.abastecer());

	}

}
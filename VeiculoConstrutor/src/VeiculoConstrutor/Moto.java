package VeiculoConstrutor;

public class Moto {

public static void main(String[] args) {
		
		Automovel moto = new Automovel(90, 30, "Alto", "Eletricidade");
		moto.listarDados();
		System.out.println("Velocidade liberada até: " + moto.ajustarVelocidade());
		
	}
	
}
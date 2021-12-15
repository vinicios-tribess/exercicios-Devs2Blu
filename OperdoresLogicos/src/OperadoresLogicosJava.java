
public class OperadoresLogicosJava {

	public static void main(String[] args) {
		// && = e / | = ou
		
		int numero1, numero2, numero3, numero4;
		numero1 = 10;
		numero2 = 10;
		
		if (numero1 == numero2) {
			System.out.println("Ambos são iguais");
		}
		
		numero3 = 10;
		numero4 = 10;
		
		if ((numero1 == numero2) && (numero3 == numero4)) {
			System.out.println("Todos são iguais");
		}
	}

}

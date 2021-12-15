
public class Condicionais {

	public static void main(String[] args) {
		
		int idade;
		
		idade = 18;
		if (idade < 18 && idade > 0) {
			System.out.println("Menor de idade");
		} else if (idade >= 18 && idade <= 65) {
			System.out.println("Adulto");
		} else if (idade > 65){
			System.out.println("Idoso");
		} else {
			System.out.println("Não existe essa idade!");
		}
	}
}
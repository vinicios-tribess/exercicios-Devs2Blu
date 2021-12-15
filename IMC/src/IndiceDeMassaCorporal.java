import javax.swing.JOptionPane;

public class IndiceDeMassaCorporal {

	public static void main(String[] args) {
		
		float altura, peso, imc;
		
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura:"));
		peso   = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu peso:"));
		imc    = peso / (altura * altura);
		imc    = Math.round(imc * 100.0f)/100.0f;
		
		if (imc < 18.5) {
			System.out.println("Seu IMC � de " + imc + " - Sua classifica��o � MAGREZA.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Seu IMC � de " + imc + " - Sua classifica��o � NORMAL.");
		} else if (imc >= 25   && imc < 30) {
			System.out.println("Seu IMC � de " + imc + " - Sua classifica��o � SOBREPESO.");
		} else if (imc >= 30   && imc < 40) {
			System.out.println("Seu IMC � de " + imc + " - Sua classifica��o � OBESIDADE.");
		} else if (imc >= 40) {
			System.out.println("Seu IMC � de " + imc + " - Sua classifica��o � OBESIDADE GRAVE.");
		}
	}
}

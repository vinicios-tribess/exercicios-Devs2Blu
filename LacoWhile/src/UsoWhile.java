import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		
		float nota, media, soma = 0;
		int qtdNotas, contaNotas;
		
		qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas: "));
		
		contaNotas = 1;
		while(contaNotas <= qtdNotas) {
			nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nr� " + contaNotas));
			soma += nota;
			contaNotas++;
		}
		
		media = soma / qtdNotas;
		JOptionPane.showMessageDialog(null, "A m�dia das notas � " + media);
	}
}

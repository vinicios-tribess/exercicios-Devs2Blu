import javax.swing.JOptionPane;

public class dowhile {

	public static void main(String[] args) {
		
		int option = 0;
		float n1 = 0;
		float n2 = 0;
		float result;
		
		do {
			try {
				option = Integer.parseInt(JOptionPane.showInputDialog("Digite uma op��o: "
						+ "\n 1 -> Somar\n 2 -> Subtrair\n 3 -> Multiplicar\n 4 -> Dividir\n 9 -> Sair"));
				switch (option) {
				case 1: {
					n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1� n�mero:"));
					n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2� n�mero:"));
					result = n1 + n2;
					JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + result);
					break;
				}
				case 2: {
					n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1� n�mero:"));
					n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2� n�mero:"));
					result = n1 - n2;
					JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + result);
					break;
				}
				case 3: {
					n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1� n�mero:"));
					n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2� n�mero:"));
					result = n1 * n2;
					JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + result);
					break;
				}
				case 4: {
					n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1� n�mero:"));
					n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2� n�mero:"));
					while (n2 == 0) {
						JOptionPane.showMessageDialog(null, "O divisor n�o pode ser nulo (igual a 0)!");
						n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2� n�mero:"));
					}
					if ((n1 % n2 == 0) || (n1 < n2)) {
						result = n1 / n2;
						JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + result);
					} else {
						float rest;
						float integer;
						result = n1 / n2;
						integer = (int)(n1 / n2);
						rest = n1 % n2;
						JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + result + 
								"\nDivis�o inteira = " + integer + "\nResto = " + rest);
					}
					break;
				}
				case 9: {
					JOptionPane.showMessageDialog(null, "Programa fechado com sucesso!");
					break;
				}
				default:
					JOptionPane.showMessageDialog(null, option + " � uma op��o inv�lida! Tente novamente.");
				}
			} 
			catch(java.lang.NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "A entrada inserida � inv�lida! Tente novamente.");
			}
		} while (option != 9);

	}

}

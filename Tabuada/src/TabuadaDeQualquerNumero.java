import javax.swing.JOptionPane;

public abstract class TabuadaDeQualquerNumero {

	public static void main(String[] args) {
		
		int number;
		number = Integer.parseInt(JOptionPane.showInputDialog("Type a number:"));
		
		for (int i = 0; i < 10; i++) {
			System.out.println(number + " x " + (i + 1) + " = " + (number * (i + 1)));
		}
		
	}

}

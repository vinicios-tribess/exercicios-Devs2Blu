import javax.swing.JOptionPane;

public class sw1tch {

	public static void main(String[] args) {
		
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o: "));
		
		switch (opcao) {
		case 1: {
			System.out.println("Inclus�o");
			break;
		}
		case 2: {
			System.out.println("Altera��o");
			break;
		}
		case 3: {
			System.out.println("Exclus�o");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
		}
	}
}
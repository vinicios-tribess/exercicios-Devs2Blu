import javax.swing.JOptionPane;

public class sw1tch {

	public static void main(String[] args) {
		
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção: "));
		
		switch (opcao) {
		case 1: {
			System.out.println("Inclusão");
			break;
		}
		case 2: {
			System.out.println("Alteração");
			break;
		}
		case 3: {
			System.out.println("Exclusão");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
	}
}
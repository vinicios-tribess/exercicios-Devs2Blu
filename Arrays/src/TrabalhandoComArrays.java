import javax.swing.JOptionPane;
import java.util.Arrays;

public class TrabalhandoComArrays {

	public static void main(String[] args) {
		
		String biggest_num;
		int qtdNumbers;
		Float[] meuArray;
		
		do {
			
			qtdNumbers = Integer.parseInt(JOptionPane.showInputDialog("Type a number from 1 to 10: "));
			meuArray = new Float[qtdNumbers];
			
		} while (qtdNumbers > 10 || qtdNumbers < 1);
		
		for (int i = 0; i < qtdNumbers; i++) {
			meuArray[i] = Float.parseFloat(JOptionPane.showInputDialog("Type the " + (i + 1) + "� number:").replaceAll(",","."));
		}
		
		Arrays.sort(meuArray);
		biggest_num = Float.toString(meuArray[qtdNumbers - 1]);
		JOptionPane.showMessageDialog(null, "The biggest value typed was " + biggest_num + "!");
	}

}

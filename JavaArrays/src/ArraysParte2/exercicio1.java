package ArraysParte2;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		int[]	 codigo  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] nome	 = {"Jo�o", "Jos�", "Pedro", "Maria", "Ana", "Gustavo", "Guilherme", "J�lia", "Augusto", "Marcos"};
		float[]  salario = new float[10];
		float    total   = 0;
		
		System.out.println("C�digo   Nome");
		
		for (int i = 0; i < codigo.length; i++) {
			
			System.out.println("  " + codigo[i] + "      " + nome[i]);
			salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o sal�rio do(a) " + nome[i] + ":"));
			total += salario[i];
			
		}
		
		Arrays.sort(salario);
		
		System.out.println("A soma dos sal�rios � igual a " + total);
		System.out.println("Os 3 maiores sal�rios s�o: " + salario[9] + ", " + salario[8] + ", " + salario[7]);
		
	}

}

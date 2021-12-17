package ArraysParte2;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		int[]	 codigo  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] nome	 = {"João", "José", "Pedro", "Maria", "Ana", "Gustavo", "Guilherme", "Júlia", "Augusto", "Marcos"};
		float[]  salario = new float[10];
		float    total   = 0;
		
		System.out.println("Código   Nome");
		
		for (int i = 0; i < codigo.length; i++) {
			
			System.out.println("  " + codigo[i] + "      " + nome[i]);
			salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário do(a) " + nome[i] + ":"));
			total += salario[i];
			
		}
		
		Arrays.sort(salario);
		
		System.out.println("A soma dos salários é igual a " + total);
		System.out.println("Os 3 maiores salários são: " + salario[9] + ", " + salario[8] + ", " + salario[7]);
		
	}

}

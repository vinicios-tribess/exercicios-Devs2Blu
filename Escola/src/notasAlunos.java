import java.util.Arrays;

import javax.swing.JOptionPane;

public class notasAlunos {

	public static void main(String[] args) {
		
		int qtdAlunos;
		int qtdNotas;
		Float nota;
		Float[][] alunos;
		Float[] notas;
		
		qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade total de alunos:"));
		qtdNotas  = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas por alunos:"));
		alunos = new Float[qtdAlunos][qtdNotas];
		
		for (int a = 0; a < qtdAlunos; a++) {
			
			notas = new Float[qtdNotas];
			
			for (int n = 0; n < qtdNotas; n++) {
				
				nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + (n + 1) + "� nota do " + (a + 1) + "� aluno:"));
				notas[n] = nota;
			}
			
			alunos[a] = notas;
		}
		
		System.out.println(Arrays.deepToString(alunos));
	}
}

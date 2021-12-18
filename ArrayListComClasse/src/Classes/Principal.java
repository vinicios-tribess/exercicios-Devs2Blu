package Classes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/* Pessoa pessoa = new Pessoa();
		 * ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		 * pessoa.nome = "JOSÉ";
		 * pessoa.idade = 25;
		 * listaPessoa.add(pessoa);
		 */
		
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.nome = JOptionPane.showInputDialog("Informe o nome da pessoa: ");
			pessoa.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa: "));
			listaPessoa.add(pessoa);
		}
		
		for (Pessoa pessoa : listaPessoa) {
			pessoa.imprimirDados();
		}
		
	}

}

import javax.swing.JOptionPane;
import com.logicbig.example.Tabela;
import javax.swing.JDialog;

public class ArrecadamentoMultas {

	public static void main(String[] args) {
		
		int numeroDeMotoristas;
		int numeroDaCarteira;
		int numeroDeMultas;
		int numeroDePontos;
		int valorTotal;
		int totalArrecadado = 0;
		
		numeroDeMotoristas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número total de motoristas: ", "Total de Condutores", JOptionPane.INFORMATION_MESSAGE));
		
		//Cria uma tabela e define as colunas e cabeçalhos:
		Tabela st = new Tabela();
		st.setShowVerticalLines(true);
        st.setHeaders("Documento Motorista", "Valor Total de Pontos", "Valor Total de Multas");
		
		for (int c = 0; c < numeroDeMotoristas; c++) {
			
			numeroDaCarteira = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da carteira do " + (c + 1) + "º motorista:", "Documentação", JOptionPane.INFORMATION_MESSAGE));
			numeroDeMultas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de multas do motorista com a carteira " + numeroDaCarteira+ ":", "Total de Multas do Condutor", JOptionPane.INFORMATION_MESSAGE));
			
			numeroDePontos = 0;
			valorTotal = 0;
			
			for (int m = 0; m < numeroDeMultas; m++) {
				
				//Cria uma janela com um menu drop-down:
				JDialog.setDefaultLookAndFeelDecorated(true);
			    Object[] selectionValues = { "Leve", "Média", "Grave", "Gravíssima" };
			    String initialSelection = "Leve";
			    Object selection = JOptionPane.showInputDialog(null, "Selecione a natureza da " + (m + 1) + "ª multa do motorista " + numeroDaCarteira + ":",
			        "Natureza da Multa", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
			    
			    //Tentei usar a função "switch" mas não deu certo. Usando a função "if" então:
			    if (selection == "Leve") {
			    	numeroDePontos += 3;
			    	valorTotal += 88;
			    } else if (selection == "Média") {
			    	numeroDePontos += 4;
			    	valorTotal += 130;
			    } else if (selection == "Grave") {
			    	numeroDePontos += 5;
			    	valorTotal += 195;
			    } else if (selection == "Gravíssima") {
			    	numeroDePontos += 7;
			    	valorTotal += 293;
			    }
			}
			
			//Adiciona uma linha na tabela com os dados fornecidos:
			st.addRow(String.valueOf(numeroDaCarteira), String.valueOf(numeroDePontos), "R$ " + String.valueOf(valorTotal));
			
			totalArrecadado += valorTotal;
		}
		
		//Exibe a tabela preenchida no terminal:
		st.print();
		System.out.println("Total de Motoristas...: " + numeroDeMotoristas);
		System.out.println("Total de Arrecadamento: R$ " + totalArrecadado);
	}
}

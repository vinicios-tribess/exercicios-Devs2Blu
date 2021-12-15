import javax.swing.JOptionPane;
import com.logicbig.example.CommandLineTable;
import javax.swing.JDialog;

public class ArrecadamentoMultas {

	public static void main(String[] args) {
		
		int numeroDeMotoristas;
		int numeroDaCarteira;
		int numeroDeMultas;
		int numeroDePontos;
		int valorTotal;
		int totalArrecadado = 0;
		
		numeroDeMotoristas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero total de motoristas: ", "Total de Condutores", JOptionPane.INFORMATION_MESSAGE));
		
		//Cria uma tabela e define as colunas e cabe�alhos:
		CommandLineTable st = new CommandLineTable();
		st.setShowVerticalLines(true);
        st.setHeaders("Documento Motorista", "Valor Total de Pontos", "Valor Total de Multas");
		
		for (int c = 0; c < numeroDeMotoristas; c++) {
			
			numeroDaCarteira = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero da carteira do " + (c + 1) + "� motorista:", "Documenta��o", JOptionPane.INFORMATION_MESSAGE));
			numeroDeMultas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero de multas do motorista com a carteira " + numeroDaCarteira+ ":", "Total de Multas do Condutor", JOptionPane.INFORMATION_MESSAGE));
			
			numeroDePontos = 0;
			valorTotal = 0;
			
			for (int m = 0; m < numeroDeMultas; m++) {
				
				//Cria uma janela com um menu drop-down:
				JDialog.setDefaultLookAndFeelDecorated(true);
			    Object[] selectionValues = { "Leve", "M�dia", "Grave", "Grav�ssima" };
			    String initialSelection = "Leve";
			    Object selection = JOptionPane.showInputDialog(null, "Selecione a natureza da " + (m + 1) + "� multa do motorista " + numeroDaCarteira + ":",
			        "Natureza da Multa", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
			    
			    //Tentei usar a fun��o "switch" mas n�o deu certo. Usando a fun��o "if" ent�o:
			    if (selection == "Leve") {
			    	numeroDePontos += 3;
			    	valorTotal += 88;
			    } else if (selection == "M�dia") {
			    	numeroDePontos += 4;
			    	valorTotal += 130;
			    } else if (selection == "Grave") {
			    	numeroDePontos += 5;
			    	valorTotal += 195;
			    } else if (selection == "Grav�ssima") {
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

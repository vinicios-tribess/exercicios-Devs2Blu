
public class EmpresaRH {

	public static void main(String[] args) {

		Gerencia ger = new Gerencia();
		ger.nome = "Guilherme Pereira";
		ger.descDepto = "Qualidade";
		ger.comissao = 0.02f; // =2%
		ger.salario = 12500.00f;
		ger.listarFuncionario();
		
	}
}

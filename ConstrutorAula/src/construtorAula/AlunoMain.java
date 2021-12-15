package construtorAula;

public class AlunoMain {

	public static void main(String[] args) {
		
		Aluno alu = new Aluno(8, 8, 8, 8);
		System.out.println("A média do aluno é " + alu.calcularMedia());

	}

}
package construtorAula;

public class Aluno {

	private float nota1;
	private float nota2;
	private float nota3;
	private float nota4;
	
	public Aluno(float nota1, float nota2, float nota3, float nota4) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public double calcularMedia() {
		double mediaAluno = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
		return mediaAluno;
	}
	
}

package classes;

import java.sql.Date;

public class MenuPrincipal {

	public static void main(String[] args) {
	
		/*
		chamaIncluirAluno("Gabriela", "Raquel", "Rafael", "2003-09-19", 8.0, "A");
		chamaIncluirAluno("Pedro", "Mariza", "Frederico", "2004-10-22", 4.5, "R");
		chamaIncluirAluno("Vinicios", "Tânia", "Edemir", "2001-01-31", 9.0, "A");
		chamaAlterarAluno(1, "Gabriela", "Raquel", "Rafael", "2003-09-19", 5.0, "R");
		chamaExcluirAluno(2);
		chamaConsultarAluno(3);
		chamaListarAlunos();
		*/
		
		/*
	    chamaIncluirDisciplina("Matemática", "Cláudia", 3);
		chamaIncluirDisciplina("História", "Gustavo", 4);
		chamaIncluirDisciplina("Geografia", "Sandra", 2);
		chamaAlterarDisciplina(2, "História", "Heitor", 4);
		chamaExcluirDisciplina(3);
		chamaConsultarDisciplina(1);
		chamaListarDisciplinas();
		*/
	
		/*
		chamaIncluirMatricula(1, 2, "2019-01-26", "A");
		chamaIncluirMatricula(1, 3, "2019-01-26", "A");
		chamaIncluirMatricula(2, 1, "2019-02-01", "A");
		chamaIncluirMatricula(2, 3, "2019-02-01", "A");
		chamaIncluirMatricula(3, 2, "2019-02-03", "I");
		*/
		
		/*
		chamaIncluirAvaliacao(1, 2, 1, 9.5);
		chamaIncluirAvaliacao(1, 3, 2, 7.0);
		chamaIncluirAvaliacao(2, 1, 1, 9.0);
		chamaIncluirAvaliacao(2, 3, 3, 6.5);
		chamaIncluirAvaliacao(3, 2, 1, 4.0);
		*/
		
	}
	
	// Métodos da classe Aluno:
	
	public static void chamaIncluirAluno(String nomaluno, String nommae, String nompai, String datanasc, Double Medaluno, String sitaluno) {
		Aluno alu = new Aluno();
		alu.setNomaluno(nomaluno);
		alu.setNommae(nommae);
		alu.setNompai(nompai);
		alu.setDatanasc(Date.valueOf(datanasc));
		alu.setMedaluno(Medaluno);
		alu.setSitaluno(sitaluno);
		alu.incluirAluno();
	}
	public static void chamaAlterarAluno(int codaluno, String nomaluno, String nommae, String nompai, String datanasc, Double Medaluno, String sitaluno) {
		Aluno alu = new Aluno();
		alu.setNomaluno(nomaluno);
		alu.setNommae(nommae);
		alu.setNompai(nompai);
		alu.setDatanasc(Date.valueOf(datanasc));
		alu.setMedaluno(Medaluno);
		alu.setSitaluno(sitaluno);
		alu.alterarAluno(codaluno);
	}
	public static void chamaExcluirAluno(int codaluno) {
		Aluno alu = new Aluno();
		alu.excluirAluno(codaluno);
	}
	public static void chamaConsultarAluno(int codaluno) {
		Aluno alu = new Aluno().consultarAluno(codaluno);
		System.out.println("Nome aluno.: " + alu.getNomaluno());
		System.out.println("Nome mãe...: " + alu.getNommae());
		System.out.println("Nome pai...: " + alu.getNompai());
		System.out.println("Data nasc..: " + alu.getDatanasc());
		System.out.println("Média aluno: " + alu.getMedaluno());
		System.out.println("Sit. aluno.: " + alu.getSitaluno());
	}
	public static void chamaListarAlunos() {
		Aluno alu = new Aluno();
		for (Aluno aluno : alu.listarAlunos()) {
			System.out.println("Cód. aluno.: " + aluno.getCodaluno());
			System.out.println("Nome aluno.: " + aluno.getNomaluno());
			System.out.println("Nome mãe...: " + aluno.getNommae());
			System.out.println("Nome pai...: " + aluno.getNompai());
			System.out.println("Data nasc..: " + aluno.getDatanasc());
			System.out.println("Média aluno: " + aluno.getMedaluno());
			System.out.println("Sit. aluno.: " + aluno.getSitaluno());
			System.out.println();
		}
	}

	// Métodos da classe Disciplina:
	
	public static void chamaIncluirDisciplina(String nomdisciplina, String nomprofessor, int qtdavaliacoes) {
		Disciplina dis = new Disciplina();
		dis.setNomDisciplina(nomdisciplina);
		dis.setNomProfessor(nomprofessor);
		dis.setQtdAvaliacoes(qtdavaliacoes);
		dis.incluirDisciplina();
	}
	public static void chamaAlterarDisciplina(int coddisciplina, String nomdisciplina, String nomprofessor, int qtdavaliacoes) {
		Disciplina dis = new Disciplina();
		dis.setNomDisciplina(nomdisciplina);
		dis.setNomProfessor(nomprofessor);
		dis.setQtdAvaliacoes(qtdavaliacoes);
		dis.alterarDisciplina(coddisciplina);
	}
	public static void chamaExcluirDisciplina(int coddisciplina) {
		Disciplina dis = new Disciplina();
		dis.excluirDisciplina(coddisciplina);
	}
	public static void chamaConsultarDisciplina(int coddisciplina) {
		Disciplina dis = new Disciplina().consultarDisciplina(coddisciplina);
		System.out.println("Nome disc..: " + dis.getNomDisciplina());
		System.out.println("Nome prof..: " + dis.getNomProfessor());
		System.out.println("Qtd. aval..: " + dis.getQtdAvaliacoes());
	}
	public static void chamaListarDisciplinas() {
		Disciplina dis = new Disciplina();
		for (Disciplina disciplina : dis.listarDisciplinas()) {
			System.out.println("Cód. disciplina.: " + disciplina.getCodDisciplina());
			System.out.println("Nome disciplina.: " + disciplina.getNomDisciplina());
			System.out.println("Nome professor..: " + disciplina.getNomProfessor());
			System.out.println("Qtd. avaliações.: " + disciplina.getQtdAvaliacoes());
			System.out.println();
		}
	}
	
	// Métodos da classe Matricula:
	
	public static void chamaIncluirMatricula(int codaluno, int coddisciplina, String dtmatricula, String statusmatricula) {
		Matricula mat = new Matricula();
		mat.setCodAluno(codaluno);
		mat.setCodDisciplina(coddisciplina);
		mat.setDtMatricula(Date.valueOf(dtmatricula));
		mat.setStatusMatricula(statusmatricula);
		mat.incluirMatricula();
	}
	public static void chamaAlterarMatricula(int codaluno, int coddisciplina, String dtmatricula, String statusmatricula) {
		Matricula mat = new Matricula();
		mat.setCodAluno(codaluno);
		mat.setCodDisciplina(coddisciplina);
		mat.setDtMatricula(Date.valueOf(dtmatricula));
		mat.setStatusMatricula(statusmatricula);
		mat.alterarMatricula();
	}
	public static void chamaExcluirMatricula(int codaluno, int coddisciplina) {
		Matricula mat = new Matricula();
		mat.excluirMatricula(codaluno, coddisciplina);
	}
	
	// Métodos da classe Avaliacao:
	
	public static void chamaIncluirAvaliacao(int codaluno, int coddisciplina, int nravaliacao, Double vlrnota) {
		Avaliacao ava = new Avaliacao();
		ava.setCodAluno(codaluno);
		ava.setCodDisciplina(coddisciplina);
		ava.setNrAvaliacao(nravaliacao);
		ava.setVlrNota(vlrnota);
		ava.incluirAvaliacao();
	}
	
}
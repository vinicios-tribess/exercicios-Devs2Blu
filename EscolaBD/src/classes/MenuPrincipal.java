package classes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MenuPrincipal {

	public static void main(String[] args) {

		/*
		chamaIncluirAluno("Gabriela", "Raquel", "Rafael", "2003-09-19", 8.0, "A");
		chamaIncluirAluno("Pedro", "Mariza", "Frederico", "2004-10-22", 4.5, "R");
		chamaIncluirAluno("Vinicios", "T�nia", "Edemir", "2001-01-31", 9.0, "A");
		chamaAlterarAluno(1, "Gabriela", "Raquel", "Rafael", "2003-09-19", 5.0, "R");
		chamaExcluirAluno(2);
		chamaConsultarAluno(3);
		chamaListarAlunos();
		*/
		
		/*
	    chamaIncluirDisciplina("Matem�tica", "Cl�udia", 3);
		chamaIncluirDisciplina("Hist�ria", "Gustavo", 4);
		chamaIncluirDisciplina("Geografia", "Sandra", 2);
		chamaAlterarDisciplina(2, "Hist�ria", "Heitor", 4);
		chamaExcluirDisciplina(3);
		chamaConsultarDisciplina(1);
		chamaListarDisciplinas();
		*/
	
		/*
		chamaIncluirMatricula(1, 1, "2019-01-26", "A");
		chamaIncluirMatricula(2, 2, "2019-01-23", "A");
		chamaIncluirMatricula(3, 3, "2019-01-20", "I");
		chamaAlterarMatricula(1, 1, "2019-02-26", "A");
		chamaExcluirMatricula(2, 2);
		chamaConsultarMatricula(1, 1);
		chamaListarMatriculas();
		*/
		
		/*
		chamaIncluirAvaliacao(1, 1, 1, 9.0);
		chamaIncluirAvaliacao(2, 2, 1, 8.0);
		chamaIncluirAvaliacao(3, 3, 1, 4.0);
		chamaAlterarAvaliacao(1, 1, 1, 10.0);
		chamaExcluirAvaliacao(1, 1);
		chamaConsultarAvaliacao(2, 2);
		chamaListarAvaliacoes();
		*/
		
	}
	
	// M�todos da classe Aluno:
	
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
		System.out.println("Nome m�e...: " + alu.getNommae());
		System.out.println("Nome pai...: " + alu.getNompai());
		System.out.println("Data nasc..: " + alu.getDatanasc());
		System.out.println("M�dia aluno: " + alu.getMedaluno());
		System.out.println("Sit. aluno.: " + alu.getSitaluno());
	}
	public static void chamaListarAlunos() {
		Aluno alu = new Aluno();
		for (Aluno aluno : alu.listarAlunos()) {
			System.out.println("C�d. aluno.: " + aluno.getCodaluno());
			System.out.println("Nome aluno.: " + aluno.getNomaluno());
			System.out.println("Nome m�e...: " + aluno.getNommae());
			System.out.println("Nome pai...: " + aluno.getNompai());
			System.out.println("Data nasc..: " + aluno.getDatanasc());
			System.out.println("M�dia aluno: " + aluno.getMedaluno());
			System.out.println("Sit. aluno.: " + aluno.getSitaluno());
			System.out.println();
		}
	}

	// M�todos da classe Disciplina:
	
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
			System.out.println("C�d. disciplina.: " + disciplina.getCodDisciplina());
			System.out.println("Nome disciplina.: " + disciplina.getNomDisciplina());
			System.out.println("Nome professor..: " + disciplina.getNomProfessor());
			System.out.println("Qtd. avalia��es.: " + disciplina.getQtdAvaliacoes());
			System.out.println();
		}
	}
	
	// M�todos da classe Matricula:
	
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
	public static void chamaConsultarMatricula(int codaluno, int coddisciplina) {
		Matricula mat = new Matricula().consultarMatricula(codaluno, coddisciplina);
		System.out.println("C�d. Aluno..: " + mat.getCodAluno());
		System.out.println("C�d. Discip.: " + mat.getCodDisciplina());
		System.out.println("Data Matr�c.: " + mat.getDtMatricula());
		System.out.println("Qtd. aval...: " + mat.getStatusMatricula());
	}
	public static void chamaListarMatriculas() {
		Matricula mat = new Matricula();
		List<Matricula> listaMatriculas = new ArrayList<>();
		listaMatriculas = mat.listarMatriculas();
		for (Matricula matricula : listaMatriculas) {
			System.out.println("C�d. aluno....: " + matricula.getCodAluno());
			System.out.println("C�d. discipl..: " + matricula.getCodDisciplina());
			System.out.println("Data matr�cula: " + matricula.getDtMatricula());
			System.out.println("Status matr�c.: " + matricula.getStatusMatricula());
			System.out.println();
		}
	}
	
	// M�todos da classe Avaliacao:
	
	public static void chamaIncluirAvaliacao(int codaluno, int coddisciplina, int nravaliacao, Double vlrnota) {
		Avaliacao ava = new Avaliacao();
		ava.setCodAluno(codaluno);
		ava.setCodDisciplina(coddisciplina);
		ava.setNrAvaliacao(nravaliacao);
		ava.setVlrNota(vlrnota);
		ava.incluirAvaliacao();
	}
	public static void chamaAlterarAvaliacao(int codaluno, int coddisciplina, int nravaliacao, Double vlrnota) {
		Avaliacao ava = new Avaliacao();
		ava.setCodAluno(codaluno);
		ava.setCodDisciplina(coddisciplina);
		ava.setNrAvaliacao(nravaliacao);
		ava.setVlrNota(vlrnota);
		ava.alterarAvaliacao();
	}
	public static void chamaExcluirAvaliacao(int codaluno, int coddisciplina) {
		Avaliacao ava = new Avaliacao();
		ava.excluirAvaliacao(codaluno, coddisciplina);
	}
	public static void chamaConsultarAvaliacao(int codaluno, int coddisciplina) {
		Avaliacao ava = new Avaliacao().consultarAvaliacao(codaluno, coddisciplina);
		System.out.println("C�d. Aluno....: " + ava.getCodAluno());
		System.out.println("C�d. Discip...: " + ava.getCodDisciplina());
		System.out.println("Nr. Avaliacao.: " + ava.getNrAvaliacao());
		System.out.println("Vlr. Avaliacao: " + ava.getVlrNota());
	}
	public static void chamaListarAvaliacoes() {
		Avaliacao ava = new Avaliacao();
		List<Avaliacao> listaAvaliacoes = new ArrayList<>();
		listaAvaliacoes = ava.listarAvaliacoes();
		for (Avaliacao avaliacao : listaAvaliacoes) {
			System.out.println("C�d. aluno....: " + avaliacao.getCodAluno());
			System.out.println("C�d. discipl..: " + avaliacao.getCodDisciplina());
			System.out.println("Nr. Avaliacao.: " + avaliacao.getNrAvaliacao());
			System.out.println("Vlr. Avaliacao: " + avaliacao.getVlrNota());
			System.out.println();
		}
	}
	
}
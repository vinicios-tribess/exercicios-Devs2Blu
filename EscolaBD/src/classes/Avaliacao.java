package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.Conexao;

public class Avaliacao {

    private int    codaluno;
    private int    coddisciplina;
    private int    nravaliacao;
    private Double vlrnota;

    public int getCodAluno() {
		return codaluno;
	}
	public void setCodAluno(int codAluno) {
		this.codaluno = codAluno;
	}
	public int getCodDisciplina() {
		return coddisciplina;
	}
	public void setCodDisciplina(int codDisciplina) {
		this.coddisciplina = codDisciplina;
	}
	public int getNrAvaliacao() {
		return nravaliacao;
	}
	public void setNrAvaliacao(int nrAvaliacao) {
		this.nravaliacao = nrAvaliacao;
	}
	public Double getVlrNota() {
		return vlrnota;
	}
	public void setVlrNota(Double vlrNota) {
		this.vlrnota = vlrNota;
	}
	
	public void incluirAvaliacao() {
		 try {
	        	Connection con = Conexao.conectar();
	    		String sql = "Insert into avaliacao(codaluno, coddisciplina, nravaliacao, vlrnota) values (?, ?, ?, ?)";
	        	
				PreparedStatement stm = con.prepareStatement(sql);
				stm.setInt(1, this.codaluno);
				stm.setInt(2, this.coddisciplina);
				stm.setInt(3, this.nravaliacao);
				stm.setDouble(4, this.vlrnota);
				stm.execute();
				System.out.println("Dados inseridos com sucesso!");
				Conexao.fecharConexao();
	        } catch (SQLException e) { 	
	        	e.printStackTrace();
	        	Conexao.fecharConexao();
	        }
    }
	
    public void alterarAvaliacao() {
        // TODO implement here
    }
    
    public void excluirAvaliacao() {
        // TODO implement here
    }
    
    public void consultarAvaliacao() {
        // TODO implement here
    }
    
    public void listarAvaliacoes() {
        // TODO implement here
    }
    
}
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    	try {
         	Connection con = Conexao.conectar();
     		String sql = "Update avaliacao SET codaluno=?, coddisciplina=?, nravaliacao=?, vlrnota=? WHERE codaluno=? AND coddisciplina=?";
         	
 			PreparedStatement stm = con.prepareStatement(sql);
 			stm.setInt(1, this.codaluno);
 			stm.setInt(2, this.coddisciplina);
 			stm.setInt(3, this.nravaliacao);
 			stm.setDouble(4, this.vlrnota);
 			stm.setInt(5, this.codaluno);
 			stm.setInt(6, this.coddisciplina);
 			stm.execute();
 			System.out.println("Dados atualizados com sucesso!");
 			Conexao.fecharConexao();
         } catch (SQLException e) {
         	e.printStackTrace();
         	Conexao.fecharConexao();
         }
    }
    
    public void excluirAvaliacao(int codaluno, int coddisciplina) {
    	try {
         	Connection con = Conexao.conectar();
     		String sql = "Delete from avaliacao WHERE codaluno=? AND coddisciplina=?";
         	
 			PreparedStatement stm = con.prepareStatement(sql);
 			stm.setInt(1, codaluno);
 			stm.setInt(2, coddisciplina);
 			stm.execute();
 			System.out.println("Registro excluído com sucesso!");
 			Conexao.fecharConexao();
         } catch (SQLException e) {
         	e.printStackTrace();
         	Conexao.fecharConexao();
         }
    }
    
    public Avaliacao consultarAvaliacao(int codaluno, int coddisciplina) {
    	Avaliacao ava = new Avaliacao();
		String sql = "Select * from avaliacao where codaluno=" + codaluno + " AND coddisciplina=" + coddisciplina;
		try {
			PreparedStatement stm  = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				ava.setCodAluno(rs.getInt("codaluno"));	
				ava.setCodDisciplina(rs.getInt("coddisciplina"));
				ava.setNrAvaliacao(rs.getInt("nravaliacao"));
				ava.setVlrNota(rs.getDouble("vlrnota"));
				Conexao.fecharConexao();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			Conexao.fecharConexao();
		}		
		return ava;
    }
    
    public List<Avaliacao> listarAvaliacoes() {
    	List<Avaliacao> lista = new ArrayList<>();
    	Connection con = Conexao.conectar();
    	String sql = "Select codaluno, coddisciplina, nravaliacao, vlrnota from avaliacao";
    	try {
    		PreparedStatement stm = con.prepareStatement(sql);
    		ResultSet rs = stm.executeQuery();
    		while (rs.next()) {
    			Avaliacao ava = new Avaliacao();
    			ava.setCodAluno(rs.getInt("codaluno"));
    			ava.setCodDisciplina(rs.getInt("coddisciplina"));
    			ava.setNrAvaliacao(rs.getInt("nravaliacao"));
				ava.setVlrNota(rs.getDouble("vlrnota"));
    			lista.add(ava);
    		}
    		Conexao.fecharConexao();
    	} catch (SQLException ex) {
    		System.out.println("Erro: " + ex.getMessage());
    		Conexao.fecharConexao();
    	}
		return lista;
    }
    
}
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.Conexao;

public class Disciplina {

    private int    coddisciplina;
    private String nomdisciplina;
    private String nomprofessor;
    private int    qtdavaliacoes;

    public int getCodDisciplina() {
		return coddisciplina;
	}
	public void setCodDisciplina(int codDisciplina) {
		this.coddisciplina = codDisciplina;
	}
	public String getNomDisciplina() {
		return nomdisciplina;
	}
	public void setNomDisciplina(String nomeDisciplina) {
		this.nomdisciplina = nomeDisciplina;
	}
	public String getNomProfessor() {
		return nomprofessor;
	}
	public void setNomProfessor(String nomeProfessor) {
		this.nomprofessor = nomeProfessor;
	}
	public int getQtdAvaliacoes() {
		return qtdavaliacoes;
	}
	public void setQtdAvaliacoes(int qtdavaliacoes) {
		this.qtdavaliacoes = qtdavaliacoes;
	}
	
	public void incluirDisciplina() {
		try {
        	Connection con = Conexao.conectar();
    		String sql = "Insert into disciplina(nomdisciplina, nomprofessor, qtdavaliacoes) values (?, ?, ?)";
        	
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, this.nomdisciplina);
			stm.setString(2, this.nomprofessor);
			stm.setInt(3, this.qtdavaliacoes);
			stm.execute();
			System.out.println("Dados inseridos com sucesso!");
			Conexao.fecharConexao();
        } catch (SQLException e) { 	
        	e.printStackTrace();
        	Conexao.fecharConexao();
        }
    }
	
    public void alterarDisciplina(int coddisciplina) {
    	try {
         	Connection con = Conexao.conectar();
     		String sql = "Update disciplina SET nomdisciplina=?, nomprofessor=?, qtdavaliacoes=? WHERE coddisciplina=?";
         	
 			PreparedStatement stm = con.prepareStatement(sql);
 			stm.setString(1, this.nomdisciplina);
			stm.setString(2, this.nomprofessor);
			stm.setInt(3, this.qtdavaliacoes);
			stm.setInt(4, coddisciplina);
			stm.execute();
 			System.out.println("Dados atualizados com sucesso!");
 			Conexao.fecharConexao();
         } catch (SQLException e) {
         	e.printStackTrace();
         	Conexao.fecharConexao();
         }
    }
    
    public void excluirDisciplina(int coddisciplina) {
    	try {
         	Connection con = Conexao.conectar();
     		String sql = "Delete from disciplina WHERE coddisciplina=?";
         	
 			PreparedStatement stm = con.prepareStatement(sql);
 			stm.setInt(1, coddisciplina);
 			stm.execute();
 			System.out.println("Registro excluído com sucesso!");
 			Conexao.fecharConexao();
         } catch (SQLException e) {
         	e.printStackTrace();
         	Conexao.fecharConexao();
         }
    }
    
    public Disciplina consultarDisciplina(int coddisciplina) {
    	Disciplina dis = new Disciplina();
		String sql = "Select * from disciplina where coddisciplina = " + coddisciplina;
		try {
			PreparedStatement stm  = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				dis.setNomDisciplina(rs.getString("coddisciplina"));	
				dis.setNomProfessor(rs.getString("nomprofessor"));
				dis.setQtdAvaliacoes(rs.getInt("qtdavaliacoes"));
				Conexao.fecharConexao();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			Conexao.fecharConexao();
		}		
		return dis;
    }

    public List<Disciplina> listarDisciplinas() {
    	List<Disciplina> lista = new ArrayList<>();
    	Connection con = Conexao.conectar();
    	String sql = "Select coddisciplina, nomdisciplina, nomprofessor, qtdavaliacoes from disciplina";
    	try {
    		PreparedStatement stm = con.prepareStatement(sql);
    		ResultSet rs = stm.executeQuery();
    		while (rs.next()) {
    			Disciplina dis = new Disciplina();
    			dis.setCodDisciplina(rs.getInt("coddisciplina"));
    			dis.setNomDisciplina(rs.getString("nomdisciplina"));
    			dis.setNomProfessor(rs.getString("nomprofessor"));
				dis.setQtdAvaliacoes(rs.getInt("qtdavaliacoes"));
    			lista.add(dis);
    		}
    		Conexao.fecharConexao();
    	} catch (SQLException ex) {
    		System.out.println("Erro: " + ex.getMessage());
    		Conexao.fecharConexao();
    	}
		return lista;
    }

}
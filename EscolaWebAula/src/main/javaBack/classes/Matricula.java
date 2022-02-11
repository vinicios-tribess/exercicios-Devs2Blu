package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.Conexao;

public class Matricula {

    private int codaluno;
	private int coddisciplina;
    private Date dtmatricula;
    private String statusmatricula;
    
    public int getCodAluno() {
		return codaluno;
	}
	public void setCodAluno(int codaluno) {
		this.codaluno = codaluno;
	}
	public int getCodDisciplina() {
		return coddisciplina;
	}
	public void setCodDisciplina(int coddisciplina) {
		this.coddisciplina = coddisciplina;
	}
	public Date getDtMatricula() {
		return dtmatricula;
	}
	public void setDtMatricula(Date dtmatricula) {
		this.dtmatricula = dtmatricula;
	}
	public String getStatusMatricula() {
		return statusmatricula;
	}
	public void setStatusMatricula(String statusmatricula) {
		this.statusmatricula = statusmatricula;
	}
	
    public void incluirMatricula() {
    	try {
        	Connection con = Conexao.conectar();
    		String sql = "Insert into matricula(codaluno, coddisciplina, dtmatricula, statusmatricula) values (?, ?, ?, ?)";
        	
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, this.codaluno);
			stm.setInt(2, this.coddisciplina);
			stm.setDate(3, this.dtmatricula);
			stm.setString(4, this.statusmatricula);
			stm.execute();
			System.out.println("Dados inseridos com sucesso!");
			Conexao.fecharConexao();
        } catch (SQLException e) { 	
        	e.printStackTrace();
        	Conexao.fecharConexao();
        }
    }
    
    public void alterarMatricula() {
    	try {
         	Connection con = Conexao.conectar();
     		String sql = "Update matricula SET codaluno=?, coddisciplina=?, dtmatricula=?, statusmatricula=? WHERE codaluno=? AND coddisciplina=?";
         	
 			PreparedStatement stm = con.prepareStatement(sql);
 			stm.setInt(1, this.codaluno);
 			stm.setInt(2, this.coddisciplina);
 			stm.setDate(3, this.dtmatricula);
 			stm.setString(4, this.statusmatricula);
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
    
    public void excluirMatricula(int codaluno, int coddisciplina) {
    	try {
         	Connection con = Conexao.conectar();
     		String sql = "Delete from matricula WHERE codaluno=? AND coddisciplina=?";
         	
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
    
    public Matricula consultarMatricula(int codaluno, int coddisciplina) {
    	Matricula mat = new Matricula();
		String sql = "Select * from matricula where codaluno=" + codaluno + " AND coddisciplina=" + coddisciplina;
		try {
			PreparedStatement stm  = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				mat.setCodAluno(rs.getInt("codaluno"));	
				mat.setCodDisciplina(rs.getInt("coddisciplina"));
				mat.setDtMatricula(rs.getDate("dtmatricula"));
				mat.setStatusMatricula(rs.getString("statusmatricula"));
				Conexao.fecharConexao();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			Conexao.fecharConexao();
		}		
		return mat;
    }
    
    public List<Matricula> listarMatriculas() {
    	List<Matricula> lista = new ArrayList<>();
    	Connection con = Conexao.conectar();
    	String sql = "Select codaluno, coddisciplina, dtmatricula, statusmatricula from matricula";
    	try {
    		PreparedStatement stm = con.prepareStatement(sql);
    		ResultSet rs = stm.executeQuery();
    		while (rs.next()) {
    			Matricula mat = new Matricula();
    			mat.setCodAluno(rs.getInt("codaluno"));
    			mat.setCodDisciplina(rs.getInt("coddisciplina"));
    			mat.setDtMatricula(rs.getDate("dtmatricula"));
				mat.setStatusMatricula(rs.getString("statusmatricula"));
    			lista.add(mat);
    		}
    		Conexao.fecharConexao();
    	} catch (SQLException ex) {
    		System.out.println("Erro: " + ex.getMessage());
    		Conexao.fecharConexao();
    	}
		return lista;
    }

}
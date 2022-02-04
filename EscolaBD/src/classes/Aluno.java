package classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.Conexao;

public class Aluno {

    private int    codaluno;
	private String nomaluno;
    private String nommae;
    private String nompai;
    private Date   datanasc;
    private Double medaluno;
    private String sitaluno;
    
    public int getCodaluno() {
		return codaluno;
	}
	public void setCodaluno(int codAluno) {
		this.codaluno = codAluno;
	}
	public String getNomaluno() {
		return nomaluno;
	}
	public void setNomaluno(String nomaluno) {
		this.nomaluno = nomaluno;
	}
	public String getNommae() {
		return nommae;
	}
	public void setNommae(String nommae) {
		this.nommae = nommae;
	}
	public String getNompai() {
		return nompai;
	}
	public void setNompai(String nompai) {
		this.nompai = nompai;
	}
	public Date getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}
	public Double getMedaluno() {
		return medaluno;
	}
	public void setMedaluno(Double medaluno) {
		this.medaluno = medaluno;
	}
	public String getSitaluno() {
		return sitaluno;
	}
	public void setSitaluno(String sitaluno) {
		this.sitaluno = sitaluno;
	}

    public void incluirAluno() {
        try {
        	Connection con = Conexao.conectar();
    		String sql = "Insert into aluno(nomaluno, nommae, nompai, datanasc, medaluno, sitaluno) values (?, ?, ?, ?, ?, ?)";
        	
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, this.nomaluno);
			stm.setString(2, this.nommae);
			stm.setString(3, this.nompai);
			stm.setDate(4, this.datanasc);
			stm.setDouble(5, this.medaluno);
			stm.setString(6, this.sitaluno);
			stm.execute();
			System.out.println("Dados inseridos com sucesso!");
			Conexao.fecharConexao();
        } catch (SQLException e) { 	
        	e.printStackTrace();
        	Conexao.fecharConexao();
        }
    }

    public void alterarAluno(int codAlterar) {
    	 try {
         	Connection con = Conexao.conectar();
     		String sql = "Update aluno SET nomaluno=?, nommae=?, nompai=?, datanasc=?, medaluno=?, sitaluno=? WHERE codaluno=?";
         	
 			PreparedStatement stm = con.prepareStatement(sql);
 			stm.setString(1, this.nomaluno);
 			stm.setString(2, this.nommae);
 			stm.setString(3, this.nompai);
 			stm.setDate(4, this.datanasc);
 			stm.setDouble(5, this.medaluno);
 			stm.setString(6, this.sitaluno);
 			stm.setInt(7, codAlterar);
 			stm.execute();
 			System.out.println("Dados atualizados com sucesso!");
 			Conexao.fecharConexao();
         } catch (SQLException e) {
         	e.printStackTrace();
         	Conexao.fecharConexao();
         }
    }

    public void excluirAluno(int codExcluir) {
    	try {
         	Connection con = Conexao.conectar();
     		String sql = "Delete from aluno WHERE codaluno=?";
         	
 			PreparedStatement stm = con.prepareStatement(sql);
 			stm.setInt(1, codExcluir);
 			stm.execute();
 			System.out.println("Registro excluído com sucesso!");
 			Conexao.fecharConexao();
         } catch (SQLException e) {
         	e.printStackTrace();
         	Conexao.fecharConexao();
         }
    }

    public Aluno consultarAluno(int codConsultar) {
		Aluno alu = new Aluno();
		String sql = "Select * from aluno where codaluno = " + codConsultar;
		try {
			PreparedStatement stm  = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				alu.setNomaluno(rs.getString("nomaluno"));	
				alu.setNommae(rs.getString("nommae"));
				alu.setNompai(rs.getString("nompai"));
				alu.setDatanasc(rs.getDate("datanasc"));
				alu.setMedaluno(rs.getDouble("medaluno"));
				alu.setSitaluno(rs.getString("sitaluno"));
				Conexao.fecharConexao();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			Conexao.fecharConexao();
		}		
		return alu;
	}

    public List<Aluno> listarAlunos() {
    	List<Aluno> lista = new ArrayList<>();
    	Connection con = Conexao.conectar();
    	String sql = "Select codaluno, nomaluno, nommae, nompai, datanasc, medaluno, sitaluno from aluno";
    	try {
    		PreparedStatement stm = con.prepareStatement(sql);
    		ResultSet rs = stm.executeQuery();
    		while (rs.next()) {
    			Aluno alu = new Aluno();
    			alu.setCodaluno(rs.getInt("codaluno"));
    			alu.setNomaluno(rs.getString("nomaluno"));
    			alu.setNommae(rs.getString("nommae"));
				alu.setNompai(rs.getString("nompai"));
				alu.setDatanasc(rs.getDate("datanasc"));
				alu.setMedaluno(rs.getDouble("medaluno"));
				alu.setSitaluno(rs.getString("sitaluno"));
    			lista.add(alu);
    		}
    		Conexao.fecharConexao();
    	} catch (SQLException ex) {
    		System.out.println("Erro: " + ex.getMessage());
    		Conexao.fecharConexao();
    	}
		return lista;
    }

}
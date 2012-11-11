package a.b.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestJava {
	
	Integer rg = 15;
	
	private String selectAtribute = "SELECT aluno_name, aluno_rg, aluno_end FROM ALUNO WHERE usuario_rg = "+rg+"";
	
	static{
		
		String updateTeste = "UPDATE ALUNO SET ALUNO_name = ?, ALUNO_sobrenome = ?, WHERE ALUNO_name=?";
	
		Pattern pattern = Pattern.compile("^\\W\\s*select", Pattern.CASE_INSENSITIVE);
		
	}
	
	
	public TestJava() {
		String sql = "select * from PESQUISADORES";
		
		Set<String> selecSet = new HashSet<String>();
		
	}


	public void teste() throws SQLException{
		
		Connection conn = null;
		Statement st = null;
		
		conn = DriverManager.getConnection("URL", "USER", "PASSWORD");
		
		st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("select * from employe");
		
		String rafa = "Rafael";
	}
	
	
}
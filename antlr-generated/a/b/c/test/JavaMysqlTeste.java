package a.b.c.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.br.connection.factory.ConnectionFactory;

/**
 *
 * @author rafaeldurelli
 */
public class JavaMysqlTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        

//      // This will load the MySQL driver, each DB has its own driver
//      Class.forName("com.mysql.jdbc.Driver");
//      // Setup the connection with the DB
//      Connection connection = DriverManager
//          .getConnection("jdbc:mysql://localhost/project", "root", "root" );
      

    	Connection connection = ConnectionFactory.getInstance();
    	
    	Statement stmt = connection.createStatement();
      
      String table = "ALUNO";
      
      ResultSet rSet = stmt.executeQuery("SELECT * FROM " + table);
      
      ResultSetMetaData rsMeta = rSet.getMetaData();
      
      System.out.println(rsMeta.getColumnCount());
      
        for (int i = 0; i < rsMeta.getColumnCount(); i++) {
            
            System.out.println(rsMeta.getColumnTypeName(i + 1));
            System.out.println(rsMeta.getColumnType(i + 1));
            System.out.println(rsMeta.getColumnDisplaySize(i + 1));
            System.out.println(rsMeta.getColumnName(i + 1));
            System.out.println(rsMeta.isAutoIncrement(i + 1));
            
        }
      
      System.out.println("Conectou ");
    }
}


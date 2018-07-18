package daos;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.junit.Test;

public class DataSourceConnectionTest {
	
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://127.0.0.1:3306/jbossdb";
    private static final String USER = "root";
    private static final String PASSWORD = "passw0rd";
    
       
    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testLookUp() throws Exception {
    	
    	//java:jboss/datasources/MariaDBDS
    	String DATASOURCE_CONTEXT = "jboss/datasources/MariaDBDS";
        
        Connection result = null;	
    	try {
    	      Context initialContext = new InitialContext();
    	      
    	      DataSource datasource = (DataSource)initialContext.lookup(DATASOURCE_CONTEXT);
    	      if (datasource != null) {
    	        result = datasource.getConnection();
    	      }
    	      else {
    	    	  System.out.println("Failed to lookup datasource.");
    	      }
    	    }
    	    catch ( NamingException ex ) {
    	    	System.out.println("Cannot get connection1: " + ex);
    	    }
    	    catch(SQLException ex){
    	    	System.out.println("Cannot get connection2: " + ex);
    	    }
    	    System.out.println(result);
    }
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.util.Properties;


public class Database {
	
	public Connection Get_Connection() throws Exception
	{
	
				
				
		try
		{
		
			//Properties props = new Properties();
			//FileInputStream fis = null;
			  // FileInputStream in = new FileInputStream("WEB-INF/db.properties");
			   //props.load(in);
			   //in.close();

			   String connectionURL = "jdbc:mysql://localhost:3306/dbheloo";
		       Connection connection = null;
		       Class.forName("com.mysql.jdbc.Driver").newInstance();
		       connection = DriverManager.getConnection(connectionURL, "root", "");
	    
			   
			   //String username = props.getProperty("MYSQL_DB_USERNAME");
			   //String password = props.getProperty("MYSQL_DB_PASSWORD");
			
			   

					   
					
					
					
	    return connection;
		}
		catch (SQLException e)
		{
			System.out.println("errorsql");
		throw e;	
		}
		catch (Exception e)
		{
		throw e;	
		}
	}

}

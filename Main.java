package M5_Activities.Seatwork2;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class Main {


	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String URL="jdbc:postgresql://localhost:5432/training_db";
		String USER="gstcscania";
		String PASSWORD="";
		
		try(Connection conn=DriverManager.getConnection(URL,USER,PASSWORD))
		{
			System.out.println("Connected to PostgresSQL sucessfully");
			
		}
		catch(Exception e)
		{
			System.out.println("Connected failed");e.printStackTrace();
		}
		
		
		
		

	}
}
		



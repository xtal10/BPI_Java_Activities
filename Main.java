package M5_Activities.Seatwork3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		String URL="jdbc:postgresql://localhost:5432/training_db";
		String USER="gstcscania";
		String PASSWORD="";
		Scanner scanner=new Scanner(System.in);
		
		Statement statement =null;
		Connection connection = null;
		ResultSet resultSet =null;
		

		
		try
		{
			connection=DriverManager.getConnection(URL,USER,PASSWORD);
			
			
			//Statements
			statement=connection.createStatement();
			
		
			
			int choice = 1;
			while (choice!=0)
			{
			
				//Query
				String insertQuery="INSERT INTO STUDENTS (name, age, email) VALUES (?, ?, ?);";
				String selectQuery="SElECT id,name,age,email from students;";
				String selectWhereQuery="select count(*) from students where id = ?;";
				
				PreparedStatement pstmt=connection.prepareStatement(insertQuery);
				
				resultSet=statement.executeQuery(selectQuery);
				
			System.out.println("===== Student COURSES MANAGEMENT =====");
			System.out.println("1.Add Student");
			System.out.println("2.Add Course");
			System.out.println("3.Show Student");
			System.out.println("4.Show Courses");
			System.out.println("0.Exit");
			System.out.print("Choose an option: ");
			choice=scanner.nextInt();
			
			if(choice==1)
				{
	
					System.out.print("Enter Name:");
					String sName=scanner.next();
					pstmt.setString(1, sName);
					System.out.print("Enter Age:");
					int sAge = scanner.nextInt();
					pstmt.setInt(2, sAge);
					System.out.print("Enter Email:");
					String sEmail = scanner.next();
					pstmt.setString(3, sEmail);
					
					
					System.out.println("Student added successfully!");
					
				
					
				}
			else if (choice==2) 
				{
				insertQuery="INSERT INTO COURSES (student_id, course_name, grade) VALUES (?, ?, ?);";
				PreparedStatement pstmtC=connection.prepareStatement(insertQuery);
				
				System.out.println("ID | Name | Age | Email");
				
				while(resultSet.next())
					{
					int id=resultSet.getInt("id");
					
					String name=resultSet.getString("name");
					String email=resultSet.getString("email");
					
					System.out.println(id + " | "+name +" | "+email +" | ");
					}
				System.out.print("Enter Student ID:");
					int cId = scanner.nextInt();
					PreparedStatement pstmtw = connection.prepareStatement(selectWhereQuery);
					pstmtw.setInt(1, cId);
					
					// validate if Student number exist
					ResultSet rs = pstmtw.executeQuery();
					if(rs.next() && rs.getInt(1)>0)
						{
						pstmtC.setInt(1, cId);
						System.out.print("Enter course name:");
						String cCourseName=scanner.next();
						pstmtC.setString(2, cCourseName);
					System.out.print("Enter grade:");
						int cGrade=scanner.nextInt();
						pstmtC.setInt(3, cGrade);
						pstmtC.executeUpdate();
					System.out.println("Course Added successfully!");
							
						}
					else {
						System.out.println("Student Id not exist!");
					}
				
				//	
			
					
				
				
				}
			else if (choice==3)
				{
				//print result
				System.out.println("ID | Name | Age | Email");
				
				while(resultSet.next())
					{
					int id=resultSet.getInt("id");
					String name=resultSet.getString("name");
					String email=resultSet.getString("email");
					
					System.out.println(id + " | "+name +" | "+email +" | ");
					}
					
				}
			else if (choice ==4)
				{
				selectQuery="SELECT c.ID,c.COURSE_NAME,c.GRADE,s.name  "
						+ " FROM courses as c  "
						+ "inner join students as s "
						+ "on s.id=c.student_id;";
				resultSet=statement.executeQuery(selectQuery);
				
				System.out.println("ID | Course_name | Grade | Student Name");
				while(resultSet.next())
					{
					int id=resultSet.getInt("Id");
					String courseName=resultSet.getString("course_name");
					int grade=resultSet.getInt("Grade");
					String Name=resultSet.getString("Name");
				
					System.out.println(id + " | "+courseName +" | "+grade +" | "+Name+" | ");
					}
				
				}
			else if (choice==0)
				{
					System.out.println("Existing the program, Goodbye!");
				}
			else 
				{
					System.out.println("Invalid Choices");
				}
				
			}
			
			
			
		}
		catch(SQLException e )
		{
			System.out.println("Invalid SQL Operations");e.printStackTrace();
		}
		catch(RuntimeException e)
			{
			System.out.println("Invalid Input");e.printStackTrace();
			}
		finally 
			{
			try {
				resultSet.close();
				connection.close();
				statement.close();
				}
			catch(SQLException e) {
				e.printStackTrace();
			}
			}
		
		
	
	}

}

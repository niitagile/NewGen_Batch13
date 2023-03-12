package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CrudDrive {
	public static void insertRecord() {

		Scanner s=new Scanner(System.in);
		System.out.print("Enter ID : ");
		int id=s.nextInt();
		System.out.print("Enter Name : ");
		String name=s.next();
		System.out.print("Enter english marks : ");
		int marks=s.nextInt();

		try {
			//step1 load the driver class  

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//step2 create  the connection object 


			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=company;integratedSecurity=true;encrypt=true;trustServerCertificate=true");
			//step3 create the statement object 
			
			String str="Insert into student(rollno,name, marks) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(str);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, marks);
			int ans =ps.executeUpdate();
			if(ans>0)
				System.out.println("Record inserted");

			//System.out.println("Record Inserted");
			con.close();	
		} catch (Exception e) {
			System.out.println("Problem");
			e.printStackTrace();
		}
	}


	public static void selectRecord(){  

		try{  
			//step1 load the driver class  

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//step2 create  the connection object 


			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=company;integratedSecurity=true;encrypt=true;trustServerCertificate=true");
			//step3 create the statement object  
			Statement stmt=con.createStatement();  

			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from student");  //id int, name varchar(40)
			while(rs.next())  {
				
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			}
			//step5 close the connection object

			con.close();  

		}catch(Exception e){ e.printStackTrace();}  



	}  

public static void main(String[] args) {
	while(true) {
	System.out.println("Enter your choice 1. insert 2. select 0. exit");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	switch(choice) {
	case 1: insertRecord();break;
	case 2: selectRecord();break;
	case 0: System.out.println("bye");System.exit(0);
	}
	}
}

}

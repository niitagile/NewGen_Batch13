package jdbc;


import java.sql.*;
import java.util.*;
public class DeleteDemo {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
       
        System.out.print("Enter english marks : ");
        int marks=s.nextInt();
        
        try {
        	//step1 load the driver class  

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//step2 create  the connection object 
			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\databasename", "username", "password");
			//step3 create the statement object 
           //create table student(rollno int,stud_name varchar(20), english int);
			String str="update student set marks=? where id=?";
            PreparedStatement ps=con.prepareStatement(str);
            ps.setInt(1, marks);
             ps.setInt(2, id);
            int ans =ps.executeUpdate();
            if(ans>0)
            	System.out.println("Record updated");
            
            //System.out.println("Record Inserted");
            
        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
}

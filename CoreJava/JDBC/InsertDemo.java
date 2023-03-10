package jdbc;


import java.sql.*;
import java.util.*;
public class InsertDemo {
    public static void main(String[] args) {
        
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


			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\databasename", "username", "password");
			//step3 create the statement object 
           //create table student(rollno int,stud_name varchar(20), english int);
			//insert into studnt(rollno,stud_name,english) values(1,"Siddesh",89);
            String str="Insert into student(rollno,stud_name, marks) values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(str);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, marks);
            int ans =ps.executeUpdate();
            if(ans>0)
            	System.out.println("Record inserted");
            
            //System.out.println("Record Inserted");
            
        } catch (Exception e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }
}

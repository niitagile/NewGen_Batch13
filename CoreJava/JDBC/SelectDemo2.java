package jdbc;
import java.sql.*;
import java.util.Scanner; 
class SelectDemo2{  
	public static void main(String args[]){  

		try{  
			
			Scanner s=new Scanner(System.in);
	        System.out.print("Enter ID : ");
	        int id=s.nextInt();
			//step1 load the driver class  

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//step2 create  the connection object 
			
			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\databasename", "username", "password");
			//step3 create the statement object  
			PreparedStatement stmt=con.prepareStatement("select * from employee where id >?");  
				stmt.setInt(1,id );
			//step4 execute query  
			ResultSet rs=stmt.executeQuery();  //id int, name varchar(40)
/*  id   name
 *_  1    Anish
 *  2    Mani
 *  3    Kavi
 * 
 */
			
			
			while(rs.next())  {
				//System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			}
			//step5 close the connection object

			con.close();  

		}catch(Exception e){ e.printStackTrace();}  



	}  
}

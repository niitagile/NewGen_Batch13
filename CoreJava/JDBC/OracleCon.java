package jdbc;
import java.sql.*; 
class OracleCon{  
	public static void main(String args[]){  

		try{  
			//step1 load the driver class  

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//step2 create  the connection object 


			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\databasename", "username", "password");
			//step3 create the statement object  
			Statement stmt=con.createStatement();  

			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from employee");  //id int, name varchar(40)
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

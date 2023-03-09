package jdbc;

import java.sql.*;

public class ResultUpdate {
	public static void main (String[] args)       {
		Connection conn = null;
		try
		{

			//step1 load the driver class  

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//step2 create  the connection object 

			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\databasename", "username", "password");
			//step3 create the statement object  
			/*CONCUR_READ_ONLY- Default, TYPE_FORWARD_ONLY,TYPE_SCROLL_SENSESITIVE- if any changes will occur in database 
	  after creation of resultset, Then it will  be reflected in resultset*/
			Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT E.* FROM EMPLoyee E");
			System.out.println("Before...");
			System.out.println("ECODE  EName");
			while (rs.next() ) {
				System.out.println( rs.getInt(1) +"      "+rs.getString(2));
			}
			//inserting a new row
			/*rs.moveToInsertRow();
			rs.updateInt("Empid", 1);
			rs.updateString("Empname", "Geeta");
			rs.insertRow();*/
			//updating 2nd row � changing name to Seetha
			rs.absolute(2); 
			rs.updateString("Empname","Seetha"); 
			rs.updateRow(); 

			rs.beforeFirst();      
			System.out.println("After...");
			//rs.updateString("Ename", "Geeta");
			while (rs.next() ) {
				System.out.println( rs.getInt(1) +"      "+rs.getString(2));}}
		catch (Exception e) {  
			System.out.println (e); e.printStackTrace();
		}
	}
}


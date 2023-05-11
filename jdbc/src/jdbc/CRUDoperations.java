package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class CRUDoperations {
	
	static Connection connection = null;
	static Statement statement = null;
	
	public static void main(String[] args) {
		DBconnection();
		insertdelay(5,"ml","pcc scanning issue");
//		deletedelay (3);
//		Updatedelay(1,"e",null);
//		createTable ();
		getDelays();
		
		
	}
	static void DBconnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/delays","root","Hemanth@123");
			statement = connection.createStatement();
			
		}catch(Exception e) {
			System.out.println(e);
		}
				
	}
	
	static void createTable () {
		try {
			statement.execute("create table 5L41 (sno int , delayType varchar(100) , delaydiscription varchar(100));");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	static void getDelays() {
		try {
			ResultSet rs = statement.executeQuery("select * from 2L33");
			System.out.println("sno                   delayType                         delaydiscription   ");
			System.out.println("--------------------------------------------------------------------------------");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"                          "+rs.getString(2)+"                           " + rs.getString(3));
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	static void Updatedelay (int sno , String delayType , String delaydiscription)  {
		
		if (delayType == null && delaydiscription != null) {
			
		String query = "update 2L33 set delaydiscription = '"+delaydiscription+"' where sno =" + sno;
		System.out.println(query);
		try {
			statement.execute(query);
			System.out.println(sno+" s no  Record updated successfully");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		}
		else {
			String query = "update 2L33 set delayType = '"+delayType+"' where sno =" + sno;
			System.out.println(query);
			System.out.println(sno+" s no  Record updated successfully");
			try {
				statement.execute(query);
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		
	}
	static void insertdelay (int sno ,String delayType , String delaydiscription )  {
		String query = "insert into 2L33 values ("+sno+",'"+delayType+"','"+delaydiscription+"');";
		
		
		try {
			statement.execute(query);
			System.out.println(sno+" S no record inserted successfully");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	static void deletedelay (int sno )  {
		String query = "delete from 2L33 where sno = "+sno;
		
		
		try {
			statement.execute(query);
			System.out.println(sno+" s no record deleted successfully");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}

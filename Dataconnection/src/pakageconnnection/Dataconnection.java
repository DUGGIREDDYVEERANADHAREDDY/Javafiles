package pakageconnnection;
import java.sql.*;

import com.mysql.cj.jdbc.Driver;
public class Dataconnection {
	private static Connection con;
	public Statement st;
	public Dataconnection()throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//con=DriverManager.getConnection("jdbc:mysql//localhost:3306/veera","root","root");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/veera?","root","root");
		System.out.println("dataconnection succesfully");
		
	}
	public static Connection getconnection()throws SQLException, ClassNotFoundException
	{
		Dataconnection c2= new Dataconnection();
		return con;
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getconnection();
	}

}

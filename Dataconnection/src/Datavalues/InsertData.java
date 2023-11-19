package Datavalues;
import java.util.*;

import pakageconnnection.Dataconnection;

import java.sql.*;
public class InsertData {
	private Connection con;
	PreparedStatement sat;
	Scanner sc;
	public InsertData() throws SQLException, ClassNotFoundException
	{
		con=Dataconnection.getconnection();
		sc= new Scanner(System.in);
	}
	public void insert()
	{
		//Datavalues dt = new Datavalues();
		System.out.println("enter how many you want");
		int x = sc.nextInt();
		for(int i =0;i<x;i++)
		{
			Datavalues dt = new Datavalues();
			System.out.println("enter numer");
			dt.setNumber(sc.nextInt());
			System.out.println("enter name");
			dt.setSt(sc.next());
			System.out.println("enter salary");
			dt.setSal(sc.nextDouble());
			
		}
	}

}

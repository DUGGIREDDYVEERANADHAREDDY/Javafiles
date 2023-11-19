package com.dom.project;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Insertvalues {
	Scanner sc;
	List<Employee> employee;
	
	public Insertvalues()
	{
		sc =new Scanner(System.in);
		employee = new ArrayList<Employee>();
		
	}
	public void insert()
	{
		System.out.println("enter the how many employee you want");
		int x = sc.nextInt();
		for(int i=0;i<x;i++)
		{
			Employee em = new Employee();
			System.out.println("enter employee id");
			em.setId(sc.nextInt());
			System.out.println("enter employee name");
			em.setName(sc.next());
			System.out.println("enter employee salary");
			em.setSal(sc.nextDouble());
			System.out.println("enter dpt name");
			em.setDptname(sc.next());
			employee.add(em);
		}
	}
	public void display()
	{
		for(Employee str:employee)
		{
			System.out.println("emp name"+str.getName());
			System.out.println("emp id"+str.getId());
			System.out.println("emp salary"+str.getSal());
			System.out.println("dpt name"+str.getDptname());
		}
	}
	public void search()
	{
		System.out.println("enter the searching name");
		String sr  =sc.next();
		for(Employee str:employee)
		{
			if(str.getName().equals(sr)) {
				System.out.println("The name succesfully found");
				System.out.println("name is"+str.getName());
				System.out.println("dp name "+str.getDptname());
				System.out.println("salary"+str.getSal());
			}
		}
	}
	public static void main(String[] args) {
		Insertvalues in = new Insertvalues();
		in.insert();
		in.display();
		in.search();
		
	}

}

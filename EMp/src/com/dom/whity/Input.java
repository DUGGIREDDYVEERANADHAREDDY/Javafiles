package com.dom.whity;
import java.util.*;
public class Input {
	List<Em> sr;
	Scanner sc;
	public Input()
	{
		sr = new ArrayList<Em>();
		sc = new Scanner(System.in);
	}
	public void insert()
	{
		System.out.println("enter empoyees");
		int x =sc.nextInt();
		for(int i=0;i<x;i++)
		{
			Em em = new Em();
			System.out.println("enter employee id ");
			em.setId(sc.nextInt());
			System.out.println("enter employee name ");
			em.setName(sc.next());
			System.out.println("enter employee salary");
			em.setSalray(sc.nextDouble());
			sr.add(em);
		}
	}
	public void search() {
		System.out.println("Enter  searching  empoloyee name:");
        String sr2 = sc.next();
	    for (Em st1 : sr) {
	        /*System.out.println("Enter name:");
	        String sr2 = sc.next();*/
	        if (st1.getName().equals(sr2)) {
	        	System.out.println("name found sucesfully");
	        	System.out.println("the name is"+st1.getName());
				System.out.println("the id is "+st1.getId());
				System.out.println("the salry is "+st1.getSalray());
	        	// Exit the loop after finding the first matching object
	        }
	    }
	}
	public void display()
	{
		for(Em st:sr)
		{
			System.out.println("the name is"+st.getName());
			System.out.println("the id is "+st.getId());
			System.out.println("the salry is "+st.getSalray());
			
		}
		//System.out.println("the name is"+);
	}
	public static void main(String[] args) {
		Input in  = new Input();
		in.insert();
		//in.search();
		in.display();
		in.search();
	}
	

}

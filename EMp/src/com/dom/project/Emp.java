package com.dom.project;
import java.util.*;
public class Emp {
	 public List<EMPR> st;
	 Scanner sc;
	 public Emp()
	 {
		 st = new ArrayList<EMPR>();
		 sc = new Scanner(System.in);
	 }
	 public void accept()
	 {
		 System.out.println("enter  many student");
		 int x = sc.nextInt();
		 for(int i =0;i<x;i++)
		 {
			 EMPR e = new EMPR();
			 System.out.println("enter student id");
			 e.setId(sc.nextInt());
			 System.out.println("enter student name");
			 e.setName(sc.next());
			 System.out.println("enter roll number");
			 e.setRollnumber(sc.nextInt());
			 st.add(e);
		 }
		 
	 }
	 public void display()
	 {
		 for(EMPR sr:st)
		 {
			 System.out.println("student id"+sr.getId());
			 System.out.println("student name"+sr.getName());
			 System.out.println("student rollnumber"+sr.getRollnumber());
		 }

		 
	 }
	 public static void main(String[] args) {
		Emp sm = new Emp();
		sm.accept();
		sm.display();
	}
	 

}

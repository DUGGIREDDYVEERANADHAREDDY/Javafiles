package com.dom.project;
import java.util.*;
public class Defalut {
	Scanner sc;
	public Defalut()
	{
		sc = new Scanner(System.in);
	}
	public void insert()
	{
		System.out.println("enter id");
		int num1= sc.nextInt();
		System.out.println("enter name");
		String str2 = sc.next();
		System.out.println("the name is "+str2);
		System.out.println("the id is "+num1);
	}
	public static void main(String[] args) {
		 Defalut de = new  Defalut();
		 de.insert();
	}

}

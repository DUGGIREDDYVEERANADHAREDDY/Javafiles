package com.dom.project;
import java.util.*;
public class Arraycode {
	List<String> st ;
	public Arraycode()
	{
		st = new ArrayList<String>();
	}
	public void insert()
	{
		st.add("laksmi");
		st.add("helo");
		st.add("java");
		System.out.println(st);
	}
	public static void main(String[] args) {
		Arraycode  arr = new Arraycode ();
		arr.insert();
	}
}

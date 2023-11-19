package com.dom.project;
import java.util.*;
public class Array {
	List<String> st;
	public Array()
	{
		st =new ArrayList<String>();
	}
	public void insert()
	{
		st.add("veera");
		st.add("lakshmi");
		st.add("chaitra");
		System.out.println("the values are"+st);
	}
	public static void main(String[] args) {
		Array arr= new Array();
		arr.insert();
	}
	

}

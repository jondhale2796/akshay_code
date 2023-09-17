package com.java;

public class ss1 {

	public static void main(String[] args) {
		String  as="prakash ,#akshay";
		//StringBuffer sb=new StringBuffer(as);
		//String pp=as.substring(5,7);
		//sb
		String pp=as.replaceAll("\\s,#","");
		
          System.out.println(pp);
	}

}

package com.bayviewglen.AdressBooks;

public class Contact {
	private String lname;
	private String fname;
	private String phone;
	
	public Contact(){
		lname = null;
		fname = null;
		phone = null;
	}
	
	public Contact(String last, String first, String phone){
		lname = last;
		fname = first;
		this.phone  = phone;
	}
	
}

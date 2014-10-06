package com.bayviewglen.AdressBookWithHashMap;

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

	public String getLastName(){
		return lname;
	}

	public String getFirstName(){
		return fname;
	}

	public String getPhone(){
		return phone;
	}

	public void changeLastName(String last){
		lname = last;
	}

	public void changeFirstName(String first){
		fname = first;
	}

	public void changePhone(String phone){
		this.phone = phone;
	}
	public void displayContact(){
		System.out.println(lname + ", " + fname + ": " + phone);
	}

}

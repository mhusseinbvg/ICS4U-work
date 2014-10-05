package com.bayviewglen.AdressBooks;

import java.util.ArrayList;

public class AddressBook {
	private ArrayList<Contact> AddressBook;

	public AddressBook(){
		AddressBook = new ArrayList<Contact>();
	}

	public void addContact(Contact toBeAdded){
		AddressBook.add(toBeAdded);
	}
	
	public void removeAll(){
		AddressBook.clear();
	}

	public void delete(Contact toBeRemoved){
		for(int i = 0; i < AddressBook.size(); ++i){
			if(AddressBook.get(i).equals(toBeRemoved)){
				AddressBook.remove(i);
				break;
			}
		}
	}

	public Contact search(String name){
		for(Contact x: AddressBook){
			if(x.getFirstName().equals(name) || x.getLastName().equals(name)){
				x.displayContact();
				return x;
			}
			
		}
		System.out.println("Nothing was found");
		return null;
	}

	public Contact searchNum(String number){
		for(Contact x: AddressBook){
			if(x.getPhone().equals(number))
				x.displayContact();
				return x;
		}
		System.out.println("Nothing was found");
		return null;
	}
	

	public void displayAll(){
		for(int i = 0; i < AddressBook.size(); ++i){
			System.out.print((i +1) +":");
			AddressBook.get(i).displayContact();
			System.out.println();
		}
	}
}

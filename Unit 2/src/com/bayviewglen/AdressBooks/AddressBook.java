package com.bayviewglen.AdressBooks;

import java.util.ArrayList;

public class AddressBook {
	private ArrayList<Contact> AddressBook;

	public AddressBook(){
		AddressBook = new ArrayList<Contact>();
	}

	public void addAdress(Contact toBeAdded){
		AddressBook.add(toBeAdded);
	}

	public void removeAdress(Contact toBeRemoved){
		for(int i = 0; i < AddressBook.size(); ++i){
			if(AddressBook.get(i).equals(toBeRemoved)){
				AddressBook.remove(i);
				break;
			}
		}
	}

	public void search(String name){
		for(Contact x: AddressBook){
			if(x.getFirstName().equals(name) || x.getLastName().equals(name))
				x.displayContact();
		}
		System.out.println("Nothing was found");
	}

	public void search(Contact toBeSearched){
		for(Contact x: AddressBook){
			if(x.equals(toBeSearched))
				x.displayContact();;
		}
		System.out.println("Nothing was found");
	}

	public void displayAll(){
		for(int i = 0; i < AddressBook.size(); ++i){
			System.out.print((i +1) +":");
			AddressBook.get(i).displayContact();
			System.out.println();
		}
	}
}

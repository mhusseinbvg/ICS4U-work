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
}

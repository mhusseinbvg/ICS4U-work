package com.bayviewglen.AdressBookWithHashMap;

import java.util.HashMap;
import java.util.Map;

public class AddressBooks {
	private Map<String , Contacts> AddressBook =  new HashMap<String , Contacts>();

	public AddressBooks(){
		AddressBook = new HashMap<String , Contacts>();
	}

	public void addContact( Contacts contact){
		AddressBook.put(contact.getPhone() ,contact);
	}

	public void removeAll(){
		AddressBook.clear();
	}

	public void delete(Contacts toBeRemoved){
		String theKey = null;
		for(String key : AddressBook.keySet()){
			if(AddressBook.get(key).equals(toBeRemoved))
				theKey = key;
		}
		AddressBook.remove(theKey);
	}


	public Contacts search(String name){
		for(String key: AddressBook.keySet()){
			if(AddressBook.get(key).getFirstName().equals(name) || AddressBook.get(key).getLastName().equals(name)){
				AddressBook.get(key).displayContact();
				return AddressBook.get(key);
			}
		}
		System.out.println("Nothing was found");
		return null;
	}

	public Contacts searchNum(String number){
		for(String key: AddressBook.keySet()){
			if(key.equals(number)){
				AddressBook.get(key).displayContact();
				return AddressBook.get(key);
			}
		}
		System.out.println("Nothing was found");
		return null;
	}

	public void displayAll(){
		int i = 1;
		for(String key:AddressBook.keySet()){
			System.out.print((i) +":");
			AddressBook.get(key).displayContact();
			System.out.println();
			i ++;
		}
	}

	
}




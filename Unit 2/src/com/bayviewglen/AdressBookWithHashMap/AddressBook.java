package com.bayviewglen.AdressBookWithHashMap;

import java.util.HashMap;
import java.util.Map;
public class AddressBook {
	private Map<String , Contact> AddressBook =  new HashMap<String , Contact>();

	public AddressBook(){
		AddressBook = new HashMap<String , Contact>();
	}

	public void addContact(Contact toBeAdded){
		AddressBook.put(toBeAdded.getPhone() ,toBeAdded);
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
		for(String key: AddressBook.keySet()){
			if(AddressBook.get(key).getFirstName().equals(name) || AddressBook.get(key).getLastName().equals(name)){
				AddressBook.get(key).displayContact();
				return AddressBook.get(key);
			}
		}
		System.out.println("Nothing was found");
		return null;
	}

	public Contact searchNum(String number){
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




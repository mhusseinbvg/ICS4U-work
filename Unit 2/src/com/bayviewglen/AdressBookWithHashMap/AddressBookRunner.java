package com.bayviewglen.AdressBookWithHashMap;

import java.util.Scanner;



public class AddressBookRunner {

	public static void main(String[] args) {

		AddressBooks mainOne = new AddressBooks();
		String command;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello what would you like to do?");
		System.out.println("1) Create new AdressBook");
		System.out.println("2) Load previous AdressBook");
		command = scanner.nextLine();
		if(command.equals("1"))
			create(mainOne);
		else if(command.equals("2"))
			load(mainOne);
		else{
			System.out.println("Enter in a valid number command");
			System.out.println("1) Create new AdressBook");
			System.out.println("2) Load previous AdressBook");
			command = scanner.nextLine();
		}

		System.out.println("What would you like to do now?");
		System.out.println("1) Add new contact");
		System.out.println("2) Remove old contact");
		System.out.println("3) Remove all contacts");
		System.out.println("4) Search for contact");
		System.out.println("5) Display all conacts");
		System.out.println("6) Save and quit");
		command = scanner.nextLine();
		if(command.equals("1")){
			add(mainOne);
		}else if(command.equals("2")){
			remove(mainOne);
		}else if(command.equals("3")){
			removeAll(mainOne);
		}else if(command.equals("4")){
			search(mainOne);
		}else if(command.equals("5")){
			displayAll(mainOne);
		}else if(command.equals("6")){
			quit();
		}else{
			System.out.println("Please enter a valid response");
			System.out.println("What would you like to do now?");
			System.out.println("1) Add new contact");
			System.out.println("2) Remove old contact");
			System.out.println("3) Remove all contacts");
			System.out.println("4) Search for contact");
			System.out.println("5) Display all conacts");
			System.out.println("6) Save and quit");
			command = scanner.nextLine();
		}
		scanner .close();
	}

	private static void quit() {
		System.out.println("Thanks for using addressBooks. Your changes will now be saved");
		System.out.println("Progress has been saved hope to see you again");
		save();
		System.exit(0);

	}

	private static void save() {
		//I'll figure this one out eventually

	}

	private static void displayAll(AddressBooks mainOne) {
		mainOne.displayAll();
	}

	private static void search(AddressBooks mainOne) {
		System.out.println("Enter search parameter:");
		System.out.println("1) By name");
		System.out.println("2) By Number");
		Scanner scanner = new Scanner(System.in);
		String search = scanner.nextLine();
		if(search.equals("1")){
			System.out.println("Enter the name you would like to search for:");
			search = scanner.nextLine();
			mainOne.search(search);
		}else if(search.equals("2")){
			System.out.println("Enter the number you would like to search for:");
			search = scanner.nextLine();
			mainOne.searchNum(search);
		}else{
			System.out.println("Enter a valid number");
		}

		scanner.close();
	}

	private static void removeAll(AddressBooks mainOne) {
		mainOne.removeAll();

	}

	private static void remove(AddressBooks mainOne) {
		System.out.println("Enter search parameter:");
		System.out.println("1) By name");
		System.out.println("2) By Number");
		Scanner scanner = new Scanner(System.in);
		String search = scanner.nextLine();
		if(search.equals("1")){
			System.out.println("Enter the name you would like to delete :");
			search = scanner.nextLine();
			mainOne.delete(mainOne.search(search));
		}else if(search.equals("2")){
			System.out.println("Enter the number you would like to search for:");
			search = scanner.nextLine();
			mainOne.delete(mainOne.searchNum(search));
		}else{
			System.out.println("Enter a valid number");
		}

		scanner.close();

	}

	private static void add(AddressBooks mainOne) {
		System.out.println("Please enter contact last name:");
		Scanner scanner = new Scanner(System.in);
		String lname = scanner.nextLine();
		System.out.println("Please enter contact first name:");
		String fname = scanner.nextLine();
		System.out.println("Please enter contact number:");
		String number = scanner.nextLine();
		Contacts contact = new Contacts(lname, fname, number);
		mainOne.addContact(contact);
		scanner.close();
	}

	
	private static void load(AddressBooks mainOne) {
		// TODO Auto-generated method stub

	}

	private static void create(AddressBooks mainOne) {
		// TODO Auto-generated method stub

	}



}

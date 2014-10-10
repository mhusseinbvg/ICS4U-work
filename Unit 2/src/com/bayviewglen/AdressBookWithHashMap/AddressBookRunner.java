package com.bayviewglen.AdressBookWithHashMap;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class AddressBookRunner {

	public static void main(String[] args) {
		boolean needAnswer = true;
		AddressBooks mainOne = new AddressBooks();
		String command;
		Scanner scanner = new Scanner(System.in);
		String fileLoaded = null;

		System.out.println("Hello what would you like to do?");
		System.out.println("1) Load  AdressBook");
		command = scanner.nextLine();					
		while(needAnswer){	
			if(command.equals("1")){							
				fileLoaded = load(mainOne, fileLoaded);
				needAnswer = false;
			}
			else{
				System.out.println("Enter in a valid number command");
				System.out.println("1) Create new AdressBook");
			}
		}
		needAnswer = true;
		System.out.println("What would you like to do now?");
		System.out.println("1) Add new contact");
		System.out.println("2) Remove old contact");
		System.out.println("3) Remove all contacts");
		System.out.println("4) Search for contact");
		System.out.println("5) Display all conacts");
		System.out.println("6) Save and quit");
		command = scanner.nextLine();
		while(needAnswer){
			if(command.equals("1")){
				add(mainOne);
				needAnswer = false;
			}else if(command.equals("2")){
				remove(mainOne);
				needAnswer = false;
			}else if(command.equals("3")){
				removeAll(mainOne);
				needAnswer = false;
			}else if(command.equals("4")){
				search(mainOne);
				needAnswer = false;
			}else if(command.equals("5")){
				displayAll(mainOne);
				needAnswer = false;
			}else if(command.equals("6")){
				quit(fileLoaded , mainOne);
				needAnswer = false;
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
		}
		scanner .close();
	}

	private static void quit(String fileLoaded , AddressBooks mainOne) {
		System.out.println("Thanks for using addressBooks. Your changes will now be saved");
		System.out.println("Progress has been saved hope to see you again");
		try {
			save(fileLoaded , mainOne);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);

	}

	private static void save(String fileLoaded, AddressBooks mainOne) throws FileNotFoundException {
		//I'll figure this one out eventually
		PrintWriter writer = new PrintWriter(fileLoaded);
		for(String key : mainOne.getMap().keySet()){
			writer.println(mainOne.getMap().get(key).getLastName());
			writer.println(mainOne.getMap().get(key).getFirstName());
			writer.println(mainOne.getMap().get(key).getPhone());
		}

		writer.close();
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


	private static String load(AddressBooks mainOne, String fileLoaded) {
		Scanner scanner = new Scanner(System.in);
		Scanner fileScanner = null;
		boolean neddAnswer = true;
		System.out.println("Which addressBook would you like to load?");
		System.out.println("1)AddressBook1");
		System.out.println("2)AddressBook2");
		System.out.println("3)AddressBook3");
		while(neddAnswer){
			String fileToLoad = scanner.nextLine();
			if(fileToLoad.equals("1")){
				fileScanner = new Scanner("input/AddressBook1.txt");
				fileLoaded = "AddressBook1.txt";
			}else if(fileToLoad.equals("2")){
				fileScanner = new Scanner("input/AddressBook2.txt");
				fileLoaded = "AddressBook2.txt";
			}else if(fileToLoad.equals("3")){
				fileScanner = new Scanner("input/AddressBook3.txt");
				fileLoaded = "AddressBook3.txt";
			}else{
				System.out.println("Enter a valid number!!!! The system will now end");
				System.exit(0);
			}
		}
		while(fileScanner.hasNext()){
			try{
				fileScanner.nextLine();
				String tempL = fileScanner.nextLine();
				String tempF = fileScanner.nextLine();
				String tempP = fileScanner.nextLine();
				Contacts temp = new Contacts(tempL, tempF, tempP);
				mainOne.addContact(temp);
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		System.out.println("File has been loaded");
		scanner.close();
		fileScanner.close();
		return fileLoaded;
	}




}

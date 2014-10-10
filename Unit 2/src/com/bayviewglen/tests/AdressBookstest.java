package com.bayviewglen.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bayviewglen.AdressBookWithHashMap.AddressBooks;
import com.bayviewglen.AdressBookWithHashMap.Contacts;

public class AdressBookstest {
	Contacts test = new Contacts("Hussein" , "Mohamed" , "6473342345");
	AddressBooks test1 = new AddressBooks();
	
	//test1.addContact(test);
	//need to figure out how to get that contact added to test1
	@Test
	public void testAddContact() {
		assertEquals("Should return the conact I added" ,test , test1.searchNum(test.getPhone()));
	}

	@Test
	public void testRemoveAll() {
		assertEquals("Should return null", null , test1.searchNum(test.getPhone()));
	}

	@Test
	public void testDelete() {
		assertEquals("Should also return null", null , test1.searchNum(test.getPhone()));
	}

	@Test
	public void testSearch() {
		assertEquals("Should return the contact at the top" , test , test1.searchNum(test.getPhone()));
	}

	@Test
	public void testSearchNum() {
		assertEquals("Not yet implemented", test , test1.search(test.getFirstName()));
	}

}

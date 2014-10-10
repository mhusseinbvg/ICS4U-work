package com.bayviewglen.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bayviewglen.AdressBookWithHashMap.Contacts;

public class ContactsTest {

	Contacts test = new Contacts("Hussein", "Mohamed", "555-9043");
	
	@Test
	public void testGetLastName() {
		assertEquals("This should be Hussein" , "Hussein" , test.getLastName());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("This should Mohamed" , "Mohamed", test.getFirstName());
	}

	@Test
	public void testGetPhone() {
		assertEquals("This should be the right number" , "555-9043" , test.getPhone());
	}

}

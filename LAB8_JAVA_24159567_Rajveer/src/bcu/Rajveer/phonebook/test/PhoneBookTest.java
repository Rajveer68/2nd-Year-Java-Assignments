package bcu.Rajveer.phonebook.test;
import bcu.Rajveer.phonebook.model.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;  
import java.util.Collections;

public class PhoneBookTest {
	private final PhoneBook phoneBook = new PhoneBook();
	
	@Test
	public void testAddEntry() throws Exception {
		phoneBook.addEntry("Rajveer", "12345");
		PhoneBookEntry entry = phoneBook.getEntry("Rajveer");
		assertEquals("12345", entry.getPhoneNumber());
	}
	
	@Test
	public void testUpdateEntry() throws Exception {
		phoneBook.addEntry("Rajveer", "12345");
		phoneBook.updateEntry("Rajveer", "67890");
		PhoneBookEntry entry = phoneBook.getEntry("Rajveer");
		assertEquals("67890", entry.getPhoneNumber());
	}
	
	@Test
	public void testRemoveEntry() throws Exception {
		phoneBook.addEntry("Rajveer", "12345");
		phoneBook.removeEntry("Rajveer");
		try {
			phoneBook.getEntry("Rajveer");
			fail();
		} catch(NotPresentException ex) {
			// test passes
		}
	}
	
	@Test
	public void testGetNamesEmpty() throws Exception {
		assertEquals(Collections.emptyList(), phoneBook.getAllNames());
	}
	
	@Test
	public void testGetAllNames() throws Exception {
		phoneBook.addEntry("Rajveer", "12345");
		phoneBook.addEntry("Vikram", "24680");
		phoneBook.addEntry("Harman", "67890");
		assertEquals(
			Arrays.asList("Harman", "Rajveer", "Vikram"),
			phoneBook.getAllNames()
		);
	}
	
	@Test(expected = AlreadyPresentException.class)
	public void testAddEntryAlreadyPresent() throws Exception {
		phoneBook.addEntry("Rajveer", "12345");
		phoneBook.addEntry("Rajveer", "67890");
	}
	
	@Test(expected = NotPresentException.class)
	public void testGetEntryNotPresent() throws Exception {
		phoneBook.getEntry("Rajveer");
	}
	
	@Test(expected = NotPresentException.class)
	public void testUpdateEntryNotPresent() throws Exception {
		phoneBook.updateEntry("Rajveer", "67890");
	}
	
	@Test(expected = NotPresentException.class)
	public void testRemoveEntryNotPresent() throws Exception {
		phoneBook.removeEntry("Rajveer");
	}
}

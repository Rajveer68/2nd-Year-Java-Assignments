package bcu.Rajveer.phonebook.main;
import bcu.Rajveer.phonebook.model.*;

/**
 * @author 24159567
 *
 */ 
public interface Command {
	public void execute (PhoneBook phoneBook)
			throws AlreadyPresentException, NotPresentException;
	
}

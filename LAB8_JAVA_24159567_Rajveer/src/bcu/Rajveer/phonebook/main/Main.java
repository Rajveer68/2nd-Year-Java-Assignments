package bcu.Rajveer.phonebook.main;
import bcu.Rajveer.phonebook.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
 
public class Main {
	public static final String HELP_MESSAGE
		= "Commands:\n" +
		"    add [name] [phoneNumber]        add a new entry\n" +
		"    show [name]                     show an entry\n" +
		"    update [name] [phoneNumber]     update an entry\n" +
		"    remove [name]                   remove an entry\n" +
		"    list                            show all names\n" +
		"    help                            show this help message\n" +
		"    exit                            exit the program";
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private final PhoneBook phoneBook;
	
	public Main() {
		this.phoneBook = new PhoneBook();
	}
	
	public Main(PhoneBook phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	public void run() throws IOException {
		BufferedReader keyboard = new BufferedReader(
			new InputStreamReader(System.in)
		);
		
		System.out.println("Address book");
		while(true) {
			System.out.print("> ");
			String command = keyboard.readLine();
			if("exit".equalsIgnoreCase(command)) {
				break;
			}
			
            try {
                parseAndExecute(command);
            } catch(AlreadyPresentException ex) {
                System.out.println("The entry for " + ex.getName() + " already exists.");
            } catch(NotPresentException ex) {
                System.out.println("The entry for " + ex.getName() + " does not exist.");
            } catch(InvalidCommandException ex) {
                System.out.println("Invalid command (enter 'help' to see the valid commands).");
            }
        }
    }

    // New method: parse only, return a Command
    public Command parse(String command) throws InvalidCommandException {
        String[] parts = command.split(" ");
        String firstPart = parts[0];

        if ("add".equalsIgnoreCase(firstPart)) {
            return new AddCommand(parts);
        } else if ("show".equalsIgnoreCase(firstPart)) {
            return new ShowCommand(parts);
        } else if ("update".equalsIgnoreCase(firstPart)) {
            return new UpdateCommand(parts);
        } else if ("remove".equalsIgnoreCase(firstPart)) {
            return new RemoveCommand(parts);
        } else if ("list".equalsIgnoreCase(firstPart)) {
            return new ListCommand(parts);
        } else if ("help".equalsIgnoreCase(firstPart)) {
            return new HelpCommand(parts);
        } else {
            throw new InvalidCommandException();
        }
    }

    // New parseAndExecute method delegates to parse + execute
    public void parseAndExecute(String command) throws AlreadyPresentException, NotPresentException, InvalidCommandException {
        Command cmd = parse(command);
        cmd.execute(phoneBook);
    }
}

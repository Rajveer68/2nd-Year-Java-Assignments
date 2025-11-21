package bcu.Rajveer.phonebook.main;
import bcu.Rajveer.phonebook.model.*;

public class HelpCommand implements Command {
    public HelpCommand(String[] parts) throws InvalidCommandException {
        if (parts.length != 1) {
            throw new InvalidCommandException();
        }
    }

    @Override
    public void execute(PhoneBook phoneBook) {
        System.out.println(Main.HELP_MESSAGE);
    }
}

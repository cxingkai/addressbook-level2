package seedu.addressbook.commands;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.UniquePersonList;

import java.util.*;


/**
 * Lists all persons in the address book to the user.
 */
public class SortCommand extends Command{

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book based on their name in alphabetical order.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<Person> allPersons = addressBook.getAllPersons().mutableListView();
        Collections.sort(allPersons, new SortByName());
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}

class SortByName implements Comparator<Person>{
    public int compare(Person personA, Person personB){
        return personA.getName().toString().compareTo(personB.getName().toString());
    }
}
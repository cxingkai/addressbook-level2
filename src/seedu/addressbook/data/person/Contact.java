package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
    public final String value;
    private boolean isPrivate;

    public Contact(String name, boolean isPrivate) {
        this.value = name.trim();
        this.isPrivate = isPrivate;
    }

    public void checkValid(String regex, String message) throws IllegalValueException{
        if (!value.matches(regex)){
            throw new IllegalValueException(message);
        }
    }
}

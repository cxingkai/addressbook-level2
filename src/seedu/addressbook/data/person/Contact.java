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

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}

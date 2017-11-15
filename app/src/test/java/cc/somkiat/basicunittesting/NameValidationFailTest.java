package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    private String message;
    private String result;

    @Test
    public void NameIsNull() {
        NameValidation validation = new NameValidation();
        message = "Name is null.";
        result = validation.validate(null);
        assertTrue("Fail!!! "+message, message.equals(result));
    }

    @Test
    public void NameIsEmpty() {
        NameValidation validation = new NameValidation();
        message = "Name is empty.";
        result = validation.validate("");
        assertTrue("Fail!!! "+message, message.equals(result));
    }

    @Test
    public void NameHaveSpecialsAlphabet() {
        NameValidation validation = new NameValidation();
        message = "Name is specials alphabet.";
        result = validation.validate("@>N.S<@");
        assertTrue("Fail!!! "+message, message.equals(result));
    }

    @Test
    public void NameContainNumber() {
        NameValidation validation = new NameValidation();
        message = "Name contain number.";
        result = validation.validate("12123saii12121");
        assertTrue("Fail!!! "+message, message.equals(result));
    }

    @Test
    public void NameIsLessThanFive() {
        NameValidation validation = new NameValidation();
        message = "Name is less than 5.";
        result = validation.validate("Hii");
        assertTrue("Fail!!! "+message, message.equals(result));
    }

    @Test
    public void NameIsMoreThanTwenty() {
        NameValidation validation = new NameValidation();
        message = "Name is more than 20.";
        result = validation.validate("abcdefghijklmnopqrstwvxyz");
        assertTrue("Fail!!! "+message, message.equals(result));
    }
}

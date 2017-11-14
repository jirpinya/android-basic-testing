package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    private String status = "invalidate";

    @Test(expected = NameException.class)
    public void NameIsEmpty() throws NameException {
            NameValidation validation = new NameValidation();
            validation.isEmpty("");
            String result = validation.getStatus();
            assertTrue("Fail!!! Name is empty.", status.equals(result));
    }

    @Test(expected = NameException.class)
    public void NameIsNull() throws NameException {
        NameValidation validation = new NameValidation();
        validation.isNull(null);
        String result = validation.getStatus();
        assertTrue("Fail!!! Name is null.", status.equals(result));
    }

    @Test(expected = NameException.class)
    public void NameHaveSpecialsAlphabet() throws NameException {
        NameValidation validation = new NameValidation();
        validation.isSpecialsAlphabet("@>N.S<@");
        String result = validation.getStatus();
        assertTrue("Fail!!! Name have specials alphabet.",status.equals(result));
    }

    @Test(expected = NameException.class)
    public void NameContainSpace() throws NameException {
        NameValidation validation = new NameValidation();
        validation.isContainSpace("sai jirapinya");
        String result = validation.getStatus();
        assertTrue("Fail!!! Name contain space", status.equals(result));
    }

    @Test(expected = NameException.class)
    public void NameContainNumber() throws NameException {
        NameValidation validation = new NameValidation();
        validation.isContainNumber("12123saii12121");
        String result = validation.getStatus();
        assertTrue("Fail!!! Name contain number.", status.equals(result));
    }

    @Test(expected = NameException.class)
    public void NameIsLessThanFive() throws NameException {
        NameValidation validation = new NameValidation();
        validation.isLessThanFive("Hii");
        String result = validation.getStatus();
        assertTrue("Fail!!! Name is less than 5", status.equals(result));
    }

    @Test(expected = NameException.class)
    public void NameIsMoreThanTwenty() throws NameException {
        NameValidation validation = new NameValidation();
        validation.isMoreThanTwenty("abcdefghijklmnopqrstwvxyz");
        String result = validation.getStatus();
        assertTrue("Fail!!! Name is more than 20", status.equals(result));
    }
}

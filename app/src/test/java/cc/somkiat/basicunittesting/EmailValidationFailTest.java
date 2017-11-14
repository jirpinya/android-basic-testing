package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class EmailValidationFailTest {

    private String status = "invalidate";

    @Test(expected = EmailException.class)
    public void EmailIsEmpty() throws EmailException{
        EmailValidation validation = new EmailValidation();
        validation.isEmpty("");
        String result = validation.getStatus();
        assertTrue("Fail!!! Email is empty.", status.equals(result));
    }
    @Test(expected = EmailException.class)
    public void EmailIsNull() throws EmailException {
        EmailValidation validation = new EmailValidation();
        validation.isNull(null);
        String result = validation.getStatus();
        assertTrue("Fail!!! Email is null.", status.equals(result));
    }

    @Test(expected = EmailException.class)
    public void EmailIsNotValidation() throws EmailException {
        EmailValidation validation = new EmailValidation();
        validation.emailIsNotPattern("%%@gmail.com");
        String result = validation.getStatus();
        assertTrue("Fail!!! Email is not pattern.", status.equals(result));
    }
}

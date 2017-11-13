package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class EmailValidationFailTest {

    @Test
    public void EmailIsEmpty(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isEmpty("");
        assertTrue("Fail!!! Email is empty.", result);
    }
    @Test
    public void EmailIsNull(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isNull(null);
        assertTrue("Fail!!! Email is null.", result);
    }

    @Test
    public void EmailIsNotValidation(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isNull("%%3jir__*()@gmail.com");
        assertFalse("Fail!!! Email is not validation.", result);
    }
}

package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Validation.EmailValidation;

import static junit.framework.Assert.assertTrue;

public class EmailValidationFailTest {

    private String message;
    private String result;
    
    @Test
    public void EmailIsNull(){
        EmailValidation validation = new EmailValidation();
        message = "Email is null.";
        result = validation.validate(null);
        assertTrue("Fail!!! "+message, message.equals(result));
    }

    @Test
    public void EmailIsEmpty(){
        EmailValidation validation = new EmailValidation();
        message = "Email is empty.";
        result = validation.validate("");
        assertTrue("Fail!!! "+message, message.equals(result));
    }

    @Test
    public void EmailIsNotValidation(){
        EmailValidation validation = new EmailValidation();
        message = "Email is not pattern.";
        result = validation.validate("---%%%555@gmail.com");
        assertTrue("Fail!!! "+message, message.equals(result));
    }
}

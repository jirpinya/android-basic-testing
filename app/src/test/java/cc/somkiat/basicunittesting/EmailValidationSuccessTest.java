package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class EmailValidationSuccessTest {

    private String status = "validate";

    @Test
    public void normalEmail() throws EmailException{
        EmailValidation validation = new EmailValidation();
        String result = validation.validate("jirapinya@gmail.com");
        assertTrue("Success email validate!!", status.equals(result));
    }
}

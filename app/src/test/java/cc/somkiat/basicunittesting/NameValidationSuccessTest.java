package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class NameValidationSuccessTest {

    private String message = "Success name validate!!";

    @Test
    public void normalName() throws NameException {
        NameValidation validation = new NameValidation();
        String result = validation.validate("JIRAPINYA");
        assertTrue(message, message.equals(result));
    }
}

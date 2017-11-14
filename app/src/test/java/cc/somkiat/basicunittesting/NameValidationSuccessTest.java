package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class NameValidationSuccessTest {

    private String status = "validate";

    @Test
    public void normalName() throws NameException {
        NameValidation validation = new NameValidation();
        String result = validation.validate("JIRAPINYA");
        assertTrue("Success name validate!!", status.equals(result));
    }
}

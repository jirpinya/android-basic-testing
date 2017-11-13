package cc.somkiat.basicunittesting;

import junit.framework.Assert;

import org.junit.Test;

public class NameValidationSuccessTest {
    @Test
    public void normalName() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("JIRAPINYA");
        Assert.assertTrue(result);
    }
}

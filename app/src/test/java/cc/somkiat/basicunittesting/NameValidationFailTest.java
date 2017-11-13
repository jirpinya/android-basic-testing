package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void NameIsEmpty(){
            NameValidation validation = new NameValidation();
            boolean result = validation.nameIsEmpty("");
            assertFalse("Fail!!! Name is empty.", result);
    }

    @Test
    public void NameIsNull(){
        NameValidation validation = new NameValidation();
        boolean result = validation.nameIsNull(null);
        assertFalse("Fail!!! Name is null.", result);
    }

}

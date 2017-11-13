package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    @Test
    public void NameIsEmpty(){
            NameValidation validation = new NameValidation();
            boolean result = validation.isEmpty("");
            assertTrue("Fail!!! Name is empty.", result);
    }

    @Test
    public void NameIsNull(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isNull(null);
        assertTrue("Fail!!! Name is null.", result);
    }

    @Test
    public void NameHaveSpecialsAlphabet(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isAlphabet("@>N.S<@");
        assertFalse("Fail!!! Name have alphabet.", result);
    }

    @Test
    public void NameContainNumber(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isContainNumber("12123saii12121");
        assertTrue("Fail!!! Name have number.", result);
    }


}

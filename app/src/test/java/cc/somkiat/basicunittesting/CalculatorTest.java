package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void สองบวกสองได้สี่ไงละ(){
        Calculator calculator = new Calculator();
        int result = calculator.plus(2,2);
        assertEquals(4, result);    //(คำตอบที่ถูก, ผลลัพท์)

    }

    @Test
    public void เจ็ดบวกสองได้เก้าไงละ(){
        Calculator calculator = new Calculator();
        int result = calculator.plus(7,2);
        assertEquals(9, result);    //(คำตอบที่ถูก, ผลลัพท์)

    }
}

package by.training.array.service;

import by.training.array.util.imp.ValidatorString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidatorStringTest {

    @DataProvider(name = "valid_string")
    public Object[][] createData() {
        Object[][] data = new Object[19][2];
        data[0] = new Object[]{"5 1 -1 0 -3", true};
        data[1] = new Object[]{"   4", true};
        data[2] = new Object[]{" 3   3^", false};
        data[3] = new Object[]{"5 1", true};
        data[4] = new Object[]{"", true};
        data[5] = new Object[]{" 72     234", true};
        data[6] = new Object[]{"           ", true};
        data[7] = new Object[]{"", true};
        data[8] = new Object[]{"3;;4", false};
        data[9] = new Object[]{" d 34", false};
        data[10] = new Object[]{"34 a 2f", false};
        data[11] = new Object[]{" 8   -123  -2  5", true};
        data[12] = new Object[]{"8;3;4", true};
        data[13] = new Object[]{"3 - --5 - 7", false};
        data[14] = new Object[]{"4,6,8", true};
        data[15] = new Object[]{"4, 5, 254, -5, 25", true};
        data[16] = new Object[]{"4, 5, 25,", true};
        data[17] = new Object[]{"1z1 21 32", false};
        data[18] = new Object[]{"8;3$4", false};
        return data;
    }

    @Test(dataProvider = "valid_string")
    public void testStringValidation(String str, boolean expected) {

        ValidatorString validatorString = new ValidatorString();
        boolean actual = validatorString.stringValidation(str);
        assertEquals(actual, expected, str + " - Invalid!");

    }
}
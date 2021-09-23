package org.example.testParsingString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class LettersCountServiceImplTest {
    Map<String, LetterCountResponse> actualResultMap = new HashMap<>();

    @Before
    public void createActualResultTest() {
        actualResultMap.put("test", new LetterCountResponse("t",2));
        actualResultMap.put("tester", new LetterCountResponse("e",2));
    }

    @Test
    public void lettersCountServiceImplStringTest() {
        LettersCountService lettersCountService = new LettersCountService();
        LetterCountResponse expectedResult = lettersCountService.pars("test");
        Assert.assertEquals(expectedResult, actualResultMap.get("test"));
    }

    @Test
    public void lettersCountServiceImplStringTester() {
        LettersCountService lettersCountService = new LettersCountService();
        LetterCountResponse expectedResult = lettersCountService.pars("tester");
        Assert.assertEquals(expectedResult, actualResultMap.get("tester"));
    }
}

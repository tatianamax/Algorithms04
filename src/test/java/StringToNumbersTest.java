import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {
//    15.	Написать алгоритм StringToNumbers,
//    который принимает строку, и возвращает массив чисел:
//    Test Data:
//            “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}

    @Test

    public void testStringToNumbersTestHappyPathTest(){
        String str = "1, 2, 3, 4, 5";
       int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers ss = new StringToNumbers();
        int[] actualResult = ss.stringToNumbersMethod(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}

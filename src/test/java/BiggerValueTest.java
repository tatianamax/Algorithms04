import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

//4.	Напишите алгоритм BiggerValue,
//    который из двух параметров типа int возвращает бОльшее значение.
//    Test Data:
//            3333, 9999
//    Expected Result = 9999

    BiggerValue bv;
    @Test
    public void testBiggerValueTestHappyPathBiggerValue(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueMethod(a,b);
        Assertions.assertEquals(expectedResult,actualResult);

    }


}

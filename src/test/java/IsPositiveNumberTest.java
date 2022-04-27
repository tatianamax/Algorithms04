import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
//5.	Напишите алгоритм IsPositiveNumber,
//    который возвращает true, если численный  параметр больше или равен нулю,
//    и возвращает false, если параметр меньше 0.
//    Проверьте работу метода на числах 555, 0 и -555.


    @Test
    public void testIsPositiveNumberTestHappyPathTest(){
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber in = new IsPositiveNumber();
        boolean actualResult = in.IsPositiveNumberMethod(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testIsPositiveNumberTestHappyPathTest1(){
        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber in = new IsPositiveNumber();
        boolean actualResult = in.IsPositiveNumberMethod(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testIsPositiveNumberTestHappyPathTest2(){
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber in = new IsPositiveNumber();
        boolean actualResult = in.IsPositiveNumberMethod(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }


}

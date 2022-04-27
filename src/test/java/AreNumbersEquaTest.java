import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEquaTest {
//    Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
//0, если числа равны
//-1, если первое число меньше второго
//1, если первое число больше второго
//
//    Test Data:
//            89, 89
//    Expected result: 0
//            -89, 89
//    Expected result: -1
//            89, -89
//    Expected result: 1

    @Test
    public void testAreNumbersEquaTestHappyPathTest() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqua aa = new AreNumbersEqua();
        int actualResult = aa.AreNumbersEquaMethod(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEquaTestHappyPathTest1() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqua aa = new AreNumbersEqua();
        int actualResult = aa.AreNumbersEquaMethod(a, b);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testAreNumbersEquaTestHappyPathTest2() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqua aa = new AreNumbersEqua();
        int actualResult = aa.AreNumbersEquaMethod(a, b);
        Assertions.assertEquals(expectedResult, actualResult);

    }

}

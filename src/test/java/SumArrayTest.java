import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
//3.	Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//
//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

    SumArray sa;
    @Test
    public void testSumArrayTestHappyPatchSumArray(){
        int[] result = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        SumArray sa = new SumArray();

        int actualResult = sa.sumArrayMethod(result);
        Assertions.assertEquals(expectedResult,actualResult);

    }@Test
    public void testSumArrayTestHappyPatchSumArray1(){
        int[] result = {-7,-3};
        int expectedResult = -10;
        SumArray sa = new SumArray();

        int actualResult = sa.sumArrayMethod(result);
        Assertions.assertEquals(expectedResult,actualResult);

    }

}

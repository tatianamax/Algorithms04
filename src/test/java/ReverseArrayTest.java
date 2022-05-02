import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
//    Написать алгоритм ReverseArray,
//    который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
//    Test Data:
//    {2, 7, 3, 10} → {10, 3, 7, 2}
    @Test
    public void testreverseArrayTestHappyPathTest(){
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(array);
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

}

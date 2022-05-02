import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElementTest {
//    Написать алгоритм PeakElement,
//    который принимает на вход массив целых чисел
//    и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
//    Test Data:
//    {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Test
    public void testPeakElementTestHappyPathTest(){

        int[] a = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pt = new PeakElement();
        int[] actauiResult = pt.peakElement(a);
        Assertions.assertArrayEquals(expectedResult,actauiResult);

    }


}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {
//    Написать алгоритм SortArray,
//    который принимает на вход массив целых чисел,
//    и сортирует элементы массива в порядке возрастания.
//    Test Data:
//    {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

    @Test
    public void testSortArrayTestHappyPath(){
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArrayAlgorithm(array);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

}

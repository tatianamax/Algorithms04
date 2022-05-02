import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {
//    Написать алгоритм SumOfTwo,
//    который принимает на вход массив целых чисел,  и число n.
//    Алгоритм  возвращает пары элементов, которые в сумме дают число n.
//    Test Data:
//            ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}

    @Test
    public void testSumOfTwoTestHappyPath(){
        int[] a = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.sumOfTwoAlgoritm(a,sum);
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

}

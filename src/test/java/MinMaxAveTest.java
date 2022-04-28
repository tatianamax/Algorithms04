import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
//    Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
//    Алгоритм возвращает массив, который содержит минимальное значение,
//    максимальное значение,  и среднее среди всех значений между 2-мя индексами.
//
//    Test Data:
//            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    @Test
    public void testMinMaxAveTestHappyPathTest(){
        int min = 2;
        int max = 6;
        int[] numbers = {1,2,3,4,5,6,7,8};
        double[] expectedResult = {3,7,5};

        MinMaxAve ma = new MinMaxAve();
        double[] actualResult = ma.minMaxAveAlgorithm(numbers, min,  max);
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }


}

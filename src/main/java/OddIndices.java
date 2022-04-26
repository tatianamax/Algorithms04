import java.util.Arrays;

public class OddIndices {


//    Написать алгоритм OddIndices, который принимает массив чисел,
//    и возвращает массив значений нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    public int[] oddIndicesMethod(int[] array){
        int[] result = new int[array.length/2];
        int index = 0;
        for(int i = 1; i < array.length; i+=2){
            result[index++] = array[i];
        }
        return result;
    }

}

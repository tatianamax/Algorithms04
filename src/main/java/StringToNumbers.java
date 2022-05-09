import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class StringToNumbers {
//    15.	Написать алгоритм StringToNumbers,
//    который принимает строку, и возвращает массив чисел:
//    Test Data:
//            “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    public int[] stringToNumbersMethod(String str) {
        String[] words =str.split(", ");
        int[] result = new int [words.length];
        for(int i = 0; i < words.length; i++){
            result[i] = parseInt(words[i]);
        }
        return result;

    }


}

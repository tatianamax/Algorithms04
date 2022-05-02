public class PeakElement {

//    Написать алгоритм PeakElement,
//    который принимает на вход массив целых чисел
//    и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
//    Test Data:
//    {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    public  int[] peakElement(int[] a) {
        int[] temp = new int[a.length];
        int newArrCounter  = 0, counter;
        for (counter = 0; counter < a.length; counter++) {
            if (counter == 0) {
                if (a[counter] > a[counter + 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            } else if (counter == a.length - 1) {
                if (a[counter] > a[counter - 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            } else {
                if (a[counter] > a[counter + 1] && a[counter] > a[counter - 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            }
        }
        int[] result = new int[newArrCounter];
        for (counter = 0; counter < newArrCounter; counter++) {
            result[counter] = temp[counter];
        }
        return result;
    }
}


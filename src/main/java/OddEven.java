public class OddEven {

//    1.	Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
//    если число нечетное, и “Even”, если число четное.
//    Во всех остальных случаях результат будет “Undefined”.

    public String oddEven(int a) {
        String even = "Even";
        String odd = "Odd";
        String undefined = "Undefined";

        if ((a % 2) == 0) {
            return even;
        } else {

            if (a % 2 != 0) {
                return odd;
            }
            return undefined;
        }
    }
}





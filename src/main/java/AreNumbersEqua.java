public class AreNumbersEqua {
//    Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
// 0, если числа равны
// -1, если первое число меньше второго
// 1, если первое число больше второго
//
//    Test Data:
//            89, 89
//    Expected result: 0
//            -89, 89
//    Expected result: -1
//            89, -89
//    Expected result: 1

    public int areNumbersEquaMethod(int a, int b){
        if(a == b){
            return 0;
        }if(a < b){
            return -1;
        }else{
            return 1;
        }
    }
}

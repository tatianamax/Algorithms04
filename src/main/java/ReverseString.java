public class ReverseString {
//    19.	Написать алгоритм ReverseString, который переворачивает строку:
//    Test Data:
//            “Abracadabra” → “arbadacarbA”


    public String reverseStrings(String str){
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;

    }
}

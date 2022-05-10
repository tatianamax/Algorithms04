public class StringToLetters {
//    Написать  алгоритм StringToLetters,алгоритм принимает строку,  и удаляет все кроме букв:
//
//        орпаодйа86152346]1234лрпсрлучрлч3у8638-03]-3к8-\3
//        орпаодйалрпсрлучрлчук

    public  String stringToLettersMethod(String k){
        k = k.replaceAll("[^A-Za-zА-Яа-я]", "");
        return k;

    }
}

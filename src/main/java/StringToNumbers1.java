public class StringToNumbers1 {
//    Написать  алгоритм StringToNumbers1,алгоритм принимает строку,  и удаляет все кроме цифр:
////
////        орпаодйа86152346]1234лрпсрлучрлч3у8638-03]-3к8-\3
//            8615234612343863803383

    public String stringToNumbers1Method(String k1){
        k1 = k1.replaceAll("[^0-9]", "");
        return k1;

    }

}

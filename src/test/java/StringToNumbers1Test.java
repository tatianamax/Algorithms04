import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbers1Test {

//    Написать  алгоритм StringToNumbers1,алгоритм принимает строку,  и удаляет все кроме цифр:
////
////        орпаодйа86152346]1234лрпсрлучрлч3у8638-03]-3к8-\3
//            8615234612343863803383

    @Test
    public void testStringToNumbers1TestHappyPathTest(){
        String k1 = "орпаодйа86152346]1234лрпсрлучрлч3у8638-03]-3к8-\\3";
        String expectedResult = "8615234612343863803383";

        StringToNumbers1 s1 = new StringToNumbers1();
        String actualResult = s1.StringToNumbers1Method(k1);
        Assertions.assertEquals(expectedResult,actualResult);

    }
}

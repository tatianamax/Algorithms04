import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {
    @Test
    public void testStringToLettersHappyPathTest(){
        String k = "орпаодйа86152346]1234лрпсрлучрлч3у8638-03]-3к8-\\3";
        String expectedResult = "орпаодйалрпсрлучрлчук";

        StringToLetters sl = new StringToLetters();
        String actualResult = sl.stringToLettersMethod(k);
        Assertions.assertEquals(expectedResult,actualResult);

    }
}

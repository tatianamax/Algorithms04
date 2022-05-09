import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
//    19.	Написать алгоритм ReverseString, который переворачивает строку:
//    Test Data:
//            “Abracadabra” → “arbadacarbA”

    @Test
    public void testReverseStringsHappyPathTest(){
        String str = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString rs = new ReverseString();
        String actualResult = rs.ReverseStrings(str);
        Assertions.assertEquals(expectedResult,actualResult);

    }



}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {
//0 →  “Even”
    //222222 →  “Even”

    @Test
    public void testOddEvenTestHappyPathOddEvenNumber(){
        int a = -345;
        String expectedResult = "Odd";
        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testOddEvenTestHappyPathNewZero(){
        int a = 0;
        String expectedResult = "Even";
        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(a);
        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testOddEvenTestHappyPathNewSecond(){
        int a = 222222;
        String expectedResult = "Even";
        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testOddEvenTestHappyPathNewMax(){
        int a = 2147483647 + 1 ;
        String expectedResult = "Undefined";
        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}

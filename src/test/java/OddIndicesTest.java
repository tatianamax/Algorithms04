import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
    OddIndices os;

//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    @Test
    public void testOddIndicesTestHappyPathOddIndex(){
        int[]array = {-45,590,234,985,12,68};
        int[]expectedResult = {590,985,68};

        OddIndices os = new OddIndices();
        int[]actualResult = os.oddIndicesMethod(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}

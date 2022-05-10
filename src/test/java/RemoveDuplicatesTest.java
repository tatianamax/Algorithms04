import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
//    21.	Написать алгоритм RemoveDuplicates,
//    который принимает строку и возвращает строку уникальных букв:
//            “AABBCCaabbcc” → “abc”


    @Test
    public void testRemoveDuplicatesTestHappyPathTest(){
        String str = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesMethod(str);
        Assertions.assertEquals(expectedResult,actualResult);


    }
}

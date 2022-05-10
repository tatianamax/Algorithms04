import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CorrectInvalidNumberTest {
//    С заданным целым числом M выполните следующие условные действия:
//            ● Если M кратно 3 и 5, вернуть "Хорошее число".
//            ● Если M кратно только 3, а не 5, вернуть «Неверный номер».
//            ● Если M кратно только 5, а не 3, вернуть "Плохое число".
//            ● Если M не удовлетворяет ни одному из вышеперечисленных условий, вернуть «-1».

    @Test
    public void testCorrectInvalidNumberTestHappyPathTest(){
        int m = 30;
        String expectedResult = "Хорошее число";

        CorrectInvalidNumber cn = new CorrectInvalidNumber();
        String actualResult = cn.correctInvalidNumberMethod(m);
        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testCorrectInvalidNumberTestHappyPathTest1(){
        int m = 21;
        String expectedResult = "Неверный номер";

        CorrectInvalidNumber cn = new CorrectInvalidNumber();
        String actualResult = cn.correctInvalidNumberMethod(m);
        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testCorrectInvalidNumberTestHappyPathTest2(){
        int m = 25;
        String expectedResult = "Плохое число";

        CorrectInvalidNumber cn = new CorrectInvalidNumber();
        String actualResult = cn.correctInvalidNumberMethod(m);
        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testCorrectInvalidNumberTestHappyPathTest3(){
        int m = 11;
        String expectedResult = "-1";

        CorrectInvalidNumber cn = new CorrectInvalidNumber();
        String actualResult = cn.correctInvalidNumberMethod(m);
        Assertions.assertEquals(expectedResult,actualResult);

    }

}

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ButtonsTest extends BaseTest {

    @Test(testName = "Нажатие всех кнопок по запросу")
    public void test() {
        battondPage.open()
                .checkDoubleClick()
                .checkRightClick()
                .checkDinamycClick();
        assertEquals(battondPage.checkDoubleMessage(),
                "You have done a double click",
                "Сообщение вывода не соответствует");
        assertEquals(battondPage.checkRightMessage(),
                "You have done a right click",
                "Сообщение вывода не соответствует");
        assertEquals(battondPage.checkDynamicMessage(),
                "You have done a dynamic click",
                "Сообщение вывода не соответствует");
    }
}

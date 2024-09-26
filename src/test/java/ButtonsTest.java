import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ButtonsTest extends BaseTest {

    @Test(testName = "Нажатие всех кнопок по запросу")
    public void checkClickAllButton() {
        buttonsPage.open()
                .checkDoubleClick()
                .checkRightClick()
                .checkDinamycClick();
        softAssert.assertEquals(buttonsPage.checkDoubleMessage(),
                "You have done a double click",
                "Сообщение вывода не соответствует");
        softAssert.assertEquals(buttonsPage.checkRightMessage(),
                "You have done a right click",
                "Сообщение вывода не соответствует");
        softAssert.assertEquals(buttonsPage.checkDynamicMessage(),
                "You have done a dynamic click",
                "Сообщение вывода не соответствует");
    }
}

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @Epic("Demo QA")
    @Feature("Button Page")
    @Story("Взаимодействие со всеми кнопками")
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
        softAssert.assertAll();
    }
}

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class RadioTest extends BaseTest {

    @Epic("DemoQA")
    @Feature("Radio Button's")
    @Story("Проверка кнопки 'Yes'")
    @Test(testName = "Тест пункта 'Yes'")
    public void clickYes() {
        radioPage.open()
                .clickYes();
        softAssert.assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");
        softAssert.assertAll();
    }

    @Epic("DemoQA")
    @Feature("Radio Button's")
    @Story("Проверка кнопки 'Impressive'")
    @Test(testName = "Тест пункта 'Impressive'")
    public void clickImpressiveTest() {
        radioPage.open()
                .clickImpressive();
        softAssert.assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");
        softAssert.assertAll();
    }

    @Epic("DemoQA")
    @Feature("Radio Button's")
    @Story("Проверка кнопки 'No'")
    @Test(testName = "Тест пункта 'No'")
    public void clickNoTest() {
        radioPage.open()
                .clickNo();
        softAssert.assertFalse(radioPage.noSelected());
        softAssert.assertAll();
    }

    @Epic("DemoQA")
    @Feature("Radio Button's")
    @Story("Полная проверка кнопок")
    @Test(testName = "Полная проверка")
    public void clickAllRadio() {
        radioPage.open()
                .clickYes();
        softAssert.assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");
        radioPage.clickImpressive();
        softAssert.assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");
        radioPage.clickNo();
        softAssert.assertFalse(radioPage.noSelected(),
                "Вывод не соответствует");
        softAssert.assertAll();
    }
}

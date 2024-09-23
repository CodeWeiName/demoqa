import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RadioTest extends BaseTest {

    @Test(testName = "Тест пункта Yes")
    public void clickYesTest() {
        radioPage.open()
                .clickYes();
        assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");
    }

    @Test(testName = "Тест пункта Impressive")
    public void clickImpressiveTest() {
        radioPage.open()
                .clickImpressive();
        assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");
    }

    @Test(testName = "Тест пункта No")
    public void clickNoTest() {
        radioPage.open()
                .clickNo();
    }

    @Test(testName = "Полная проверка")
    public void clickAll() {
        radioPage.open()
                .clickYes();
        assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");
        radioPage.clickImpressive();
        assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");
        radioPage.clickNo();
        assertTrue(radioPage.getMessage(),
                "Вывод не соответствует");


    }
}

import dto.TextData;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TextBoxTest extends BaseTest {

    TextData data = new TextData(
            "Chanyshev Danil",
            "qacode@gmail.com",
            "Khanty-Mansisk",
            "Khanty-Mansisk");

    @Epic("Demo QA")
    @Feature("TextBox")
    @Story("Полное заполнение блоков")
    @Test(testName = "Прохождения теста с использованием валидных данных")
    public void validDataInBox() {
        textBoxPage.open()
                .textBox(data);
        assertEquals(textBoxPage.getMessage(),
                "Name:Chanyshev Danil\n" +
                        "Email:qacode@gmail.com\n" +
                        "Current Address :Khanty-Mansisk\n" +
                        "Permananet Address :Khanty-Mansisk",
                "Выведенная информация не соответствует");
    }
}

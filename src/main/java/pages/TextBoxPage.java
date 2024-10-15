package pages;

import dto.TextData;
import io.qameta.allure.Step;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currendAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement buttonElemet;

    @FindBy(id = "output")
    WebElement output;

    @Step("Открытие страницы")
    public TextBoxPage open() {
        driver.get(baseUrl + "text-box");
        return this;
    }

    @Step("Заполнение текстовых форм")
    public TextBoxPage textBox(TextData data) {
        userName.sendKeys(data.getUserName());
        userEmail.sendKeys(data.getUserEmail());
        currendAddress.sendKeys(data.getCurrentAddress());
        permanentAddress.sendKeys(data.getPermanentAddress());
        buttonElemet.click();
        return this;
    }

    @Step("Вывод сообщения на дисплей")
    public String getMessage() {
        return output.getText();
    }
}

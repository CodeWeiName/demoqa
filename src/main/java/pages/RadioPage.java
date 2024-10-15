package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RadioPage extends BasePage {

    public RadioPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@for='yesRadio']")
    WebElement yesRadio;

    @FindBy(xpath = "//label[@for='impressiveRadio']")
    WebElement impressiveRadio;

    @FindBy(xpath = "//label[@for='noRadio']")
    WebElement noRadio;

    @FindBy(xpath = "//p[@class = 'mt-3']")
    WebElement message;

    @Step("открытие страницы")
    public RadioPage open() {
        driver.get(baseUrl + "radio-button");
        return this;
    }

    @Step("Клик на радио-кнопку Yes")
    public RadioPage clickYes() {
        yesRadio.click();
        return this;
    }

    @Step("Клик на радио-кнопку Impressive")
    public RadioPage clickImpressive() {
        impressiveRadio.click();
        return this;
    }

    @Step("Клик на радио-кнопку No")
    public RadioPage clickNo() {
        noRadio.click();
        return this;
    }

    @Step("Проверка элемента на возможность взаимодействия")
    public boolean noSelected() {
        return noRadio.isSelected();
    }

    @Step("Вывод сообщения на дисплей")
    public boolean getMessage() {
        return message.isDisplayed();
    }
}

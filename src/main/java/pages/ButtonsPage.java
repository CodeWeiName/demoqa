package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button [text () = 'Double Click Me']")
    WebElement doubleClickBtn;

    @FindBy(xpath = "//button [text () = 'Right Click Me']")
    WebElement rightClickBtn;

    @FindBy(xpath = "//button [text () = 'Click Me']")
    WebElement oneClick;

    @FindBy(xpath = "//p [text () = 'You have done a double click']")
    WebElement doubleClickMessage;

    @FindBy(xpath = "//p [text () = 'You have done a right click']")
    WebElement rightClickMessage;

    @FindBy(xpath = "//p [text () = 'You have done a dynamic click']")
    WebElement dynamicClickMessage;

    @Step("Открытие страницы")
    public ButtonsPage open() {
        driver.get(baseUrl + "buttons");
        return this;
    }

    @Step("Двойной клик на кнопку")
    public ButtonsPage checkDoubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();
        return this;
    }

    @Step("Клик правой кнопкой мыши на кнопку")
    public ButtonsPage checkRightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).perform();
        return this;
    }

    @Step("Клик левой кнопкой мыши на кнопку")
    public ButtonsPage checkDinamycClick() {
        oneClick.click();
        return this;
    }

    @Step("Проверка вывода сообщения о двойном клике")
    public String checkDoubleMessage() {
        return doubleClickMessage.getText();
    }

    @Step("Проверка вывода сообщения о правом клике")
    public String checkRightMessage() {
        return rightClickMessage.getText();
    }

    @Step("Проверка вывода сообщения о левом клике")
    public String checkDynamicMessage() {
        return dynamicClickMessage.getText();
    }
}

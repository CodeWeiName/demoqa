package pages;

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

    public ButtonsPage open() {
        driver.get(baseUrl + "buttons");
        return this;
    }

    public ButtonsPage checkDoubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();
        return this;
    }

    public ButtonsPage checkRightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).perform();
        return this;
    }

    public ButtonsPage checkDinamycClick() {
        oneClick.click();
        return this;
    }

    public String checkDoubleMessage() {
        return doubleClickMessage.getText();
    }

    public String checkRightMessage() {
        return rightClickMessage.getText();
    }

    public String checkDynamicMessage() {
        return dynamicClickMessage.getText();
    }
}

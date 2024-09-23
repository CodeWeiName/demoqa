package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BattonsPage {
    WebDriver driver;

    public BattonsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public BattonsPage open() {
        driver.get("https://demoqa.com/buttons");
        return this;
    }

    public BattonsPage checkDoubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();
        return this;
    }


    public BattonsPage checkRightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).perform();
        return this;
    }


    public BattonsPage checkDinamycClick() {
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

package pages;

import io.qameta.allure.Epic;
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

    public RadioPage open() {
        driver.get(baseUrl + "radio-button");
        return this;
    }

    public RadioPage clickYes() {
        yesRadio.click();
        return this;
    }

    public RadioPage clickImpressive() {
        impressiveRadio.click();
        return this;
    }

    public RadioPage clickNo() {
        noRadio.click();
        return this;
    }

    public boolean noSelected() {
        return noRadio.isSelected();
    }

    public boolean getMessage() {
        return message.isDisplayed();
    }
}

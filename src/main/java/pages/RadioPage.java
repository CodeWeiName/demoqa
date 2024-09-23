package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioPage {
    WebDriver driver;

    public RadioPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
        driver.get("https://demoqa.com/radio-button");
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

    public boolean getMessage() {
        return message.isDisplayed();
    }


}

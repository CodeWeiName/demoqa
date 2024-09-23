package pages;

import dta.TextData;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class TextBoxPage {
    WebDriver driver;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public TextBoxPage open() {
        driver.get("https://demoqa.com/text-box");
        return this;
    }

    public TextBoxPage textBox(TextData data) {
        userName.sendKeys(data.getUserName());
        userEmail.sendKeys(data.getUserEmail());
        currendAddress.sendKeys(data.getCurrentAddress());
        permanentAddress.sendKeys(data.getPermanentAddress());
        buttonElemet.click();
        return this;
    }

    public String getMessage() {
        return output.getText();
    }

}

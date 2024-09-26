package pages;

import dto.TextData;
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

    public TextBoxPage open() {
        driver.get(baseUrl + "text-box");
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

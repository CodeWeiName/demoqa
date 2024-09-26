package pages;

import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends BasePage {

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public CheckBoxPage open() {
        driver.get(baseUrl + "checkbox");
        return this;
    }
}

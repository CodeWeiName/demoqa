package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CheckBoxPage open() {
        driver.get("https://demoqa.com/checkbox");
        return this;

    }

}

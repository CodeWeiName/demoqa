package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkPage {
    WebDriver driver;

    public LinkPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    String url = "https://demoqa.com/links";
    String newUrl;

    @FindBy(id = "simpleLink")
    WebElement simpleLink;

    @FindBy(id = "dynamicLink")
    WebElement dynamicLink;

    @FindBy(id = "created")
    WebElement created;

    @FindBy(id = "no-content")
    WebElement noContent;

    @FindBy(id = "moved")
    WebElement moved;

    @FindBy(id = "bad-request")
    WebElement badRequest;

    @FindBy(id = "unauthorized")
    WebElement unauthorized;

    @FindBy(id = "forbidden")
    WebElement forbidden;

    @FindBy(id = "invalid-url")
    WebElement invalidUrl;

    @FindBy(id = "linkResponse")
    WebElement linkResponse;

    @FindBy(xpath = "//div [@class = 'home-banner']")
    WebElement bannerHome;

    public LinkPage open() {
        driver.get(url);
        return this;
    }

    public HomePage clickHome() {
        simpleLink.click();
        String newUrl = driver.getCurrentUrl();

        return new HomePage(driver);
    }

    public HomePage clickHomeDynamic() {
        dynamicLink.click();
        return new HomePage(driver);
    }

    public LinkPage createdLink() {
        created.click();
        return this;
    }

    public LinkPage noContentLink() {
        noContent.click();
        return this;
    }

    public LinkPage movedLink() {
        moved.click();
        return this;
    }

    public LinkPage badRequestLink() {
        badRequest.click();
        return this;
    }

    public LinkPage unauthorizedLink() {
        unauthorized.click();
        return this;
    }

    public LinkPage forbiddenLink() {
        forbidden.click();
        return this;
    }

    public LinkPage notFoundLink() {
        invalidUrl.click();
        return this;
    }

    public String errorMessage() {
        return linkResponse.getText();
    }

    public boolean check() {
        if (url.equals(newUrl))
            return false;
        else return true;
    }

}

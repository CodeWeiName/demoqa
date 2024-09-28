package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkPage extends BasePage {

    public LinkPage(WebDriver driver) {
        super(driver);
    }

    String url = baseUrl + "links";
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

    @Step("Открытие страницы")
    public LinkPage open() {
        driver.get(url);
        return this;
    }

    @Step("Клик на валидную ссылку")
    public HomePage clickHome() {
        simpleLink.click();
        String newUrl = driver.getCurrentUrl();
        return new HomePage(driver);
    }

    @Step("Клик на динамическую валидную ссылку")
    public HomePage clickHomeDynamic() {
        dynamicLink.click();
        return new HomePage(driver);
    }

    @Step("Клик на ссылку со статусом '205'")
    public LinkPage createdLink() {
        created.click();
        return this;
    }

    @Step("Клик на ссылку со статусом '204'")
    public LinkPage noContentLink() {
        noContent.click();
        return this;
    }

    @Step("Клик на ссылку со статусом '301'")
    public LinkPage movedLink() {
        moved.click();
        return this;
    }

    @Step("Клик на ссылку со статусом '400'")
    public LinkPage badRequestLink() {
        badRequest.click();
        return this;
    }

    @Step("Клик на ссылку со статусом '401'")
    public LinkPage unauthorizedLink() {
        unauthorized.click();
        return this;
    }

    @Step("Клик на ссылку со статусом '403'")
    public LinkPage forbiddenLink() {
        forbidden.click();
        return this;
    }

    @Step("Клик на ссылку со статусом '404'")
    public LinkPage notFoundLink() {
        invalidUrl.click();
        return this;
    }

    @Step("Вывод сообщения об ошибке на дисплей")
    public String errorMessage() {
        return linkResponse.getText();
    }

    @Step("Проверка смены url")
    public boolean check() {
        if (url.equals(newUrl))
            return false;
        else return true;
    }
}

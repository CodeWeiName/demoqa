import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

    @Epic("Demo QA")
    @Feature("LinkPage")
    @Story("Взаимодействие с валидной ссылкой")
    @Test(testName = "Тест ссылки на домашнюю страницу")
    public void clickHomePageLink() {
        linkPage.open()
                .clickHome();
        softAssert.assertTrue(linkPage.check(),
                "url - не соответствует");
        softAssert.assertAll();
    }

    @Epic("Demo QA")
    @Feature("Link Page")
    @Story("Взаимодействие с валидной динамической ссылкой")
    @Test(testName = "Тест динамической ссылки на домашнюю страницу")
    public void clickHomePageDynamicLink() {
        linkPage.open()
                .clickHomeDynamic();
        softAssert.assertTrue(linkPage.check(),
                "url - не соответствует");
        softAssert.assertAll();
    }

    @Epic("Demo QA")
    @Feature("Link Page")
    @Story("Взаимодействие с ссылкой со статусом '201'")
    @Test(testName = "Тест ссылки со статусом 201")
    public void clickCreatedLink() {
        linkPage.open()
                .createdLink();
        softAssert.assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 201 and status text Created",
                "Текст ошибки не соответствует");
        softAssert.assertAll();
    }

    @Epic("Demo QA")
    @Feature("Link Page")
    @Story("Взаимодействие с ссылкой со статусом '204'")
    @Test(testName = "Тест ссылки со статусом 204")
    public void clickNoCorrectLink() {
        linkPage.open()
                .noContentLink();
        softAssert.assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 204 and status text No Content",
                "Текст ошибки не соответствует");
        softAssert.assertAll();
    }

    @Epic("Demo QA")
    @Feature("Link Page")
    @Story("Взаимодействие с ссылкой со статусом '301'")
    @Test(testName = "Тест ссылки со статусом 301")
    public void clickMovedLink() {
        linkPage.open()
                .movedLink();
        softAssert.assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 301 and status text Moved Permanently",
                "Текст ошибки не соответствует");
        softAssert.assertAll();
    }

    @Epic("Demo QA")
    @Feature("Link Page")
    @Story("Взаимодействие с ссылкой со статусом '400'")
    @Test(testName = "Тест ссылки со статусом 400")
    public void clickBadRequestLink() {
        linkPage.open()
                .badRequestLink();
        softAssert.assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 400 and status text Bad Request",
                "Текст ошибки не соответствует");
        softAssert.assertAll();
    }

    @Epic("Demo QA")
    @Feature("Link Page")
    @Story("Взаимодействие с ссылкой со статусом '401'")
    @Test(testName = "Тест ссылки со статусом 401")
    public void clickUnauthorizedLink() {
        linkPage.open()
                .unauthorizedLink();
        softAssert.assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 401 and status text Unauthorized",
                "Текст ошибки не соответствует");
        softAssert.assertAll();
    }

    @Epic("Demo QA")
    @Feature("Link Page")
    @Story("Взаимодействие с ссылкой со статусом '403'")
    @Test(testName = "Тест ссылки со статусом 403")
    public void clickForbiddenLink() {
        linkPage.open()
                .forbiddenLink();
        softAssert.assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 403 and status text Forbidden",
                "Текст ошибки не соответствует");
        softAssert.assertAll();
    }

    @Epic("Demo QA")
    @Feature("Link Page")
    @Story("Взаимодействие с ссылкой со статусом '404'")
    @Test(testName = "Тест ссылки со статусом 404")
    public void clickNotFoundLink() {
        linkPage.open()
                .notFoundLink();
        softAssert.assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 404 and status text Not Found",
                "Текст ошибки не соответствует");
        softAssert.assertAll();
    }
}

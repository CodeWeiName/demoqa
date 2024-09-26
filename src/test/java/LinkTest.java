import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LinkTest extends BaseTest {

    @Test(testName = "Тест ссылки на домашнюю страницу")
    public void clickHomePageLink() {
        linkPage.open()
                .clickHome();
        assertTrue(linkPage.check(),
                "url - не соответствует");
    }

    @Test(testName = "Тест динамической ссылки на домашнюю страницу")
    public void clickHomePageDynamicLink() {
        linkPage.open()
                .clickHomeDynamic();
        assertTrue(linkPage.check(),
                "url - не соответствует");
    }

    @Test(testName = "Тест ссылки со статусом 201")
    public void clickCreatedLink() {
        linkPage.open()
                .createdLink();
        assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 201 and status text Created",
                "Текст ошибки не соответствует");
    }

    @Test(testName = "Тест ссылки со статусом 204")
    public void clickNoCorrectLink() {
        linkPage.open()
                .noContentLink();
        assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 204 and status text No Content",
                "Текст ошибки не соответствует");
    }

    @Test(testName = "Тест ссылки со статусом 301")
    public void clickMovedLink() {
        linkPage.open()
                .movedLink();
        assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 301 and status text Moved Permanently",
                "Текст ошибки не соответствует");
    }

    @Test(testName = "Тест ссылки со статусом 400")
    public void clickBadRequestLink() {
        linkPage.open()
                .badRequestLink();
        assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 400 and status text Bad Request",
                "Текст ошибки не соответствует");
    }

    @Test(testName = "Тест ссылки со статусом 401")
    public void clickUnauthorizedLink() {
        linkPage.open()
                .unauthorizedLink();
        assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 401 and status text Unauthorized",
                "Текст ошибки не соответствует");
    }

    @Test(testName = "Тест ссылки со статусом 403")
    public void clickForbiddenLink() {
        linkPage.open()
                .forbiddenLink();
        assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 403 and status text Forbidden",
                "Текст ошибки не соответствует");
    }

    @Test(testName = "Тест ссылки со статусом 404")
    public void clickNotFoundLink() {
        linkPage.open()
                .notFoundLink();
        assertEquals(linkPage.errorMessage(),
                "Link has responded with staus 404 and status text Not Found",
                "Текст ошибки не соответствует");
    }
}

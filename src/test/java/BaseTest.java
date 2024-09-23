import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public BattonsPage battondPage;
    public LinkPage linkPage;
    public RadioPage radioPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        battondPage = new BattonsPage(driver);
        linkPage = new LinkPage(driver);
        radioPage = new RadioPage(driver);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public ButtonsPage buttonsPage;
    public LinkPage linkPage;
    public RadioPage radioPage;
    public PracticFormPage practicFormPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000000));
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        buttonsPage = new ButtonsPage(driver);
        linkPage = new LinkPage(driver);
        radioPage = new RadioPage(driver);
        practicFormPage = new PracticFormPage(driver);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}

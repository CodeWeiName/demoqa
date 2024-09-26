package pages;

import dto.PracticFormData;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class PracticFormPage extends BasePage {

    public PracticFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    WebElement firsName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    WebElement genderMale;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    WebElement genderFemale;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    WebElement genderOther;

    @FindBy(id = "userNumber")
    WebElement userNumber;

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthInput;

    @FindBy(id = "subjectsContainer")
    WebElement subjectsContainer;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    WebElement hobbiesSports;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    WebElement hobbiesReading;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    WebElement hobbiesMusic;

    @FindBy(id = "uploadPicture")
    WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "submit")
    WebElement buttonSubmit;

    public PracticFormPage open() {
        driver.get(baseUrl + "automation-practice-form");
        return this;
    }

    public PracticFormPage fillTextBox(PracticFormData data) {
        firsName.sendKeys(data.getFirstName());
        lastName.sendKeys(data.getLastName());
        userEmail.sendKeys(data.getEmail());
        userNumber.sendKeys(data.getMobile());
        // subjectsContainer.sendKeys(data.getSubjects());
        currentAddress.sendKeys(data.getCurrentAddress());
        return this;
    }

    public PracticFormPage clickGenderMale() {
        genderMale.click();
        return this;
    }

    public PracticFormPage clickGenderFemale() {
        genderFemale.click();
        return this;
    }

    public PracticFormPage clickGenderOther() {
        genderOther.click();
        return this;
    }

    public PracticFormPage clickHobbieSport() {
        hobbiesSports.click();
        return this;
    }

    public PracticFormPage clickHobbieReading() {
        hobbiesReading.click();
        return this;
    }

    public PracticFormPage clickHobbieMusic() {
        hobbiesMusic.click();
        return this;
    }

    public PracticFormPage clickSumbit() {
        buttonSubmit.click();
        return this;
    }
}

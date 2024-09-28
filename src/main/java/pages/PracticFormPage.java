package pages;

import dto.PracticFormData;
import io.qameta.allure.Step;
import lombok.Data;
import org.openqa.selenium.Keys;
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

   /* @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthInput;

    @FindBy(xpath = "react-datepicker__month-select")
    WebElement selectOfMouth;

    @FindBy(xpath = "react-datepicker__year-select")
    WebElement selectOfYear;

    @FindBy(xpath = "//div[text() = 24]")
    WebElement selectDay;

    @FindBy(xpath = "//button[text() = 'Previous Month']")
    WebElement previousMouthButton;

    @FindBy(xpath = "//button[text() = 'Next Month']")
    WebElement nextMouthButton;*/

    @FindBy(xpath = "//span[@class = 'subjects-auto-complete__indicator-separator css-1okebmr-indicatorSeparator']")
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

    @FindBy(xpath = "//div[@id = 'state']//input[@id = 'react-select-3-input']")
    WebElement selectState;

    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement titleThank;

    @Step("Открытие страницы")
    public PracticFormPage open() {
        driver.get(baseUrl + "automation-practice-form");
        return this;
    }

    @Step("Заполнение текстовых блоков")
    public PracticFormPage fillTextBox(PracticFormData data) {
        firsName.sendKeys(data.getFirstName());
        lastName.sendKeys(data.getLastName());
        userEmail.sendKeys(data.getEmail());
        userNumber.sendKeys(data.getMobile());
        //subjectsContainer.sendKeys(data.getSubjects());
        currentAddress.sendKeys(data.getCurrentAddress());
        return this;
    }

    @Step("Клик на радио-кнопку 'Gender male'")
    public PracticFormPage clickGenderMale() {
        genderMale.click();
        return this;
    }

    @Step("Клик на радио-кнопку 'Gender female'")
    public PracticFormPage clickGenderFemale() {
        genderFemale.click();
        return this;
    }

    @Step("Клик на радио-кнопку 'Gender other'")
    public PracticFormPage clickGenderOther() {
        genderOther.click();
        return this;
    }

    @Step("Клик на кнопку 'Hobbie sport'")
    public PracticFormPage clickHobbieSport() {
        hobbiesSports.click();
        return this;
    }

    @Step("Клик на кнопку 'Hobbie reading'")
    public PracticFormPage clickHobbieReading() {
        hobbiesReading.click();
        return this;
    }

    @Step("Клик на кнопку 'Hobbie music'")
    public PracticFormPage clickHobbieMusic() {
        hobbiesMusic.click();
        return this;
    }

    @Step("Клик на кнопку 'Sumbit'")
    public void clickSumbit() {
        buttonSubmit.click();
    }

    @Step("Загрузка файла .txt")
    public PracticFormPage dowloadFile() {
        uploadPicture.sendKeys("/Users/coderwei/test.txt");
        return this;
    }

   /* @Step("Заполнение календаря")
    public PracticFormPage selectData() {
        dateOfBirthInput.click();
        dateOfBirthInput.clear();
        dateOfBirthInput.sendKeys("02.04.2002");
        return this;
    }*/

    public PracticFormPage selectState() {
        selectState.sendKeys("NCR");
        selectState.sendKeys(Keys.ENTER);
        return this;
    }

    public String getThankText() {
        return titleThank.getText();
    }
}

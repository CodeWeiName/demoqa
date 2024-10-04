import dto.PracticFormData;
import org.testng.annotations.Test;

public class PracticFormTest extends BaseTest {

    PracticFormData data = new PracticFormData(
            "Danil",
            "Chanyshev",
            "coder@gmail.com",
            "9194198930",
            "HMAO,");

    @Test
    public void checkFullFilling() {
        practicFormPage.open()
                .fillTextBox(data)
                .clickGenderMale()
                .clickGenderFemale()
                .clickGenderOther()
                .clickHobbieSport()
                .clickHobbieReading()
                .clickHobbieMusic()
                .dowloadFile()
                .selectState()
                .clickSumbit();
    }
}

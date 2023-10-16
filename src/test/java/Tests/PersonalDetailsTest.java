package Tests;

import Pages.PersonalDetailsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalDetailsTest extends TestLevelTest {
    PersonalDetailsPage pd;
    @BeforeClass
    public void validatePersonalDetailsPage() {
        pd = new PersonalDetailsPage(driver, wait);
        pd.clickContinueButton();
        pd.clickContinueButton();
    }

    @Test
    public void enterAllPersonalDetails() {
        pd.setProgressLine();
       // pd.enterRandFamilyStatus();
        pd.clickContinueButton();
    }
}

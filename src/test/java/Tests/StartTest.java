package Tests;

import Pages.PersonalDetailsPage;
import Pages.StartPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StartTest extends TestLevelTest{
   private StartPage startPage;

    @BeforeClass
    public void validateStartPage() {
        startPage = new StartPage(driver,wait);
    }

    @Test
    public void startPageMethods() {
        startPage.clickContinueButton();
        startPage.clickContinueButton();
    }
}

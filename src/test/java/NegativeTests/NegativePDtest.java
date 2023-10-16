package NegativeTests;

import NegativePages.NegativePDpage;
import Tests.MethodLevelTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NegativePDtest extends MethodLevelTest {
    NegativePDpage negativePDpage;

    @BeforeMethod
    public void goToPDpage(){
    negativePDpage = new NegativePDpage(driver,wait);
    negativePDpage.clickContinueButton();
    negativePDpage.clickContinueButton();
    }

    @Test
    public void NegPDmethod(){
        negativePDpage.clickContinueButton();
        negativePDpage.negFamilyStatusAlert();
    }
}

package NegativeTests;

import Data.Excel;
import NegativePages.NegativeStatementPage;
import Tests.MethodLevelTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class NegStatementTestDropDown extends MethodLevelTest {
    NegativeStatementPage negativeStatementPage;

    @BeforeMethod
    public void goToStatementPage() {
        negativeStatementPage = new NegativeStatementPage(driver, wait);
        negativeStatementPage.clickContinueButton();
        negativeStatementPage.clickContinueButton(); // go to the page
        negativeStatementPage.vallidateStatementPage();
    }

    @Test
    public void NegStatementDropDown(){
        negativeStatementPage.negativeDropDownSummerSemester();
        negativeStatementPage.negativeDropDownSemester();
        negativeStatementPage.negativeDropDownShnatLimud();
    }

}































package Tests;

import Pages.StatementPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StatementTest extends PersonalDetailsTest {

    StatementPage statementPage;
    @BeforeClass
    public void goToStatementPage() {
        statementPage = new StatementPage(driver,wait);
        statementPage.clickContinueButton();
        statementPage.clickContinueButton();
        statementPage.setProgressLine();
        //statementPage.enterRandFamilyStatus();
        statementPage.clickContinueButton();
    }

    @Test(priority = 1)
    public void enterAllStatementfields() throws InterruptedException {
       statementPage.isProgressLineBigger();
        statementPage.fillNakazPtorField(NAKAZ_PTOR);
        //statementPage.posNakazAlert();
        statementPage.fillNumYearsOfStudyField(SHNOT_LIMUD_KODMOT);
        //statementPage.posNumYearsOfStudyAlert();
        //add maslul method
        statementPage.enterRandShnatLimudField();
        //statementPage.posShnatLimudAlert();
        //statementPage.enterRandSemesterField();
        //statementPage.posSemesterAlert();
        statementPage.enterRandSummerSemesterField();
        statementPage.posSummerSemesterAlert();
        statementPage.enterRandMisgeretField();

        //end all the test
        statementPage.clickContinueButton();
        statementPage.isProgressLineBigger();
        statementPage.clickContinueButton();
        statementPage.isProgressLineBigger();
        statementPage.clickContinueButton();
        statementPage.isProgressLineBigger();
        statementPage.clickContinueButton();
        statementPage.isProgressLineBigger();
        statementPage.clickContinueButton();
        statementPage.isProgressLineBigger();
        statementPage.clickContinueButton();
        statementPage.isProgressLineBigger();
        statementPage.clickContinueButton();
        statementPage.enterSignature();
        statementPage.clickContinueButton();
        statementPage.SignApprovmentMessegeCheck();
        //Thread.sleep(3000);
        statementPage.clickContinueButton();
        statementPage.validateLastPage();
        // add - project field
    }

}

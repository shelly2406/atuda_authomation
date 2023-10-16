package NegativeTests;

import Data.Excel;
import NegativePages.NegativeStatementPage;
import Pages.BasePage;
import Pages.StatementPage;
import Tests.BaseTest;
import Tests.MethodLevelTest;
import org.testng.annotations.*;

import java.io.IOException;

public class NegStatementTestNumFields extends MethodLevelTest {

    NegativeStatementPage negativeStatementPage;

    @DataProvider(name = "numberField")
    public Object[][] getUserData() throws IOException {
        String sheetName = "numberField";
        String filePath = "C:\\Users\\BenBar\\Desktop\\AtudaNegative.xlsx";

        return (Excel.getDataArrayFromExcel(sheetName, filePath));
    }

    @BeforeMethod
    public void goToStatementPage() {
         negativeStatementPage = new NegativeStatementPage(driver, wait);
        negativeStatementPage.clickContinueButton();
        negativeStatementPage.clickContinueButton();
        negativeStatementPage.enterRandFamilyStatus();
        negativeStatementPage.clickContinueButton();
        //negativeStatementPage.vallidateStatementPage();
    }

    @Test(dataProvider = "numberField")
        public void negativeStatement
            (String negativeNakazNum,
             String negativeNumYearsOfStudyNum,
             String negativeNakazTav, String negativeNumYearsOfStudyTav) {


            negativeStatementPage.negativeNakazPtorNums(negativeNakazNum);
            negativeStatementPage.negetiveNumYearsOfStudyNums(negativeNumYearsOfStudyNum);

        // check if it tells us when you cant enter letters, if not delete that part below :)
            negativeStatementPage.negativeNakazPtorTavs(negativeNakazTav);
            negativeStatementPage.negetiveNumYearsOfStudyTavs(negativeNumYearsOfStudyTav);
        }

}

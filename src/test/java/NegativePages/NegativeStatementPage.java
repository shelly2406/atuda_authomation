package NegativePages;

import Pages.StatementPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NegativeStatementPage extends StatementPage {

    // Data Members

    // Constructor
    public NegativeStatementPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    // Methods


    public void negativeNakazPtorNums(String nakaz) {
        fillNakazPtorField(nakaz);
        System.out.println("1");
        negNakazAlert();
        System.out.println("2");
        clickContinueButton();
        System.out.println("3");
        clearNakazPtorField();
        System.out.println("4");
    }

    public void negativeNakazPtorTavs(String nakaz) {
        fillNakazPtorField(nakaz);
    }

    public void negetiveNumYearsOfStudyNums(String num){
        fillNumYearsOfStudyField(num);
        System.out.println("1");
        negNumYearsOfStudyAlert();
        System.out.println("2");
        clickContinueButton();
        System.out.println("3");
        vallidateStatementPage();
        System.out.println("4");
        clearNumYearsOfStudyField();
        System.out.println("5");
    }

    public void negetiveNumYearsOfStudyTavs(String num){
        fillNumYearsOfStudyField(num);
    }

    public void negativeDropDownShnatLimud() {
        enterRandSemesterField();
        enterRandSummerSemesterField();
        clickContinueButton();
        negShnatLimudAlert();
        vallidateStatementPage();
    }

    public void negativeDropDownSemester() {
        enterRandShnatLimudField();
        enterRandSummerSemesterField();
        clickContinueButton();
        negSemesterAlert();
        vallidateStatementPage();
    }

    public void negativeDropDownSummerSemester() {
        enterRandShnatLimudField();
        enterRandSemesterField();
        clickContinueButton();
        negSummerSemesterAlert();
        vallidateStatementPage();
    }
}
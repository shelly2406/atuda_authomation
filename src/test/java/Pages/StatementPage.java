package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class StatementPage extends PersonalDetailsPage{
    // Data Members
    @FindBy(css = "[data-test-chapter-number = '2']")
    WebElement titleStatementPage;

    @FindBy(css = "[data-test='field-excemption_credit'] input")
    WebElement nakazPtorField;

    @FindBy(css = "[data-test='field-prev_years_of_study'] input")
    WebElement numYearsOfStudyField;

    //add maslul field!!!

    @FindBy(css = "[data-test='field-year_of_study'] input")
    WebElement shnatLimudField;

    @FindBy(css = "[class = 'v-list-item v-list-item--link" +
            " v-theme--light v-list-item--density-default" +
            " v-list-item--one-line v-list-item--variant-text']")
    List<WebElement> shnatLimudOptions;

    @FindBy(css = "[data-test='field-semester'] input")
    WebElement semesterField;

    @FindBy(css = "[class = 'v-list-item v-list-item--link v-theme--light " +
            "v-list-item--density-default v-list-item--" +
            "one-line v-list-item--variant-text']")
    WebElement semesterOptions;

    @FindBy(css = "[data-test='field-is_summer_semester'] input")
    WebElement summerSemesterField;

    @FindBy(css = "[class = 'v-list-item v-list-" +
            "item--link v-theme--light" +
            " v-list-item--density-default v-list-item" +
            "--one-line v-list-item--variant-text']")
    WebElement summerSemesterOptions;

    // add - project field

    @FindBy(css = "[data-test='field-prev_study_institute'] input")
    WebElement misgeretKodemetField;

    @FindBy(css = "[class = 'v-list-item v-list-item" +
            "--link v-theme--light v-list-item--density-default" +
            " v-list-item--one-line v-list-item--variant-text']")
    WebElement misgeretKodemetOptions;

    // Alerts Data Base

    @FindBy(css = "[data-test='field-excemption_credit'] [role = 'alert']")
    WebElement nakazPtorAlert;

    @FindBy(css = "[data-test='field-prev_years_of_study'] [role = 'alert']")
    WebElement numYearsOfStudyAlert;

    @FindBy(css = "[data-test='field-year_of_study'] [role = 'alert']")
    WebElement shnatLimudAlert;

    @FindBy(css = "[data-test='field-semester'] [role = 'alert']")
    WebElement semesterAlert;

    @FindBy(css = "[data-test='field-is_summer_semester'] [role = 'alert']")
    WebElement summerSemesterAlert;

    // personal details data members
    @FindBy(css = "[data-test='field-family_status'] input")
    WebElement familyStatusField;

    @FindBy(css = "[class = 'v-list-item v-list-item-" +
            "-link v-theme--light v-list-item--density-default" +
            " v-list-item--one-line v-list-item--variant-text']")
    WebElement familyStatusOptions;

    @FindBy(className = "signature")
    WebElement signature;

    @FindBy(css = "[style = 'text-align: center;']")
    WebElement signApprovmentMessege;

    @FindBy(css = "[clip-path = 'url(#__lottie_element_201)']")
    WebElement lastPageGif;

     //Constructor
    public StatementPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    // Methods

    public void validateLastPage(){
        wait.until(ExpectedConditions.invisibilityOf(lastPageGif));

    }

    public void SignApprovmentMessegeCheck(){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan
                (By.cssSelector("[style = 'text-align: center;']"), 1));
    }
    public void vallidateStatementPage(){
        wait.until(ExpectedConditions.visibilityOf(titleStatementPage));
    }

    public void fillNakazPtorField(String nakazPtor){
        wait.until(ExpectedConditions.elementToBeClickable
                (nakazPtorField)).sendKeys(nakazPtor);
    }

    public void clearNakazPtorField(){
        wait.until(ExpectedConditions.elementToBeClickable
                (nakazPtorField)).clear();
    }

    public void fillNumYearsOfStudyField(String num){
        wait.until(ExpectedConditions.elementToBeClickable
                (numYearsOfStudyField)).sendKeys(num);
    }

    public void clearNumYearsOfStudyField(){
        wait.until(ExpectedConditions.elementToBeClickable
                (numYearsOfStudyField)).clear();
    }

    //add maslul method
    public void enterRandShnatLimudField(){
        wait.until(ExpectedConditions.
                elementToBeClickable(shnatLimudField)).click();
        List<WebElement> shnatLimudList = wait.until(ExpectedConditions.
                visibilityOfAllElements(shnatLimudOptions));
        Random rand = new Random();
        int randOption = rand.nextInt(shnatLimudList.size());
        shnatLimudList.get(randOption).click();
    }

    public void enterRandSemesterField(){
        wait.until(ExpectedConditions.elementToBeClickable(semesterField)).click();
        List<WebElement> semesterList = wait.until(ExpectedConditions.
                visibilityOfAllElements(semesterOptions));
        Random rand = new Random();
        int randOption = rand.nextInt(semesterList.size());
        semesterList.get(randOption).click();
    }

    public void enterRandSummerSemesterField(){
        wait.until(ExpectedConditions.elementToBeClickable
                (summerSemesterField)).click();
        List<WebElement> summerSemesterList = wait.until(ExpectedConditions.
                visibilityOfAllElements(summerSemesterOptions));
        Random rand = new Random();
        int randOption = rand.nextInt(summerSemesterList.size());
        summerSemesterList.get(randOption).click();
    }

    public void enterRandMisgeretField(){
        wait.until(ExpectedConditions.elementToBeClickable
                (misgeretKodemetField)).click();
        List<WebElement> misgeretKodemetList = wait.until(ExpectedConditions.
                visibilityOfAllElements(misgeretKodemetOptions));
        Random rand = new Random();
        int randOption = rand.nextInt(misgeretKodemetList.size());
        misgeretKodemetList.get(randOption).click();
    }


    // Negative Alerts methods
    public void negNumYearsOfStudyAlert(){
        wait.withMessage("doesnt show negative alert").
                until(ExpectedConditions.invisibilityOf(numYearsOfStudyAlert));
        System.out.println("aa");
    }

    public void negNakazAlert(){
        wait.withMessage("doesnt show negative alert").
                until(ExpectedConditions.visibilityOf(nakazPtorAlert));
        System.out.println("bb");
    }

    public void negShnatLimudAlert(){
        wait.withMessage("doesnt show negative alert")
                .until(ExpectedConditions.visibilityOf(shnatLimudAlert));
        System.out.println("cc");
    }

    public void negSemesterAlert(){
        wait.withMessage("doesnt show negative alert")
                .until
                        (ExpectedConditions.visibilityOf(semesterAlert));
        System.out.println("dd");
    }

    public void negSummerSemesterAlert(){
        wait.withMessage("doesnt show negative alert")
                .until(ExpectedConditions.visibilityOf(summerSemesterAlert));
        System.out.println("ee");
    }


    // Alerts Methods - to check that it doesnt show negetive alerts on positive values
    public void posNumYearsOfStudyAlert(){
        wait.withMessage("shows negative alert on positive value").
                until(ExpectedConditions.visibilityOf(numYearsOfStudyAlert));
    }

    public void posNakazAlert(){
        wait.withMessage("pos nakaz shows negative alert on positive value").
                until(ExpectedConditions.visibilityOf(nakazPtorAlert));
    }

    public void posShnatLimudAlert(){
        wait.withMessage("shows negative alert on positive value")
                .until(ExpectedConditions.visibilityOf(shnatLimudAlert));
    }

    public void posSemesterAlert(){
        wait.withMessage("shows negative alert on positive value")
                .until
                        (ExpectedConditions.visibilityOf(semesterAlert));
    }

    public void posSummerSemesterAlert(){
        wait.withMessage("shows negative alert on positive value")
                .until(ExpectedConditions.visibilityOf(summerSemesterAlert));
    }

    // personal details methods
    public void enterRandFamilyStatus(){
        wait.until(ExpectedConditions.elementToBeClickable(familyStatusField)).click();
        List<WebElement> familyStatusList = wait.until
                (ExpectedConditions.visibilityOfAllElements(familyStatusOptions));
        Random rand = new Random();
        int randOption = rand.nextInt(familyStatusList.size());
        System.out.println(familyStatusList.size());
        System.out.println(randOption);
        familyStatusList.get(randOption).click();
    }

    public void enterSignature(){
        wait.until(ExpectedConditions.elementToBeClickable(signature)).click();
    }


    // add - project field

    //add - misgeret limudim kodemet
}

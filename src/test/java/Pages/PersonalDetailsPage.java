package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class PersonalDetailsPage extends BasePage {

// Data Members

    @FindBy(css = "data-test-chapter-number = '1'")
    WebElement personalDetailsPageValidation;
    @FindBy(css = "[data-test='field-p6'] input")
    WebElement lastNameField;

    @FindBy(css = "[data-test='field-p7'] input")
    WebElement firstNameField;

    @FindBy(css = "[data-test='field-p8'] input")
    WebElement birthYearField;

    @FindBy(css = "[data-test='field-family_status'] input")
    WebElement familyStatusField;

    @FindBy(css = "[class = 'v-list-item v-list-item-" +
            "-link v-theme--light v-list-item--density-default" +
            " v-list-item--one-line v-list-item--variant-text']")
    List<WebElement> familyStatusOptions;


    // Constructor
    public PersonalDetailsPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    // Methods
    public void validationPage(){
        wait.withMessage("page didnt load")
                .until(ExpectedConditions.visibilityOf(personalDetailsPageValidation));
    }

    public void enterLastNameField(String lastName){
        wait.until(ExpectedConditions
                .elementToBeClickable(lastNameField)).sendKeys(lastName);
    }

    public void enterFirstNameField(String name){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField))
                .sendKeys(name);
    }

    public void enterBirthYear(String birthYear){
        wait.until(ExpectedConditions.elementToBeClickable(birthYearField))
                .sendKeys(birthYear);
    }

    public void enterRandFamilyStatus(){
        wait.until(ExpectedConditions.elementToBeClickable(familyStatusField)).click();
        List<WebElement> familyStatusList = wait.until
                (ExpectedConditions.visibilityOfAllElements(familyStatusOptions));
        Random rand = new Random();
        int randOption = rand.nextInt(familyStatusList.size());
        familyStatusList.get(randOption).click();
    }

}
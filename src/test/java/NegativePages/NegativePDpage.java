package NegativePages;

import Pages.PersonalDetailsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NegativePDpage extends PersonalDetailsPage {

    public NegativePDpage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    //negative alerts
    @FindBy(css = "[data-test='field-family_status'] [role = 'alert'] ")
    WebElement familyStatusAlert;

    // Negative Alerts methods
    public void negFamilyStatusAlert(){
        wait.withMessage("doesnt show negative alert").
                until(ExpectedConditions.visibilityOf(familyStatusAlert));
    }
}

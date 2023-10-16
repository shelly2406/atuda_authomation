package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage extends BasePage{
    // Data Members
    @FindBy(className = "html-view")
    WebElement textInFirstPage;

    // Constructor
    public StartPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    // Methods
    public void ValidationFirstPage(){
        wait.until(ExpectedConditions.textToBePresentInElement
                (textInFirstPage,"כתב התחייבות למסלול העתודה האקדמית\n" +
                        "ברוכים הבאים למסלול עתודה! כחלק מהתליך הקליטה יש למלא את כתב ההתחייבות למסלול.\n" +
                        "\n" +
                        "כתב ההתחייבות מחולק כ-7 פרקים, יש לאשר את הנתונים האישיים.\n" +
                        "\n" +
                        "זמן משוער למילוי כת ההתחייבות הוא כ-15 דקות\n" +
                        "\n" +
                        "בהצלחה!\n" +
                        "מתחילים"));
    }
}

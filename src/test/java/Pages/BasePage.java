package Pages;

//import com.google.gson.internal.NonNullElementWrapperList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BasePage extends PageObject{
    //DATA MEMBERS

    @FindBy(css = "[data-test='continue-button']")
    WebElement continueButton;
    @FindBy(css = "[data-test='back-button']")
    WebElement backButton;
    @FindBy(css = "[class = 'v-progress-linear__determinate']")
    WebElement progressLine;

    private String pageWidthProgressLine;

    // CONSTRUCTOR
    public BasePage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }

    //METHODS
    public void clickContinueButton(){
        wait.until(ExpectedConditions.
                elementToBeClickable(continueButton)).click();
    }

    public void clickBackButton() {
        wait.until(ExpectedConditions.elementToBeClickable
                (backButton)).click();
    }

    public void setProgressLine(){
        this.pageWidthProgressLine  = wait.until
                        (ExpectedConditions.visibilityOf(progressLine))
                .getAttribute("style");
    }

    public String getWidthProgressLine() {
        String progressline = pageWidthProgressLine.split(": ")[1];
        return progressline.substring(0,progressline.indexOf('%')-1);
    }

    public void isProgressLineBigger() {
        String lastPageWidth = getWidthProgressLine();
        setProgressLine();
        if (Double.parseDouble(lastPageWidth) < Double.parseDouble
                (this.getWidthProgressLine())) {
            System.out.println("progress line gets longer:)");
        } else {
            System.out.println("error!!!!! progress line" +
                    " doest gets longer with the progress");
        }
    }
}

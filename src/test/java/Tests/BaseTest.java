package Tests;

import Data.Excel;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import Data.Excel;
import NegativePages.NegativeStatementPage;
import Pages.BasePage;
import Pages.StatementPage;
import Tests.BaseTest;
import Tests.MethodLevelTest;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\BenBar\\Desktop\\chromedriver-win64\\chromedriver.exe");
    }

    // Constant definition

    //Personal details page
    protected final String LAST_NAME = "Hadass";
    protected final String FIRST_NAME = "Shelly";
    protected final String BIRTH_YEAR = "2004";
    protected final String NAKAZ_PTOR = "123";
    protected final String NAKAZ_PTOR2 = "123.45";
    protected final String SHNOT_LIMUD_KODMOT = "4";
    protected final String SHNOT_LIMUD_KODMOT2 = "4.5";
    public static int num = 0 ;

    //Statement page


    // Variable definition
    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeTest
    public void initialize(ITestContext iTestContext) {

        int[] array = new int[]{
               325701936,
                325714137,
                215132861,
                215003880,
                214155681,
                214547887,
                214743890,
                214767568,
                214873333,
                214897670,
                329014559,
                214342115,
                325668580,
                327741914,
                327833646,
                334911310
        };
        // Add keys to local storage
        String key = "skip_login";
        String value = "true";
        String key2 = "username";
        String value2 = Integer.toString(array[num])+
                "@idf.il";

        String script = "window.onload = function() {" +
                "  localStorage.setItem('" + key + "', '" + value + "');" +
                "};";
        // add wait for page before navigating to microsoft login


        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);

        iTestContext.setAttribute("driver", driver);

        driver.manage().window().maximize();
        driver.get("https://atuda.preprod.digital.idf.il/agreement/letter-of-commitment");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("  localStorage.setItem('" + key + "', '" + value + "');");
        js.executeScript("  localStorage.setItem('" + key2 + "','" + value2 + "');");
        ((JavascriptExecutor) driver).executeScript(script);
        num+=1;
    }

    @AfterTest
    //change it?
    public void terminate() {
       driver.quit();
    }

    // Methods
}
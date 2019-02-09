package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestBasePorsche {


    public WebDriver driver;
    public SoftAssert soft;
    public Actions actions;
    public Random random;

    @BeforeClass
    public void setUpClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void startUpMethod() {
        driver.get("https://www.porsche.com/usa/modelstart/");
    }

    @BeforeMethod
    public void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        soft = new SoftAssert();
        actions = new Actions(driver);
        random = new Random();
    }

    public static void grabHold(WebDriver driver, String parentHandle){
        /* /NOTE: Be sure to set -> String parentHandle=driver.getWindowHandle(); prior to the action preceding method deployment */
        Set<String> windows= driver.getWindowHandles();
        for(String window: windows){
            if(window!=parentHandle)
                driver.switchTo().window(window);
        }
    }

    public static Double parseMe(WebDriver driver, String xpath, String attribute){
        String findme = driver.findElement(By.xpath(xpath)).getAttribute(attribute).trim();
        char[] x= findme.toCharArray();
        String num ="";
        for (int i = 0; i <findme.length()-1 ; i++) {
            if(Character.isDigit(x[i])) num += x[i];

            if(x[i]=='.'&&Character.isDigit(x[i+1])==true) num += x[i];
        }
        return Double.parseDouble(num);
    }
    public static Double parseMe_noStop(WebDriver driver, String xpath, String attribute){
        String findme = driver.findElement(By.xpath(xpath)).getAttribute(attribute).trim();
        char[] x= findme.toCharArray();
        String num ="";
        for (int i = 0; i <findme.length()-1 ; i++) {
            if(Character.isDigit(x[i])) num += x[i];
        }
        return Double.parseDouble(num+"0");
    }

    public static Double totalPrice(Double basePrice, Double DPHPrice){
        return Option.getOptions_Price()+basePrice+DPHPrice;
    }





}
//       JavascriptExecutor jse = (JavascriptExecutor)driver;
//       jse.executeScript("scroll(0,250);");
////   ("window.scrollBy(0,2000)")'
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",);

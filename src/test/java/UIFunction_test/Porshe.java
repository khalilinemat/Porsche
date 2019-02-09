package UIFunction_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Option;
import utilities.TestBasePorsche;

public class Porshe extends TestBasePorsche {

    @Test
    public void derLängsteTest()throws Exception {
        //718

        driver.findElement(By.xpath("//div[@class='b-teaser-wrapper']/a/div/div/img")).click();

        Double cayman_4 = parseMe(driver, "//div[@id='m982130']/div/div[2]/div[2]","innerText");

        String parentHandle = driver.getWindowHandle();

        driver.findElement(By.xpath("//div[@id='m982130']/div/div[2]/div[2]")).click();
        grabHold(driver, parentHandle);

        Double caymen_base = parseMe_noStop(driver, "(//div[@class='ccaPrice'])[1]","innerText");

        Double equipment_7 = parseMe_noStop(driver, "(//div[@class='ccaPrice'])[2]","innerText");

        Assert.assertTrue(cayman_4.equals(caymen_base),"carPrice");

        Assert.assertTrue(equipment_7.equals(0.0),"equipment");

        Option miamiBlue = new Option(driver,"//li[@id='s_exterieur_x_FJ5']", parseMe_noStop(driver,
                                           "//li[@id='s_exterieur_x_FJ5']","data-price"),"MiamiBlue");

        Assert.assertTrue(miamiBlue.getPrice().equals(Option.getOptions_Price()));

        Double dphPrice = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[7]","innerText");

        Double equipment_PriceOS = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[6]","innerText");

        Double totalPrice_OS = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[8]","innerText");

        Assert.assertTrue(totalPrice_OS.equals(totalPrice(caymen_base,dphPrice)));

        actions.moveToElement(driver.findElement(By.xpath("//li[@id='s_exterieur_x_MXRD']"))).perform();
        Thread.sleep(2000);

        Option wheels = new Option(driver, "//li[@id='s_exterieur_x_MXRD']",parseMe_noStop(driver,"//li[@id='s_exterieur_x_MXRD']","data-price"),"SportWheels20in");

        Double totalPrice_3 = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[8]","innerText");

        Double equipment_Price3 = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[6]","innerText");

        Assert.assertTrue(Option.getOptions_Price().equals(equipment_Price3));

        Assert.assertTrue(totalPrice_3.equals(totalPrice(caymen_base,dphPrice)));

        actions.moveToElement(driver.findElement(By.xpath("(//div[@class='flyout-label-value'])[1]"))).click().perform();

        actions.moveToElement(driver.findElement(By.xpath("//div[@id='submenu_interieur_x_AI_submenu_x_submenu_seats']"))).click().perform();

        Thread.sleep(2000);

        Option sportSeats = new Option(driver,"//span[@id='s_interieur_x_PP06']",parseMe_noStop(driver,
                                                               "(//div[@class='pBox'])[8]","innerText"),"SportSeats");

        Double totalPrice_4 = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[8]","innerText");

        Double equipment_Price4 = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[6]","innerText");

        Thread.sleep(2000);

        Assert.assertTrue(Option.getOptions_Price().equals(equipment_Price4));

        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("//div[@id='IIC_wrapper']")).click();

        Option carbon = new Option(driver, "//div[@id='vs_table_IIC_x_PEKH']/span",parseMe_noStop(driver,
                                                "//div[@id='vs_table_IIC_x_PEKH']/div/div/div","innerText"),"carbon");

        Double totalPrice_5 = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[8]","innerText");

        Double equipment_Price5 = parseMe_noStop(driver,"(//div[@class='ccaPrice'])[6]","innerText");

        Assert.assertTrue(Option.getOptions_Price().equals(equipment_Price5));

        Assert.assertTrue(totalPrice_5.equals(totalPrice(caymen_base,dphPrice)));

    }

    }



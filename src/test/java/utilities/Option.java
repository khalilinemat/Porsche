package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Option extends TestBasePorsche{


    static int optionNum =0;
    static Double Options_Price= 0.0;

    Double price;
    String name;
    Boolean isSelected;
    public static int getOptionNum() {
        return optionNum;
    }

    public String getName() {
        return name;
    }

    public Boolean getSelected() {
        return isSelected;
    }



    public Option(WebDriver driver, String xpath, Double price, String name){
        driver.findElement(By.xpath(xpath)).click();
        this.price=price;
        this.name=name;
        this.isSelected=driver.findElement(By.xpath(xpath)).isSelected();
        optionNum++;
        Options_Price +=price;
    }

    public  Double getPrice(){
        return price;
    }







    public static Double getOptions_Price() {
        return Options_Price;
    }

    public static void setOptions_Price(Double option_Price) {
        Options_Price = option_Price;
    }









}

//    double basePrice;
//    double DPHPrice;

//    public double getBasePrice() {
//        return basePrice;
//    }
//
//    public void setBasePrice(double basePrice) {
//        this.basePrice = basePrice;
//    }
//
//    public double getDPHPrice() {
//        return DPHPrice;
//    }
//
//    public void setDPHPrice(double DPHPrice) {
//        this.DPHPrice = DPHPrice;
//    }


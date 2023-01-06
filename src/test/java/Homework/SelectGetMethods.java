package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class SelectGetMethods extends BaseTest {

    /*

    - https://demoqa.com/select-menu sitesine gidin
    - multiple <select> elementini locate edin
    - getOptions(), getFirstSelectedOption(), getAllSelected() methodlarini kullanmak adina:
    * Farkli secimler yaparak methodlarinizi kullanin ve Assertion yapmayi unutmayin

     */

    @Test
    public void selectGetMethods(){

        driver.get("https://demoqa.com/select-menu");

        WebElement dropDown=driver.findElement(By.id("cars"));
        Select select=new Select(dropDown);


    }
}

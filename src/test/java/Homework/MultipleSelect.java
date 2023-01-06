package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class MultipleSelect extends BaseTest {

    /*

    - https://demoqa.com/select-menu sitesine gidin
    - Multiple select yapabileceginiz <select> elementini locate edin
    - Birden fazla secim yapip secimlerinizi DOGRULAyin

    */

    @Test
    public void multipleSelect(){

        driver.get("https://demoqa.com/select-menu");

        WebElement dropdown=driver.findElement(By.id("cars"));

        Select select=new Select(dropdown);
        System.out.println(select.isMultiple());

        select.selectByIndex(0);
        select.selectByVisibleText("Saab");
        select.selectByIndex(3);

        List<WebElement> selectedElements=select.getAllSelectedOptions();
        for (WebElement each: selectedElements ){
            Assert.assertTrue(each.isSelected());
        }


    }



}

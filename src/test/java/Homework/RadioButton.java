package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class RadioButton extends BaseTest {


    //Go to URL: https://demoqa.com/radio-button
    //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.



    @Test
    public void testRadioButton(){

        //Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");

        //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.

        WebElement yesRadioButton=driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadioButton.click();
        Assert.assertTrue(!yesRadioButton.isSelected());

        WebElement impressiveRadioButton=driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadioButton.click();
        Assert.assertTrue(!impressiveRadioButton.isSelected());

        WebElement noRadioButton=driver.findElement(By.xpath("//label[@for='noRadio']"));
        noRadioButton.click();
        Assert.assertFalse(noRadioButton.isSelected());

        //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

        System.out.println(yesRadioButton.getText());
        System.out.println(impressiveRadioButton.getText());
        System.out.println(noRadioButton.getText());


    }


}

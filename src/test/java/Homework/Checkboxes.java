package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Checkboxes {

    //    Go to URL: https://demoqa.com/
//    Click on Elements.
//    Click on Checkbox.
//    Verify if Home checkbox is selected.
//    Verify that "You have selected" is visible.

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
     //driver.quit();

    }

    @Test
    public void checkBoxes (){
        //    Go to URL: https://demoqa.com/
        driver.get("https://demoqa.com/");

       // Click on Elements.
        driver.findElement(By.xpath("//div[@class='card mt-4 top-card']")).click();


        //    Click on Checkbox.
        driver.findElement(By.xpath("//li [@id='item-1']")).click();

        //    Verify if Home checkbox is selected.
        WebElement homeButton = driver.findElement(By.className("rct-checkbox"));
        Assert.assertTrue("Seçili değil", !homeButton.isSelected());
        homeButton.click();

        //    Verify that "You have selected" is visible.
        WebElement homeButtonMesage= driver.findElement(By.id("result"));
        Assert.assertTrue("Mesaj görünmüyor", homeButtonMesage.isDisplayed());



    }

}

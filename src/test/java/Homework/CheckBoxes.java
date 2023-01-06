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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckBoxes {

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){

        //driver.quit();

    }

    @Test
    public void checkBox(){

        // Go to URL: https://demoqa.com/
        driver.get("https://demoqa.com/");

        //Click on Elements.
        WebElement elementButton= driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]"));
        elementButton.click();

        //Click on Checkbox.
        WebElement checkBoxButton=driver.findElement(By.xpath("//li[@id='item-1']"));
        checkBoxButton.click();

        //Verify if Home checkbox is selected.
        WebElement homeButton=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        if (!homeButton.isSelected()){
            homeButton.click();
        }

        Assert.assertTrue(homeButton.isDisplayed());

        //Verify that "You have selected :" is visible.
        WebElement selected=driver.findElement(By.xpath("//span[text()='You have selected :']"));
        Assert.assertTrue(selected.isDisplayed());





    }





}

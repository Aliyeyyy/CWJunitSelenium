package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Second {


    //Navigate to https://testpages.herokuapp.com/styled/index.html
    // Click on Calculate under Micro Apps.
    // Type any number in the first input.-->İlk girişte herhangi bir sayı yazın.
    // Type any number in the second input.-->ikinci girişte herhangi bir sayı yazın.
    // Click on Calculate.
    // Get the result.
    // Print the result.

    WebDriver driver;

    @Before

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        // driver.quit();

    }
    //Navigate to https://testpages.herokuapp.com/styled/index.html

    @Test
    public void idLocator(){
        driver.get("https://testpages.herokuapp.com");

        // Click on Calculate under Micro Apps.
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();

        // Type any number in the first input.

        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("5240");

        // Type any number in the second input
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("964");

        // Click on Calculate.

        driver.findElement(By.xpath("//input[@id='calculate']")).click();

        // Get the result.

        WebElement sonuc =driver.findElement(By.xpath("//span[@id='answer']"));


        // Print the result.

        System.out.println(sonuc.getText());

    }
}

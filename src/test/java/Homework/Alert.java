package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.BaseTest;

public class Alert extends BaseTest {


    /*

    Go to URL: http://demo.automationtesting.in/Alerts.html
    Click "Alert with OK" and click 'click the button to display an alert box:’
    Accept Alert(I am an alert box!) and print alert on console.
    Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
    Cancel Alert  (Press a Button !)
    Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
    And then sendKeys «BootcampCamp» (Please enter your name)
    Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.


     */


    @Test
    public void alertTest() throws InterruptedException {

        driver.get("http://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("//a[@href='#OKTab']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

        driver.switchTo().alert().sendKeys("BootcampCamp");

        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        System.out.println(driver.findElement(By.id("demo1")).getText());


    }

}

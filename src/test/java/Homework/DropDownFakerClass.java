package Homework;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class DropDownFakerClass extends BaseTest {
    /*

    Go to URL: https://opensource-demo.orangehrmlive.com/
    Login with Username: Admin
    Login with Password: admin123
    Click login button
    Click on PIM
    Click on Employee List
    Employee Name -> Use Faker Class
    ID -> Use Faker Class
    Employment Status -> select by index: 2
    Include -> selectByVisibleText: Current and Past Employees
    Supervisor Name -> Use Faker Class
    Job Title ->selectByValue: IT Manager
    Sub Unit ->selectByValue: 3
    Click search button
    Verify text visible : "No Records Found"

     */


    @Test
    public void fakerClass(){

       driver.get("https://opensource-demo.orangehrmlive.com/");

       //Login with Username: Admin

        Faker faker=new Faker();
        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //Login with Password: admin123
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //Click login button
        WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        //Click on PIM
        WebElement pim=driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]"));
        pim.click();

        //Click on Employee List
        WebElement employeeListButton=driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-item']"));
        employeeListButton.click();

        //Employee Name -> Use Faker Class
        WebElement fakerName=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        fakerName.sendKeys(faker.name().firstName());

        //ID -> Use Faker Class
        WebElement id=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
        id.sendKeys(faker.idNumber().valid());

        //Supervisor Name -> Use Faker Class
        WebElement supervisorName= driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        supervisorName.sendKeys(faker.name().firstName());










    }


}

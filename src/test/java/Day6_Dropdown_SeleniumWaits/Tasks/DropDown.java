package Day6_Dropdown_SeleniumWaits.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDown {

    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test (){

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement dropDown=driver.findElement(By.name("country"));
        Select select =new Select(dropDown);
        select.selectByIndex(26);
    }

    @After
    public void tearDown(){
        // driver.quit();


    }
}

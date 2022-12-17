package Day3_LocatorPraktice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_LocatorPracrice {
//    Go to https://www.linkedin.com/
//    When we write an e-mail without the @ sign in the e-mail box and press enter.
//    Let's test the "Invalid email address" warning.


    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //sayfamizin yuklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // driver imiz maximize edildi

        driver.manage().window().maximize();


    }

    @After
    public void tearDown() {

        // driver imiz kapatildi
        // driver.quit();

    }

        @Test
    public void xPathPractice(){
            //1. adim LinkedIn sitesine gidildi
            driver.get("https://www.linkedin.com");

           // 2. adim email alanina @ sembolu bulunmayan bir email adresi gir
            driver.findElement(By.xpath("//input[@id='session_key']"))
                    .sendKeys("ademalabas"+ Keys.ENTER);
        // 3. Adim Hata mesejinin goruntulendigini dogrula
            WebElement alertmessage =driver.findElement(By.xpath("//p[@class='alert-content']"));
            Assert.assertTrue(alertmessage.isDisplayed());
           // Assert.assertEquals(true,alertmessage.isDisplayed());
           // Assert.assertFalse(!alertmessage.isDisplayed());

    }




}

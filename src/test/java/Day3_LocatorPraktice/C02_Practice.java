package Day3_LocatorPraktice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Practice {

//    Create the driver with BeforeClass and make it static inside the class.
//    Go to http://www.google.com
//    Type "Green Mile" in the search box and print the number of results.
//    Type "Premonition" in the search box and print the number of results.
//    Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
//    Close with AfterClass.



   static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        // driver imiz maximize edildi

        driver.manage().window().maximize();
        //sayfamizin yuklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }


    @Before
    public void beforeEach() {

        driver.get("http://www.google.com");


    }
    @After
    public void afterEach() {

    }

    @AfterClass
    public static void closeDriver() {

        // driver imiz kapatildi
         driver.quit();

    }

    @Test
    public void greenmile() {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Green Miles" + Keys.ENTER);
        WebElement result = driver.findElement(By.id("result-stats"));
        System.out.println("greenmile result =  "  +result.getText());//result =  About 912,000,000 results (0.73 seconds)
    }

    @Test
    public void Premonition() {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Premonition" + Keys.ENTER);
        WebElement result = driver.findElement(By.id("result-stats"));
        System.out.println("premonition result =  "  +result.getText());//result =  About 13,500,000 results (0.49 seconds)
    }

    @Test
    public void BenjaminButton() {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("The Curious Case of Benjamin Button" + Keys.ENTER);
        WebElement result = driver.findElement(By.id("result-stats"));
        System.out.println("Benjamin result =  " + result.getText());//result =  About 5,960,000 results (0.45 seconds)

    }

}

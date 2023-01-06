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

public class First {


    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.

    WebDriver driver;

    @Before

    public void setup() {

        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();
    }

    @Test
    public void idLocator() {
        driver.get("https://id.heroku.com/login");

        //Bir mail adresi giriniz.
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys(" itopdas@gmail.com");
        //Bir password giriniz.
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("4765900");
        //Login butonuna tıklayınız.
        WebElement logIn = driver.findElement(By.xpath("//button[@value='Log In']"));
        logIn.click();
        //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.

        WebElement gor = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        if (gor.getText().equals("There was a problem with your login.")) {
            System.out.println("kayıt yapılamadı");
        } else System.out.println("kayıt yapıldı");

    }
}

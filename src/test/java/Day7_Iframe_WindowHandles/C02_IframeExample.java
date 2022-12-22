package Day7_Iframe_WindowHandles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_IframeExample {


    WebDriver driver;

    @Before
    public void setup(){
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        //driver.quit();

    }

    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
// Web sitesini maximize yapınız.
// İkinci emojiye tıklayınız.
// Tüm ikinci emoji öğelerine tıklayınız.
// Parent iframe geri dönünüz.
// Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.


    @Test
    public void iframeExample (){
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
      // Web sitesini maximize yapınız.
      // İkinci emojiye tıklayınız.
        driver.switchTo().frame("emoojis");

        // Tüm ikinci emoji öğelerine tıklayınız.
        WebElement secondEmojiTab = driver.findElement(By.xpath("//a[contains(@href,'nature')]"));
        secondEmojiTab.click();

        List<WebElement> emojilist = driver.findElements(By.xpath("//div[@id='nature']//img"));


        emojilist.forEach(WebElement::click); // her bir img elementine tıklanıyor

        // Parent iframe geri dönünüz.
        driver.switchTo().defaultContent();

        // Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.
        WebElement Text = driver.findElement(By.id("text"));
        Text.sendKeys("Text");

        WebElement smiles = driver.findElement(By.id("smiles"));
        smiles.sendKeys("Smiles");

        WebElement nature = driver.findElement(By.id("nature"));
        nature.sendKeys("Nature");

        WebElement food = driver.findElement(By.id("food"));
        food.sendKeys("Food");

        WebElement activities = driver.findElement(By.id("activities"));
        activities.sendKeys("Activities");

        WebElement places = driver.findElement(By.id("places"));
        places.sendKeys("Places");

        WebElement objects = driver.findElement(By.id("objects"));
        objects.sendKeys("Objects");


        WebElement applyButton = driver.findElement(By.id("send"));
        applyButton.click();



    }

}

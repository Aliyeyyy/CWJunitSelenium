package Day9_JSEScroll_Cookies_Files;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class C11_AssertElementTrick extends BaseTest {
        @Test
        public void fileUpload(){
            driver.get("https://the-internet.herokuapp.com/upload");
            //Upload edilecek dosyamizi seciyoruz
            WebElement dosyaSec=driver.findElement(By.id("file-upload"));
            dosyaSec.sendKeys("C:\\Users\\busra\\OneDrive\\Masaüstü\\fileExist.png");
            // Upload butonuna basiyoruz
            WebElement uploadFile=driver.findElement(By.id("file-submit"));
            uploadFile.click();
            //Yeniden implement edeceğiz
            // Upload edilme mesajinin goruntulendigini dogruluyoruz
            List<WebElement> uploadedMessageList=driver.findElements(By.tagName("h3"));
            Assert.assertEquals("upload mesajı goruntulenemedi",1, uploadedMessageList.size());
            WebElement uploadMessage=uploadedMessageList.get(0);
            Assert.assertTrue(uploadMessage.isDisplayed());
            Assert.assertEquals("mesajın texti istenilen gibi goruntulenemiyor","File Uploaded!", uploadMessage.getText());
        }
    }


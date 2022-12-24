package Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C03_RobotClass extends BaseTest {

    @Test
    public void test() throws AWTException, InterruptedException {

    driver.get("https://demo.guru99.com/test/upload/");

        WebElement input=driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\busra\\IdeaProjects\\CWJunitSelenium\\src\\test\\java\\resources\\robot.txt");

        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL); //KEYpRESS TUSA BASILI TUTAR,CTRL YE BASTIK
        robot.keyPress(KeyEvent.VK_S); //s tusuna bastık
        Thread.sleep(3000);

        robot.keyRelease(KeyEvent.VK_CONTROL); //keyRelease tusu serbest bırakır
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_ENTER);//enter tusuna bastık
        robot.keyRelease(KeyEvent.VK_ENTER); //enter tusunu bıraktık




    }
}

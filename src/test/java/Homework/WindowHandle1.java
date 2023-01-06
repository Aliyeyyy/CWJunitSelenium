package Homework;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

public class WindowHandle1 extends BaseTest {

   //Go to URL: https://testproject.io/
   //Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
   //        https://blog.testproject.io/


    @Test
    public void windowHandle(){

        driver.get("https://testproject.io/");
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://testproject.io/");

    }


}

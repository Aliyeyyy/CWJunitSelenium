package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseTestReport {

    protected WebDriver driver;

    protected ExtentReports extentReports; //raporlama işlemini gerçekleştirir

    protected ExtentHtmlReporter extentHtmlReporter; // raporu HTML olarak duzenler

    protected ExtentTest extentTest; // testimizin pass veya fail oldugunu saklayan objemiz.Ekran goruntuleri içinde kullanılır

    @Before
    public void setup(){

        //Driver objemizi olusturduk konfıgure ettik
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Extent report objelerimiz de olsturuyoruz
        extentReports=new ExtentReports();

        String currentDate=new SimpleDateFormat("yyyy_MM_dd_hh_mm_hh").format(new Date());
        String filePath=System.getProperty("user.dir") + "/test-output/reports/testReport_" + currentDate + ".html";

        extentHtmlReporter=new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);

        extentReports.setSystemInfo("Environment","QA");
        extentReports.setSystemInfo("Browser", "Chrome");

        extentHtmlReporter.config().setDocumentTitle("CWReport");
        extentHtmlReporter.config().setReportName("Test run report");



    }


    @After
    public void teardown(){
        driver.quit();
        extentReports.flush();

    }
}

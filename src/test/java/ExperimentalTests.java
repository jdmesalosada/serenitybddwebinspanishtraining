import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class ExperimentalTests {

    @Test
    public void downloadPDFTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Julian_Losada\\IdeaProjects\\serenitybddwebinspanishtraining\\src\\test\\resources\\webdriver\\windows\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch Website
        driver.navigate().to("https://file-examples.com/wp-content/uploads/2017/10/file-sample_150kB.pdf");

        Thread.sleep(5000);

        driver.quit();

    }



}

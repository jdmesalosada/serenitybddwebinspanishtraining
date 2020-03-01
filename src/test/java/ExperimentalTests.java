import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ExperimentalTests {

    @Test
    public void downloadPDFTest() throws InterruptedException {

        File folder = new File(UUID.randomUUID().toString());
        folder.mkdir();

        Map<String, Object> chromePrefs = new HashMap<>();
        //chromePrefs.put("download.default_directory", "/Users/julianmesa/Downloads");
        chromePrefs.put("download.default_directory", folder.getAbsolutePath());
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.prompt_for_download", false);
        chromePrefs.put("download.open_pdf_in_system_reader", false);
        chromePrefs.put("plugins.always_open_pdf_externally", true);


        chromePrefs.put("pdfjs.disabled", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Julian_Losada\\IdeaProjects\\serenitybddwebinspanishtraining\\src\\test\\resources\\webdriver\\windows\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/julianmesa/Documents/projects/serenitybddwebinspanishtraining/src/test/resources/webdriver/mac/chromedriver");
        WebDriver driver = new ChromeDriver(options);


        // Launch Website
        driver.navigate().to("https://file-examples.com/wp-content/uploads/2017/10/file-sample_150kB.pdf");

        Thread.sleep(5000);

        driver.quit();

    }

}

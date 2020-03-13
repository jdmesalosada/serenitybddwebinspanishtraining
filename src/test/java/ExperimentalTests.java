import net.thucydides.core.webdriver.WebdriverAssertionError;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ExperimentalTests {

    private static String OS = System.getProperty("os.name").toLowerCase();
    private String driverPath = "/src/test/resources/webdriver/%s/%s";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", getPathDriverByOS());
    }

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

        WebDriver driver = new ChromeDriver(options);

        // Launch Website
        driver.navigate().to("https://file-examples.com/wp-content/uploads/2017/10/file-sample_150kB.pdf");

        Thread.sleep(5000);

        driver.quit();

    }

    @Test
    public void badCertificateTest() throws InterruptedException {

        File folder = new File(UUID.randomUUID().toString());
        folder.mkdir();

        Map<String, Object> chromePrefs = new HashMap<>();
        //chromePrefs.put("download.default_directory", "/Users/julianmesa/Downloads");
        chromePrefs.put("download.default_directory", folder.getAbsolutePath());
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.prompt_for_download", false);
        chromePrefs.put("download.open_pdf_in_system_reader", false);
        chromePrefs.put("plugins.always_open_pdf_externally", true);
        chromePrefs.put("ignore-ssl-errors", true);

        chromePrefs.put("pdfjs.disabled", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

        WebDriver driver = new ChromeDriver(options);

        // Launch Website
        driver.navigate().to(" https://self-signed.badssl.com/");

        Thread.sleep(5000);

        driver.quit();
    }

    private String getPathDriverByOS() {

        String userDirectory = System.getProperty("user.dir");


        if (isWindows()) {
            return userDirectory + String.format(driverPath, "windows", "chromedriver.exe");
        } else if (isMac()) {
            return userDirectory + String.format(driverPath, "mac", "chromedriver");
        } else if (isUnix()) {
            return userDirectory + String.format(driverPath, "linux", "chromedriver");
        }

        throw new IllegalArgumentException("OS not supported");
    }

    private static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
    }
}

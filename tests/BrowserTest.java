package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");

        //with newest versions of Firefox the geckodriver isn't needed.
        //System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");

        //The following two strings make chrome open links properly
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        //WebDriver driver = new ChromeDriver(options);

        WebDriver driver = new InternetExplorerDriver();

        driver.get("http://selenium.dev");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();

    }
}

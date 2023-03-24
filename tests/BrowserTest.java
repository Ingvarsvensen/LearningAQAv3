package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

    public static void main(String[] args) throws InterruptedException {

        String projectPath = System.getProperty("user.dir");

        //with newest versions of Firefox the geckodriver isn't needed.
        //System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");

        //The following two strings make chrome open links properly
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        //WebDriver driver = new EdgeDriver();

        driver.get("http://google.com/");
        Thread.sleep(7000);
        driver.findElement(By.className("gLFyf")).sendKeys("find something");

        List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
        int count = listOfInputElements.size();
        System.out.println("Count of Input Elements: " + count);
        //WebElement textBox = driver.findElement(By.className("gLFyf"));
        //textBox.sendKeys("Automation step by step");

        Thread.sleep(3000);

        driver.close();

    }
}

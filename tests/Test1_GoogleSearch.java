package tests;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        googleSearch();

    }

    public static void googleSearch() throws InterruptedException {

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        //#Step 1: Open Chrome and go to https://google.com/
        driver.get("https://www.google.com/");
        driver.findElement(By.id("L2AGLb")).sendKeys(Keys.RETURN);

        //#Step 2: Enter text into search textbox
        driver.findElement(By.name("q")).sendKeys("How to find a good and cheap property in Malaga?");

        //#Step 3: Click on search button
        //driver.findElement(By.name("btnI")).click();
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

        //#Step 4: Close browser
        Thread.sleep(3000);
        driver.close();

        System.out.println("Test complete successfully");


    }

}

package com.bit.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private WebDriver driver;

    public WebDriver getDriver(String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.out.println("In  getDriver(String browser)");
//            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            System.out.println("In  getDriver(String browser)");
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }
}

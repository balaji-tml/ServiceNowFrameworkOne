package com.bit.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
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
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            System.out.println("In  getDriver(String browser)");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
}

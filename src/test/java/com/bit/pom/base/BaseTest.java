package com.bit.pom.base;

import com.bit.factory.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
//    protected JavascriptExecutor jse;
    protected WebDriverWait wait;
    @BeforeMethod
    public void startDriver()
    {
        System.out.println("In startDriver()");
        String browser = "chrome";
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver = new DriverManager().getDriver("chrome");
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            driver = new DriverManager().getDriver("firefox");
        }
//        jse=(JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Browser loaded!");
    }

    @AfterMethod
    public void quitDriver()
    {
        System.out.println("In quitDriver()");
        if(!(driver == null))
        {
//            driver.quit();
            System.out.println("Browser closed!");
        }
    }
}

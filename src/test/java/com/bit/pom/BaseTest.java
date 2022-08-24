package com.bit.pom;

import com.bit.factory.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void startDriver()
    {
        System.out.println("In startDriver()");
        String browser = "firefox";
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver = new DriverManager().getDriver("chrome");
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            driver = new DriverManager().getDriver("firefox");
        }

    }

    @AfterMethod
    public void quitDriver()
    {
        System.out.println("In quitDriver()");
        if(!(driver == null))
        {
            driver.quit();
        }
    }
}

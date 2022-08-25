package com.bit.testcases;

import com.bit.pom.base.BaseTest;
import com.bit.pom.pages.LandingPage;
import com.bit.pom.pages.InstanceLoginPage;
import com.bit.pom.pages.LoginPage;
import com.bit.pom.pages.WelcomePage;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException {
        System.out.println("In loginTest()");
        System.out.println("1.Open ServiceNow Application");
        driver.get("https://developer.servicenow.com/dev.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("2.Click on SignIn Link");
        LoginPage lp = new LandingPage(driver).clickOnSignIn();
//        Login to ServiceNow Application
        String childWin = null,parentWind = driver.getWindowHandle();
        System.out.println("Parent Window Handle: "+parentWind);
        System.out.println("3.Enter username/email");
        lp.setEmail("bettertester21@gmail.com");
        System.out.println("4.Click on Next Button");
        lp.clickOnNext();
        System.out.println("5.Enter Password");
        lp.setPassword("Password123");
        System.out.println("6.Click on SignIn Button");
        WelcomePage wp = lp.clickOnSignIn();
        Thread.sleep(10000);
        System.out.println("7.Click on Start Building Button");
        InstanceLoginPage ilp = wp.clickOnStartBuilding();
        Thread.sleep(10000);
        Set<String> winHandles = driver.getWindowHandles();
        for(String winHdl:winHandles)
        {
            if(!(winHdl.equals(parentWind)))
            {
                childWin = winHdl;
            }
        }
        System.out.println("Child Window Handle: "+childWin);
        driver.switchTo().window(childWin);
        System.out.println("8.Enter Developer Instance Username");
        ilp.enterUserName("admin");
        System.out.println("9.Enter Developer Instance Password");
        ilp.enterPassword("Password@123");
        System.out.println("10.Click on Login Button");
        ilp.clickOnLogin();

    }
}

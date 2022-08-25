package com.bit.pom.pages;

import com.bit.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By email_ID = By.id("sign_in_username");
    private final By emailNext_ID = By.id("sign_in_username_btn");
    private final By password_ID = By.id("sign_in_password");
    private final By signInBtn_ID = By.id("sign_in_password_btn");


    public LoginPage(WebDriver driver) {
        super(driver);
//        this.driver = driver;
    }

    public void setEmail(String email)
    {
        driver.findElement(email_ID).sendKeys(email);
    }

    public void clickOnNext()
    {
        driver.findElement(emailNext_ID).click();
    }
    public void setPassword(String password)
    {
        driver.findElement(password_ID).sendKeys(password);
    }

    public WelcomePage clickOnSignIn()
    {
        driver.findElement(signInBtn_ID).click();
        return new WelcomePage(driver);
    }

}

package com.bit.pom.pages;

import com.bit.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstanceLoginPage extends BasePage {

    private final By user_name_ID = By.id("user_name");
    private final By password_ID = By.id("user_password");
    private final By login_ID = By.id("sysverb_login");

    public InstanceLoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(String username)
    {
        driver.findElement(user_name_ID).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        driver.findElement(password_ID).sendKeys(password);
    }

    public void clickOnLogin()
    {
        driver.findElement(login_ID).click();
    }


}

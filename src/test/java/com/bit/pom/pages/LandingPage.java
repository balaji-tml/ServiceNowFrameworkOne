package com.bit.pom.pages;

import com.bit.pom.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {

    private final String signIn_JSPATH="document.querySelector(\"body > dps-app\").shadowRoot.querySelector(\"div > header > dps-navigation-header\").shadowRoot.querySelector(\"header > div > div.dps-navigation-header-utility > ul > li:nth-child(2) > dps-login\").shadowRoot.querySelector(\"div > dps-button\").shadowRoot.querySelector(\"button > span\")";

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickOnSignIn()
    {
        WebElement signIn_ELM=(WebElement) jse.executeScript("return "+signIn_JSPATH);
        signIn_ELM.click();
        return new LoginPage(driver);

    }
}

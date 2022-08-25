package com.bit.pom.pages;

import com.bit.pom.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage extends BasePage {

//    private final String startBuilding_JSPATH = "document.querySelector(\"body > dps-app\").shadowRoot.querySelector(\"div > main > dps-home-auth-quebec\").shadowRoot.querySelector(\"div > section:nth-child(1) > div > dps-page-header > div:nth-child(1) > button > span\")";
    private final String startBuilding_JSPATH = "document.querySelector(\"body > dps-app\").shadowRoot.querySelector(\"div > main > dps-home-auth-quebec\").shadowRoot.querySelector(\"div > section:nth-child(1) > div > dps-page-header > div:nth-child(1) > button\")";

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public InstanceLoginPage clickOnStartBuilding()
    {
        WebElement startBuilding_ELM = (WebElement) jse.executeScript("return " + startBuilding_JSPATH);
        startBuilding_ELM.click();
        return new InstanceLoginPage(driver);
    }



}

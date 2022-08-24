package com.bit.testcases;

import com.bit.pom.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest()
    {
        System.out.println("In loginTest()");
        driver.get("https://dev114646.service-now.com");
    }
}

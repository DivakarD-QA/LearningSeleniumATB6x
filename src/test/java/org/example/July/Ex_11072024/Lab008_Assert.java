package org.example.July.Ex_11072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab008_Assert {

    @Test
    public void TestVWOLoginTitle(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        driver.quit();
    }
}

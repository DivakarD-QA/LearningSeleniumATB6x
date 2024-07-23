package org.example.July.Ex_11072024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class Lab009 {
    @Test
    public void ChromiumDriver(){
        ChromiumDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
}

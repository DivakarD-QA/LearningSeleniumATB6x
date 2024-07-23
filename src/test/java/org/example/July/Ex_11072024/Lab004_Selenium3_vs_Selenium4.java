package org.example.July.Ex_11072024;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lab004_Selenium3_vs_Selenium4 {
    public static void main(String[] args) throws InterruptedException {

        // Selenium 3.0
        // JSON wire protocol

        ChromeDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVAKAR D\\Selenium\\driver\\chromedriver-win64\\chromedriver.exe");

        driver.get("https://google.com");
        Thread.sleep(1000);
        driver.quit();



        // Selenium 4.0
        // Selenium manager - W3C protocol
        // opera Removed - :)

        ChromeDriver driver2 = new ChromeDriver();
        driver2.get("https://app.vwo.com/#/login");
        Thread.sleep(2000);
        driver2.close();

    }
}

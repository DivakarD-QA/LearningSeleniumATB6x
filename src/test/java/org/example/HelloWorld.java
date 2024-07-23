package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {
    public static void main(String[] args) {
//        ChromeDriver driver = new ChromeDriver();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
    }

}




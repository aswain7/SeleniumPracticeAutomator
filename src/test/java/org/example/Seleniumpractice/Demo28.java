package org.example.Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo28 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions cp=new ChromeOptions();
        cp.addArguments("--incognito");
        WebDriver driver=new ChromeDriver(cp);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.quit();
    }
}

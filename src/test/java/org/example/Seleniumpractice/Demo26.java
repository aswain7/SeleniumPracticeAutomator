package org.example.Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo26 {
    public static void main(String[] args) {
//        running the code in headless mode
        ChromeOptions cp=new ChromeOptions();
        cp.addArguments("--headless=new");
        WebDriver driver=new ChromeDriver(cp);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);
//



        driver.quit();
    }
}

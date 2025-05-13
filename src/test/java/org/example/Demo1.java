package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        String curl=driver.getCurrentUrl();
        String title= driver.getTitle();
        String pagesource= driver.getPageSource();
        System.out.println(curl);
        System.out.println(title);
        System.out.println(pagesource);
        Thread.sleep(5000);
        driver.quit();

    }
}


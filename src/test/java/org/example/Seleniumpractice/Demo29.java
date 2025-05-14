package org.example.Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class Demo29 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions cp=new ChromeOptions();
        File file=new File("C:\\Users\\amrit\\Downloads\\CRX_Files\\uBlock-Origin-Lite-Chrome-Web-Store.crx");
        cp.addExtensions(file);
        WebDriver driver=new ChromeDriver(cp);
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        driver.quit();
    }
}

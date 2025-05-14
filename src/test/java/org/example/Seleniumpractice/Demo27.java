package org.example.Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo27 {
    public static void main(String[] args) throws InterruptedException {
        //handling ssl certificates
        ChromeOptions cp=new ChromeOptions();
        cp.setAcceptInsecureCerts(true);
        cp.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        WebDriver driver=new ChromeDriver(cp);
        driver.get("https://expired.badssl.com/");
        Thread.sleep(5000);
        driver.quit();
        System.out.println("Success");
    }
}

package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo23 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy('100','3000')"," ");
//        Thread.sleep(3000);
//       Object location_y= js.executeScript("return window.pageYOffset");
//        System.out.println(location_y);
//        Object location_x=js.executeScript("return window.pageXoffset");
//        System.out.println(location_x);
        WebElement checkbox= driver.findElement(By.xpath("//input[@id='tuesday']"));
        js.executeScript("arguments[0].scrollIntoView();",checkbox);
        Thread.sleep(3000);
        System.out.println(js.executeScript("return window.pageYOffset"));
        driver.quit();

    }
}

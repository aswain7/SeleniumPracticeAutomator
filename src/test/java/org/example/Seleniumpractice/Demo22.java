package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo22 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement inputbox= driver.findElement(By.xpath("//input[@id='input1' and not(@class='input-field')]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','john')",inputbox);
        WebElement radio_button=driver.findElement(By.xpath("//input[@id='checkbox1']"));
        js.executeScript("arguments[0].click()",radio_button);
        Thread.sleep(5000);
        driver.quit();
    }
}

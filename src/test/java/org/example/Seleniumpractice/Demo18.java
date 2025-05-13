package org.example.Seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo18 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act=new Actions(driver);
        //double click a button
        Action doubleclick= act.doubleClick(button).build();
        doubleclick.perform();
        //Handle the alert
       Alert handle= driver.switchTo().alert();
       String text= handle.getText();
        System.out.println(text);
        handle.accept();

        driver.quit();

    }
}

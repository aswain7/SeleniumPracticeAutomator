package org.example.Seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class Demo17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement button= driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act=new Actions(driver);
        //Right Click
        Action rightclick = act.contextClick(button).build();
        rightclick.perform();

        //click on copy
        WebElement copy= driver.findElement(By.xpath("//span[text()='Copy']"));
        copy.click();

        Thread.sleep(3000);

        //switch to alert and accept it
        Alert check=driver.switchTo().alert();
        String alert_text= check.getText();
        check.accept();


        driver.quit();


    }
}

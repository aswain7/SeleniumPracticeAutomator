package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Demo20 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);
//        WebElement slider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")));

        WebElement slider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        System.out.println("Before sliding the loaction is "+slider.getLocation());

        Actions act=new Actions(driver);
         Action sliding=act.dragAndDropBy(slider,450,4).build();
         sliding.perform();
         Thread.sleep(5000);

        System.out.println("After sliding the loaction is "+slider.getLocation()); // (449,4)

        Action slidingback=act.dragAndDropBy(slider,-200,4).build();
        slidingback.perform();
        Thread.sleep(5000);

        System.out.println("After sliding back my location is "+slider.getLocation());

        driver.quit();
    }
}

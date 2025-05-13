package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
        driver.switchTo().defaultContent();
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        WebElement iframe=driver.findElement(By.xpath("//iframe[contains(@src, 'docs.google.com/forms')]"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//div[@id='i9']//div[@class='vd3tt']//div[@class='AB7Lab Id5V1']")).click();
        Thread.sleep(5000);


        driver.quit();
    }
}

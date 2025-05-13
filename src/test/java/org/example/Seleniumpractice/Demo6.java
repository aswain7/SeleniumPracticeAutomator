package org.example.Seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Demo6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,(Duration.ofSeconds(5)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //selecting the radio buttons
        driver.findElement(By.xpath("//input[@id='male']")).click();
        //selecting the first 3 days in a week
        List<WebElement> days=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println(days.size());
        for(int i=0;i<days.size();i++){
            if(i<3){
                days.get(i).click();
            }
            else{
                break;
            }
        }
        Thread.sleep(5000);
        WebElement alert1=driver.findElement(By.xpath("//button[@id='alertBtn']"));
        alert1.click();
        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        Thread.sleep(5000);


        WebElement alert2=driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
        alert2.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        WebElement alert3=driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
        alert3.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        Thread.sleep(5000);

        WebElement alert4=driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
        alert4.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


        WebElement alert5=driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
        alert5.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();



        WebElement alert6=driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
        alert6.click();
        Alert alert=driver.switchTo().alert();

        alert.sendKeys("Harry Potter");
        System.out.println(alert.getText());
                alert.accept();


        System.out.println("Done");

        driver.quit();


    }
}

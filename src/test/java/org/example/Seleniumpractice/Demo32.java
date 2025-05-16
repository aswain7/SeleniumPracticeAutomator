package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo32 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //handling input type of date picker
        WebElement inputdate=driver.findElement(By.xpath("//input[@id='datepicker']"));
        inputdate.sendKeys("10/01/1998");

        inputdate.sendKeys(Keys.ESCAPE);

        //handling the dropdown type of date picker
        WebElement inputdate1 = driver.findElement(By.xpath("//input[@id='txtDate']"));
         inputdate1.click();
         List<WebElement> month_dropdown=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']//option"));

         for(WebElement month:month_dropdown){
             if(month.getText().equals("Dec")){
                 month.click();
                 break;
             }
         }

         List <WebElement> year_dropdown=driver.findElements(By.xpath("//select[@class='ui-datepicker-year']//option"));
         for(WebElement year:year_dropdown){
             if(year.getText().equals("2017")){
                 year.click();
                 break;
             }
         }

        

      List<WebElement> datepicks=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
         for(WebElement date:datepicks){
             if(date.getText().equals("15")){
                 date.click();
                 break;
             }
         }
         Thread.sleep(5000);

        driver.quit();
    }
}

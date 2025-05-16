package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Month;
import java.util.List;

public class Demo33 {
    public static void main(String[] args) throws InterruptedException {
        String month="October";
        String year="2024";
        String Date="29";
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(element);
        WebElement datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
        datepicker.click();



        while(true) {
            WebElement monthpicker = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            WebElement yearpicker = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            WebElement moveForward = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
            WebElement moveBackword = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
            int currentYear = Integer.parseInt(yearpicker.getText());
            int targetYear = Integer.parseInt(year);
            int currentMonth = Month.valueOf(monthpicker.getText().toUpperCase()).getValue();
            System.out.println(currentMonth);
            int targetMonth = Month.valueOf(month.toUpperCase()).getValue();
            System.out.println(targetMonth);
            if (monthpicker.getText().equals(month) && yearpicker.getText().equals(year)) {
                Thread.sleep(5000);
                break;

            }

           else if (currentYear < targetYear || (currentYear == targetYear && currentMonth < targetMonth)) {
                moveForward.click();

            } else {
                moveBackword.click();

            }

//            if (Integer.parseInt(yearpicker.getText()) < Integer.parseInt(year) ) {
//                moveForward.click();
//
//                Thread.sleep(2000);
//            }
//            else{
//                moveBackword.click();
//                Thread.sleep(2000);
//            }
        }

        List<WebElement> date=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        for(WebElement dateSelect:date){
            if(dateSelect.getText().equals(Date)){
                dateSelect.click();
                break;
            }

        }
        Thread.sleep(5000);

        driver.quit();
    }
}

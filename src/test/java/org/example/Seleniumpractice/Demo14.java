package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo14 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        System.out.println("No of rows "+rows.size());
        List<WebElement> coloumns=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
        System.out.println("No of coloumns "+coloumns.size());

            for(int j=2;j<= rows.size();j++){
                String author_name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[2]")).getText();
                
                if(author_name.equalsIgnoreCase("Mukesh")){
                    String course_name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[1]")).getText();
                    System.out.print(course_name+" | ");
                    System.out.println(author_name);
                }

            }




    }
}

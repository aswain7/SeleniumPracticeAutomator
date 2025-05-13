package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Set<String> windowids=driver.getWindowHandles();
       for(String s:windowids){
           System.out.println(s);
           String s1=driver.switchTo().window(s).getTitle();

           if(s1.equals("OrangeHRM")){
               String parenttitle=s1;
               System.out.println(parenttitle);
           }
           else{
               String childtitle=s1;
               System.out.println(childtitle);
           }

       }




       driver.quit();
    }
}

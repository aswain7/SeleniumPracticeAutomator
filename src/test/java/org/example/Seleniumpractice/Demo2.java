package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Set<String> windowids=driver.getWindowHandles();
        System.out.println(windowids);
        List<String> windowhandles=new ArrayList<String>(windowids);
        String childId=windowhandles.get(1);
        String parentId=windowhandles.get(0);
        driver.switchTo().window(childId);
        String childTitle=driver.getTitle();
        System.out.println(childTitle);
        driver.switchTo().window(parentId);
        driver.close();
    }
}

package org.example.Seleniumpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class Demo25 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //screenshot of the full page

        TakesScreenshot ts=(TakesScreenshot) driver;
       File source= ts.getScreenshotAs(OutputType.FILE);
       File target=new File("C:\\Users\\amrit\\IdeaProjects\\SeleniumProject\\screenshots\\fullpage.png");
       source.renameTo(target);

//        try {
//            // Ensure parent directory exists
//            target.getParentFile().mkdirs();
//            Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("Screenshot saved successfully.");
//        } catch (IOException e) {
//            System.out.println("Failed to save screenshot: " + e.getMessage());
//        }

        //screenshot of the specific webelement

        WebElement Gui= driver.findElement(By.xpath("//a[text()='GUI Elements']"));
        File source1=Gui.getScreenshotAs(OutputType.FILE);
        File target1=new File("C:\\Users\\amrit\\IdeaProjects\\SeleniumProject\\screenshots\\specificlogo.png");
        source1.renameTo(target1);

        //screenshot of the specific part of the page

        WebElement specific_part= driver.findElement(By.xpath("//div[@class='post hentry uncustomized-post-template']//div[@class='post-body entry-content']//div[@class='form-group'][1]"));
        File source2=specific_part.getScreenshotAs(OutputType.FILE);
        File target2=new File("C:\\Users\\amrit\\IdeaProjects\\SeleniumProject\\screenshots\\specificpart.png");
        source2.renameTo(target2);
       driver.quit();




    }
}

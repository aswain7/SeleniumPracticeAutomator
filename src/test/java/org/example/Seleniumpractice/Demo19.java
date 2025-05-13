package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo19 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        WebElement drag_button=driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement drop_button=driver.findElement(By.xpath("//div[@id='box103']"));
        Actions act=new Actions(driver);
        Action draganddrop=act.dragAndDrop(drag_button,drop_button).build();
        draganddrop.perform();
         String backgroundcolor=drag_button.getCssValue("background-color");
        System.out.println(backgroundcolor);
        if (backgroundcolor.equals("rgba(0, 255, 0, 1)")) {
            System.out.println("✅ Drag and drop successful — element dropped in the correct location.");
        } else {
            System.out.println("❌ Drag and drop failed — element dropped in the wrong location.");
        }




        driver.quit();

    }
}

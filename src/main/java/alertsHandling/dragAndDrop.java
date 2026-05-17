package alertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class dragAndDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        WebElement drag= driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions act=new Actions(driver);
        act.dragAndDrop(drag,drop).build().perform();
        //driver.close();

    }
}

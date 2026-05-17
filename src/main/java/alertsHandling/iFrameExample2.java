package alertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameExample2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        WebElement iframe= driver.findElement(By.xpath("//a[@href='#Multiple']"));
        iframe.click();
        Thread.sleep(3000);
        WebElement inside= driver.findElement(By.xpath(" //iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(inside);
        Thread.sleep(3000);
        WebElement wl1= driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(wl1);
        Thread.sleep(3000);
        WebElement text= driver.findElement(By.xpath(" //input[@type='text']"));
        text.sendKeys("Anoopa");







    }
}

package alertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        WebElement button= driver.findElement(By.id("mousehover"));
        act.moveToElement(button);
        Thread.sleep(3000);
        WebElement Top= driver.findElement(By.xpath("//a[text()='Top']"));
        act.moveToElement(Top);
        act.click().build().perform();


    }
}

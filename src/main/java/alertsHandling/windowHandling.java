package alertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        String parentwindowid= driver.getWindowHandle();
        System.out.println("Parent window id" +" "+ parentwindowid);
        WebElement handling=driver.findElement(By.id("openwindow"));
        handling.click();

    }
}

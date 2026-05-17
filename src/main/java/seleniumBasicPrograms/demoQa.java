package seleniumBasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoQa {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstname= driver.findElement(By.id("firstName"));
        firstname.sendKeys("Anoopa");
        WebElement lastname= driver.findElement(By.id("lastName"));
        lastname.sendKeys("PS");
        //driver.close();
    }
}

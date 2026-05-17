package seleniumBasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement username=driver.findElement(By.cssSelector("input#firstName"));
        username.sendKeys("Anoopa");
        WebElement lastname= driver.findElement(By.cssSelector("input[id='lastName']"));
        lastname.sendKeys("PS");
        WebElement email= driver.findElement(By.cssSelector("input[class='mr-sm-2 form-control']"));
        email.sendKeys("anoopa.mec@gmail.com");
        WebElement gender= driver.findElement(By.cssSelector("input[id='gender-radio-2']"));
        gender.click();
        WebElement MobileNo= driver.findElement(By.cssSelector("input[id^='userN']"));
        MobileNo.sendKeys("9605186044");
        WebElement DOB= driver.findElement(By.cssSelector("input[id$='hInput']"));
        DOB.clear();
        DOB.sendKeys("07/04/1996");
        WebElement hobbies= driver.findElement(By.cssSelector("input[id*='checkbox-1']"));
        hobbies.click();



    }
}

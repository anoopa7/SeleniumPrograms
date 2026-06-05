package seleniumBasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {
    public static void main(String[] args) throws InterruptedException {
        //using Xpath
        //Tagname[@attribute='attribute value']
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        WebElement username= driver.findElement(By.xpath("//input[@name='sername']"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
    }
}

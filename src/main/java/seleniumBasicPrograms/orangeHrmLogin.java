package seleniumBasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class orangeHrmLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebElement username= driver.findElement(By.id("user-name"));
        //WebElement username= driver.findElement(By.className("oxd-label"));
        WebElement username= driver.findElement(By.name("username"));
        //WebElement username= driver.findElement(By.tagName("input"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //WebElement button= driver.findElement(By.tagName("button"));
        //button.click();

        //using link text
        //WebElement link=driver.findElement(By.linkText("http://www.orangehrm.com/"));
        //link.click();

        //using partial link
        //WebElement partiallink=driver.findElement(By.partialLinkText("orangehrm"));
        //partiallink.click();



        //driver.close();
    }
}

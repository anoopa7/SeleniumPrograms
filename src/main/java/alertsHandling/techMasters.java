package alertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class techMasters {
    public static <javascriptExecutor> void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://ecom.gotechmasters.com/login");
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.xpath("//input[@id='txt-email']"));
        username.sendKeys("anoopapsanjeev");
        WebElement password=driver.findElement(By.xpath("//input[@id='txt-password']"));
        password.sendKeys("Anoopa@123");
        WebElement button= driver.findElement(By.xpath("//button[text()='Login']"));
       // button.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        js.executeScript("arguments[0].click()",button);




    }
}

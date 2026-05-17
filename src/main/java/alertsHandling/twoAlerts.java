package alertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twoAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement customer= driver.findElement(By.xpath("//input[@name='cusid']"));
        customer.sendKeys("1234");
        WebElement submit= driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(3000);
        al.accept();
        Alert al2=driver.switchTo().alert();
        System.out.println(al2.getText());
        Thread.sleep(3000);
        al2.accept();
        driver.quit();
    }
}

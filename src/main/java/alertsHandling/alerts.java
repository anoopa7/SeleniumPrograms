package alertsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //simple alert
        WebElement alert= driver.findElement(By.cssSelector("input[id='alertbtn']"));
        alert.click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
        //confirmation alert
        WebElement confirm= driver.findElement(By.cssSelector("input[id='confirmbtn']"));
        confirm.click();
        Alert ale=driver.switchTo().alert();
        System.out.println(ale.getText());
        ale.dismiss();
        //prompt alert
        WebElement name= driver.findElement(By.cssSelector("input[id='name']"));
        name.sendKeys("Anoopa");
        WebElement confirmbutton= driver.findElement(By.cssSelector("input[id='confirmbtn']"));
        confirmbutton.click();
        Alert proalert=driver.switchTo().alert();
        System.out.println(proalert.getText());
        Thread.sleep(3000);
        proalert.accept();
        driver.quit();




    }
}

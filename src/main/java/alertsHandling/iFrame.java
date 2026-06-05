package alertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        //WebElement iframe=driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
        Thread.sleep(3000);
        driver.switchTo().frame("iframeResult");
        WebElement firstname= driver.findElement(By.xpath("//input[@id='fname']"));
        firstname.clear();
        firstname.sendKeys("Anoopa");
        WebElement lastname= driver.findElement(By.cssSelector("input[id='lname']"));
        lastname.clear();
        lastname.sendKeys("PS");
        WebElement button= driver.findElement(By.cssSelector("input[type='submit']"));
        button.click();
        driver.switchTo().defaultContent();



    }
}

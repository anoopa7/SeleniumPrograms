package locatingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select s=new Select(dropdown);
        //s.selectByVisibleText("Option1");
        //s.selectByValue("option2");
        s.selectByIndex(3);

    }
}

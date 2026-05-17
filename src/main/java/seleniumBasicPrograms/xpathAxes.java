package seleniumBasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        WebElement Name= driver.findElement(By.xpath("//input[@name='firstName']"));
        Name.sendKeys("Anoopa");
        WebElement lastName= driver.findElement(By.xpath("//input[@name='firstName']//following::input[1]"));
        lastName.sendKeys("PS");
        WebElement phone=driver.findElement(By.xpath("//input[@name='userName']//preceding::input[1]"));
        phone.sendKeys("9605186044");
        WebElement signon= driver.findElement(By.xpath("//td[@class='mouseOut'][1]//child::a"));
        signon.click();
        driver.close();
        driver.quit();



    }
}

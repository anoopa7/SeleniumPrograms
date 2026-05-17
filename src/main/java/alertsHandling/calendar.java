package alertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class calendar {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        WebElement txtbox= driver.findElement(By.id("datepicker"));
        txtbox.click();
        //WebElement dat= driver.findElement(By.xpath("//a[text()='5']"));
        //dat.click();
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));
        for (WebElement E : dates)
        {
            if (E.getText().contentEquals("7")) {
                E.click();
                break;
            }

            screenshotUtility.createscreenshots(driver);

        }

        //to find the no of rows

        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr"));
        int rowcount= rows.size();
        System.out.println("Total rows" +" "+ rowcount);
    }
}

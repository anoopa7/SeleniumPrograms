package locatingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectDropdown {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='cars']"));
        Select select=new Select(dropdown);
        System.out.println("Is multi select ?"+ select.isMultiple());
        select.selectByVisibleText("Volvo");
        select.selectByValue("saab");
        select.selectByIndex(2);
    }
}

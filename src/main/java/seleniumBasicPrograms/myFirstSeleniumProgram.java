package seleniumBasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstSeleniumProgram {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anoop\\Downloads\\ChromeDriver\\chromedriver-win64\\chromedriver.exe.exe");
        WebDriver driver=new ChromeDriver(); //Webdriver initialization// Webdriver is a interface// ChromeDriver is a class//driver reference
        driver.get("https://www.amazon.in");
    }
}

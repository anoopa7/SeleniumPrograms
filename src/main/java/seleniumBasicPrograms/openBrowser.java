package seleniumBasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anoop\\Downloads\\ChromeDriver\\chromedriver-win64\\chromedriver.exe.exe");
        WebDriver driver=new ChromeDriver();
        String baseUrl ="https://www.google.com";
        driver.get(baseUrl);
        //driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Print the title : "+ driver.getTitle());
        driver.close(); //close the current
        //driver.quit(); //close all opened windows
    }
}

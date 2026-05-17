package alertsHandling;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class screenshotUtility {
    public static void createscreenshots(WebDriver driver) throws IOException {
        TakesScreenshot ts=(TakesScreenshot) driver; //type casting - convert webdriver to type screenshot instance
        File tempfile=ts.getScreenshotAs(OutputType.FILE); //create image file or declaring the file
        File originalfine=new File("screenshots/Calendar.jpeg");//move files to new destination
        FileUtils.copyFile(tempfile,originalfine);//copying file from source to destination





    }
}

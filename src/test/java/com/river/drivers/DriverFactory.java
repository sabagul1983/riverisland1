package com.river.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public DriverFactory() {

        PageFactory.initElements(driver, this);
    }

    public static WebDriver driver;

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void navigate(String url) {
        driver.get(url);
        System.out.println(url);
    }

    public void manage() {
        driver.manage().window().maximize();
    }

    public void putWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

 public void screenShot(ITestResult result) {
//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
// To create reference of TakesScreenshot
                TakesScreenshot screenshot = (TakesScreenshot) driver;
// Call method to capture screenshot
                File src = screenshot.getScreenshotAs(OutputType.FILE);
// Copy files to specific location
// result.getName() will return name of test case so that screenshot name will be same as test case name
                FileUtils.copyFile(src, new File("D:\\" + result.getName() + ".png"));
                System.out.println("Successfully captured a screenshot");
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }
    }

   public void close(){
        driver.close();
    }
}



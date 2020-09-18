package com.river;

import com.river.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.File;

public class Hooks {
    DriverFactory driversFactory = new DriverFactory();

    @Before
    public void openBrowser() {
        driversFactory.setUp();
        driversFactory.navigate("https://www.riverisland.com/");
        driversFactory.manage();
        driversFactory.putWait();
    }
    @After
    public void closeBrowser(){
    driversFactory.close();
}
}




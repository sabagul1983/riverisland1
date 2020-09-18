package com.river.pageobject;

import com.river.drivers.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.List;

import static org.junit.Assert.fail;

public class HomePage extends DriverFactory {

    @FindBy(linkText = "Men")
    WebElement select;

    public void selection() {
        Actions actions = new Actions(driver);
        actions.moveToElement(select).perform();
    }
    @FindBy(linkText = "Tops")
    WebElement item;
    public void clickAction(){
        item.click();
    }
    @FindBy(css="button[data-qa=\"f-sizes-toggle\"]")
    WebElement size;
    public void choseSize(){
        size.click();
    }
    @FindBy(css="label[id=\"label-m\"]")
    WebElement sizes;
    public void choice(){
        sizes.click();
    }

}

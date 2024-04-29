package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LicencesScreen extends BaseHelper{
    public LicencesScreen(AppiumDriver driver) {
        super(driver);
    }
    public boolean isLicencesScreenContainText(String text) {
        return driver.findElement(By.id("licenses_text_view")).getText().contains(text);
    }
}
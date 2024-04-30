package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Collection;

public class MainScreenHelper extends BaseHelper{
    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }
    public void confirm() {
        tap(By.id("android:id/button1"));
    }
    public boolean isNoReminderTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }
    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }
    public String isReminderTitlePresent() {
        return driver.findElement(By.id("recycle_title")).getText();
    }
    public void tapOnTheVerticalDots() {
        tap(By.className("android.widget.ImageView"));
    }
    public void tapOnLicences() {
        tap(By.id("title"));
    }
    public String isReminderDatePresent() {
        return driver.findElement(By.id("recycle_date_time")).getText();
    }
    public String isReminderRepeatOffPresent() {
        return driver.findElement(By.id("recycle_repeat_info")).getText();
    }
    public String isReminderEveryTwoHoursPresent() {
        return driver.findElement(By.id("recycle_repeat_info")).getText();
    }
    public String isReminderTypeOfRepetitionsMinutesPresent() {
        return driver.findElement(By.id("recycle_repeat_info")).getText();
    }
}

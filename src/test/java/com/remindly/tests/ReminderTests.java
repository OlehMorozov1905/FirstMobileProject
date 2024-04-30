package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase{
    @BeforeMethod
    public void precondition() {
        app.getMainScreen().confirm();
    }
    @Test
    public void addReminderTitlePositiveTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent().contains("Holiday"));
    }
    @Test
    public void addReminderWithDatePositiveTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnDateField();
        app.getReminder().swipeToMonth("future", 1, "MAY");
        app.getReminder().selectDate(0);
        app.getReminder().tapOnYear();
        app.getReminder().swipeToYear("future", "2025");
        app.getReminder().tapOnOK();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderDatePresent().contains("1/5/2025"));
    }
    @Test
    public void addReminderWithTimePositiveTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnTimeField();
        app.getReminder().selectTime("am", 277, 922, 540, 1195);
        app.getReminder().tapOnOK();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderDatePresent().contains("9:30"));
    }
    @Test
    public void disableRepeatPositiveTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnToggleSwitch();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderRepeatOffPresent().contains("Repeat Off"));
    }
    @Test
    public void changeRepetitionInterval() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnRepetitionIntervalField();
        app.getReminder().enterIntervalIndex("2");
        app.getReminder().tapOnOkButton();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderEveryTwoHoursPresent().contains("Every 2 Hour(s)"));
    }
    @Test
    public void changeTypeOfRepetitions() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().swipeToTypeOfRepetitions();
        app.getReminder().tapOnTypeOfRepetitionsField();
        app.getReminder().selectMinutes();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderTypeOfRepetitionsMinutesPresent().contains("Every 1 Minute(s)"));
    }
}

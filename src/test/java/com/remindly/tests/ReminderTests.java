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
    public void contentOfTheTextInLicencesSectionPositiveTest() {
        app.getMainScreen().tapOnTheVerticalDots();
        app.getMainScreen().tapOnLicences();
        Assert.assertTrue(app.getLicencesScreen().isLicencesScreenContainText("NOTICES FOR LIBRARIES"));
    }
}

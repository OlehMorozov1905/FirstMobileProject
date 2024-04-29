package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase{
    //confirm OK
    @BeforeMethod
    public void precondition() {
        app.getMainScreen().confirm();
    }
    //verify text is displayed
    @Test
    public void appLaunchTest() {
        Assert.assertTrue(app.getMainScreen().isNoReminderTextPresent());
    }
    @Test
    public void contentOfTheTextInLicencesSectionPositiveTest() {
        app.getMainScreen().tapOnTheVerticalDots();
        app.getMainScreen().tapOnLicences();
        Assert.assertTrue(app.getLicencesScreen().isLicencesScreenContainText("NOTICES FOR LIBRARIES"));
    }
}

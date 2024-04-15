package org.example.tests;

import org.example.pages.TextBoxPage;
import org.example.utils.PropertyHandler;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.example.driverfactory.DriverFactory.getDriver;
import static org.testng.Assert.assertEquals;

public class PageFactoryTests {

    private WebDriver driver;
    private TextBoxPage textBoxPage;

    private PropertyHandler propertyHandler;

    @BeforeClass
    public void initTests() {
        propertyHandler = new PropertyHandler();
        propertyHandler.load("test.properties");
    }

    @BeforeMethod
    public void initBrowser() {
        driver = getDriver(propertyHandler.getProperty("driver.name"));
        driver.manage().window().maximize();

        textBoxPage = new TextBoxPage(driver);

        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void positiveTest() {
        System.out.println("getCheckBoxText method result: " + textBoxPage.getCheckBoxText());
        assertEquals(textBoxPage.getCheckBoxText(), "Check Box", "Was wrong text");
    }

    @Test
    public void negativeTest() {
        System.out.println("getCheckBoxText method result: " + textBoxPage.getCheckBoxText());
        assertEquals(textBoxPage.getCheckBoxText(), "Check Box21", "Was wrong text");
    }

    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }
}

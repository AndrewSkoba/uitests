package org.example.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverProvider implements DriverInvoker {
    @Override
    public WebDriver getDrive() {
        return new FirefoxDriver();
    }
}

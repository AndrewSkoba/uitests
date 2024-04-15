package org.example.driverfactory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static WebDriver getDriver(String driverName) {
        if (driverName.equals("chrome")) {
            return new ChromeDriverProvider().getDrive();
        } else {
            return new FirefoxDriverProvider().getDrive();
        }
    }
}

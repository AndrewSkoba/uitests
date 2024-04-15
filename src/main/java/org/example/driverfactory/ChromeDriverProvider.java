package org.example.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverProvider  implements DriverInvoker {
    @Override
    public WebDriver getDrive() {
        return new ChromeDriver();
    }
}

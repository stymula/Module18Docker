package org.example;

import lombok.SneakyThrows;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;

public class DriverManager {

    private WebDriver driver;

    public WebDriver getDriver(String browser) {
        driver = getRemoteDriver(browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    @SneakyThrows
    public WebDriver getRemoteDriver(String browser) {
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), (Capabilities) getRemoteBrowser(browser));
        return driver;
    }

    public Object getRemoteBrowser(String browser) {
        Object option;
        switch (browser.toLowerCase()) {
            case "firefox":
                option = new FirefoxOptions();
                break;
            case "chrome":
                option = new ChromeOptions();
                break;
            case "edge":
                option = new EdgeOptions();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browser.toLowerCase());
        }
        return option;
    }
}
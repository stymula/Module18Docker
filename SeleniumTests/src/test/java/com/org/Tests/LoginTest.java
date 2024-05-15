package com.org.Tests;

import org.example.DriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeTest
    public void setup(String browser) {
        driver = new DriverManager().getDriver(browser);
        driver.get("https://localhost:5173");
    }

    @SneakyThrows
    @Test
    public void loginTest() {
        driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("password")).sendKeys("admin");
        Thread.sleep(20000);
        driver.findElement(By.xpath("//button[text()='Sign In']")).submit();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
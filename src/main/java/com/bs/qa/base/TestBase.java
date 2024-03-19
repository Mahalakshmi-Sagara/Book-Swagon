package com.bs.qa.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public static Logger logger = Logger.getLogger(TestBase.class);
    public ExtentReports extent = new ExtentReports();
    public ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\HP\\IdeaProjects\\BookSwagon\\test-output\\ExtentReport.html");

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip;
            ip = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\BookSwagon\\src\\main\\java\\com\\bs\\qa\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialization() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
        logger.info("Application launch successfully");
        driver.manage().window().maximize();
    }
}


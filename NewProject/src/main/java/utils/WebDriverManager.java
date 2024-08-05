package utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverManager {

    public WebDriver driver;

    public WebDriver getDriverDetails() throws IOException {

        if (driver == null) {
            File f = new File("src/main/resources/configurationfile/FrameworkConfig.Properties");

            FileInputStream file = new FileInputStream(f);
            Properties prob = new Properties();
            prob.load(file);

            if(prob.getProperty("Browser").equals("Edge"))
            {
                driver = new EdgeDriver();
            }
            else if (prob.getProperty("Browser").equals("Chrome"))
            {
                driver = new ChromeDriver();
            }
            else if (prob.getProperty("Browser").equals("Firefox"))
            {
                driver = new FirefoxDriver();
            }
            else {
                throw new InvalidArgumentException("Enter valid browser name");
            }

            driver.get(prob.getProperty("testenvironment"));
            driver.manage().window().maximize();
        }
        return driver;
    }

}

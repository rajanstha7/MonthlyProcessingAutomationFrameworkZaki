package Utilities;

import config.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver =null;

    public static void Initialize(){
        if(driver == null) {

            if (Configuration.Browser.browser.equalsIgnoreCase("ff")){
                System.setProperty("webdriver.gecko.driver", "D:\\java\\MonthlyProcessingAutomationFramework\\src\\geckodriver.exe");
                driver = new FirefoxDriver();
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }


            else if(Configuration.Browser.browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","D:\\java\\MonthlyProcessingAutomationFramework\\src\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void close(){
        System.out.println("Closing browser");
        driver.close();
        driver=null;
    }

    public static void quit(){
        System.out.println("Closing browser");
        driver.quit();
        driver=null;
    }
}

package Utilities;

import config.logindetails;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    @BeforeClass
    public void setup(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        Driver.Initialize();
        login.url();
        login.userlogin();

    }
    /*
    @AfterClass
    public void closeup(){
        Driver.close();
    }
    /*
    @AfterClass
    public  void quit(){
        Driver.quit();
    }
    */
}

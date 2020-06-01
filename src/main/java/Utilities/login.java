package Utilities;

import config.Configuration;
import config.logindetails;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Test
public class login {
    public static void url() {
        Driver.driver.navigate().to(Configuration.url.app_url);
        System.out.println("URl successfully opened");
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void userlogin(){
        //Enters username
        Driver.driver.findElement(By.cssSelector("input#username")).sendKeys(config.logindetails.logininfo.username);
        //Enters password
        Driver.driver.findElement(By.cssSelector("input[id='password']")).sendKeys(config.logindetails.logininfo.password);

        //Get Login
        Driver.driver.findElement(By.xpath("//button[@class='btn btn-primary login-btn']")).click();
        System.out.println("Successfully login");
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String clientname= logindetails.logininfo.clientname;
        String fullclientxpath = "//span[contains(text(),'" +clientname +"')]";
        System.out.println(fullclientxpath);

        //Set client
        Driver.driver.findElement(By.cssSelector("button[class='btn dropdown-toggle btn-light']")).click();

        //Select desiredclient
        Driver.driver.findElement(By.xpath(fullclientxpath)).click();
        //   Driver.driver.findElement(By.xpath("//span[contains(text(),'\" +clientname +\"')]")).click();
        //Click to go
        Driver.driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Client Selected and moving to client dashboard");
        System.out.println("Client Dashboard Successfully launched");
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

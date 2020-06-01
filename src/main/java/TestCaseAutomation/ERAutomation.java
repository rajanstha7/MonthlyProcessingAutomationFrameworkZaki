package TestCaseAutomation;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ERAutomation  {
    JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
    @Test
    public void selectoption() {
        // TestCases login = new TestCases();
        // login.userlogin();
        Driver.driver.findElement(By.xpath("//span[@id='dropdownMenuButton']//img")).click();
        Driver.driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'ER')]")).click();
        System.out.println("Quick links working");
    }

    @Test
    public void selectERdashboard() {
        Driver.driver.findElement(By.xpath("//span[@id='dropdownMenuButton']//img")).click();
        //select ER from quick links
        Driver.driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'ER')]")).click();

        System.out.println("Dashboard Section Successfully loaded");
    }
    @Test
    public void ERSpendOverTime() {
        System.out.println("ER SPEND OVER TIME -> Annual Spend -> Member Count>");
        Driver.driver.findElement(By.xpath("//span[@id='dropdownMenuButton']//img")).click();
        //select ER from quick links
        Driver.driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'ER')]")).click();
        //Annual Spend
        String ERAnnualSpend = Driver.driver.findElement(By.xpath("//h4[contains(text(),'Annual Spend')]//following-sibling::span")).getText();
        System.out.format("ER Annual Spend : %s\n", ERAnnualSpend);

        System.out.println("*----------------ER Member Count---------------------------*");
        String ERMemberCount = Driver.driver.findElement(By.xpath("//h4[contains(text(),'Member Count')]//following-sibling::span[@class='number']")).getText();
        System.out.format("ER Member Count : %s \n", ERMemberCount);

        System.out.println("*----------------ER Current Risk---------------------------*");
        String ERCurrentRisk = Driver.driver.findElement(By.xpath("//h4[contains(text(),'Current Risk')]//following-sibling::span[@class='number']")).getText();
        System.out.format("ER Current Risk: %s\n", ERCurrentRisk);
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void ERPMPM() {
        System.out.println("ER PMPM");
        Driver.driver.findElement(By.xpath("//span[@id='dropdownMenuButton']//img")).click();
        //select ER from quick links
        Driver.driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'ER')]")).click();
        //Click PMPM
        Driver.driver.findElement(By.xpath("//div[@class='spend-header']//a[@class='nav-link inactive'][contains(text(),'PMPM')]")).click();
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click in graph
        Driver.driver.findElement(By.xpath("//div[@class='disease-item over-spend-box']//div[@class='tab-content']//div[2]//div[1]//*[local-name()='svg']//*[name()='g' and contains(@width,'590')]//*[name()='g' and contains(@class,'circle')]//*[name()='circle' and contains(@cx,'330')]")).click();
        //ER PMPM
        System.out.println("*----------------ER PMPM---------------------------*");
        String ERPMPM = Driver.driver.findElement(By.xpath("//g[@class='svgtooltip']//li[1]")).getText();
        System.out.format("ER PMPM : %s\n", ERPMPM);
    }
    @Test
    public void ERReportingPeriod(){
        Driver.driver.findElement(By.xpath("//span[@id='dropdownMenuButton']//img")).click();
        //select ER from quick links
        Driver.driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'ER')]")).click();
        String ReportingPeriod = Driver.driver.findElement(By.xpath("//span[contains(text(),'Reporting Period')]//following-sibling::span")).getText();
        System.out.format("Reporting Period  : %s\n", ReportingPeriod);

    }
    @Test
    public void ERDemographicsPage(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        Driver.driver.findElement(By.xpath("//span[@id='dropdownMenuButton']//img")).click();
        //select ER from quick links
        Driver.driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'ER')]")).click();
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,200)");
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.driver.findElement(By.xpath("//a[contains(text(),'Demographics')]")).click();
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void  ERDemographicAge(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        Driver.driver.findElement(By.xpath("//span[@id='dropdownMenuButton']//img")).click();
        //select ER from quick links
        Driver.driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'ER')]")).click();
        js.executeScript("window.scrollBy(0,200)");
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.driver.findElement(By.xpath("//a[contains(text(),'Demographics')]")).click();
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("All Pharmacy Population : Age");
        js.executeScript("window.scrollBy(0,500)");

        System.out.println("All ER Population : Age");
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String ERSpendAgeASpend = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][2]/*[name()='text'][1]/*[name()='tspan'][2]/*[name()='tspan'][1]")).getText();
        System.out.format("0-19 Spend=%s\n", ERSpendAgeASpend);

        String ERSpendAgeAmember = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][2]/*[name()='text'][1]/*[name()='tspan'][3]/*[name()='tspan'][1]")).getText();
        System.out.format("0-19 Member Count=%s\n", ERSpendAgeAmember);

        String ERSpendAgeBSpend = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][3]/*[name()='text'][1]/*[name()='tspan'][2]/*[name()='tspan'][1]")).getText();
        System.out.format("20-39 Spend=%s\n", ERSpendAgeBSpend);

        String ERSpendAgeBmember = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][3]/*[name()='text'][1]/*[name()='tspan'][3]/*[name()='tspan'][1]")).getText();
        System.out.format("20-39 Member Count=%s\n", ERSpendAgeBmember);

        String ERSpendAgeCSpend = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][3]/*[name()='text'][1]/*[name()='tspan'][3]/*[name()='tspan'][1]")).getText();
        System.out.format("40-59 Spend=%s\n", ERSpendAgeCSpend);

        String ERSpendAgeCmember = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][4]/*[name()='text'][1]/*[name()='tspan'][3]/*[name()='tspan'][1]")).getText();
        System.out.format("40-59 Member Count=%s\n", ERSpendAgeCmember);


        String ERSpendAgeDSpend = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][5]/*[name()='text'][1]/*[name()='tspan'][2]/*[name()='tspan'][1]")).getText();
        System.out.format("60-64 Spend=%s\n", ERSpendAgeDSpend);
        String ERSpendAgeDmember = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][5]/*[name()='text'][1]/*[name()='tspan'][3]/*[name()='tspan'][1]")).getText();
        System.out.format("60-64 Member Count=%s\n", ERSpendAgeDmember);

        String ERSpendAgeESpend = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][6]/*[name()='text'][1]/*[name()='tspan'][2]/*[name()='tspan'][1]")).getText();
        System.out.format("65+ Spend=%s\n", ERSpendAgeESpend);
        String ERSpendAgeEmember = Driver.driver.findElement(By.xpath("//div[@class='disease-box age-box']//div[@class='svg-data']//*[local-name()='svg']//*[name()='g' and contains(@class,'table row-')]//*[name()='g'][6]/*[name()='text'][1]/*[name()='tspan'][3]/*[name()='tspan'][1]")).getText();
        System.out.format("65+ Member Count=%s\n", ERSpendAgeEmember);



    }
}
package TestCaseAutomation;
import Utilities.Driver;

import Utilities.TestBase;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestCases extends TestBase {
    ERAutomation er = new ERAutomation();

    @Test
    public void ERselect(){
        er.selectoption();
        System.out.println("Quick Links directing to ER page");
    }

    @Test
    public void ERdashboard() {

        er.selectERdashboard();
        System.out.println("Dashboard Section Successfully loaded");
    }

    @Test
    public void ERReportingPeriod() {
        er.ERReportingPeriod();
        System.out.println("ER Reporting Period Showing ");
    }

    @Test
    public void ERSpendOverTime() {
        er.ERSpendOverTime();

        System.out.println("ER SPEND OVER TIME ALL INFO SHOWING");

    }

    @Test
    public void ERPMPM(){
    er.ERPMPM();
        System.out.println("ER PMPM AMOUNT DISPLAYED");

    }
    @Test
    public void ERDemographicpage(){
        er.ERDemographicsPage();
        System.out.println("Switching to ER Demographic Tab");
    }

    @Test
    public void ERDemographicAge(){
        er.ERDemographicAge();
        System.out.println("ER Demographic AGE");
    }




}

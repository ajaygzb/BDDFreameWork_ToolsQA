package Runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"stepDefination"},
                 dryRun=false,monochrome=true,
                 plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
             	tags = {"@E2E2"}	

		
		
		
		)

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.7.0");
		    Reporter.setSystemInfo("Maven", "3.5.2");
		    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}

}

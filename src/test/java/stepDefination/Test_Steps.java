package stepDefination;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.http.auth.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_Steps{

	public static WebDriver driver;


	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		if (driver==null){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ajay.kumar4\\workspace\\Parallel\\BMS_Cucumber\\src\\test\\java\\com\\dataRepository\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
		}
	}

	@When("^User Navigates to Login Page$")
	public void User_Navigates_to_Login_Page() throws Throwable {
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}

	@When("^User enters Username and Password$")
	public void User_enters_Username_and_Password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ajay.kumar4@rsystems.com"); 
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("ajay@123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath("//a[@class='logout']")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
		// Close the driver

		driver.quit();
	}


	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='passwd']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username); 
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable usercredentials) throws Throwable {

		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='passwd']")).clear();
		List<List<String>> data=usercredentials.raw();
		data.get(0).get(0);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(0).get(0)); 
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='passwd']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(1).get(0)); 
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
	
	@When("^User enters multiple Credentials to LogIn$")
	public void user_enters_multiple_Credentials_to_LogIn(DataTable usercredentials) throws Throwable {
	//public void user_enters_multiple_Credentials_to_LogIn(List<Credentials> usercredentials) throws Throwable {
		for(Map<String,String> data:usercredentials.asMaps(String.class, String.class)){
			
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='passwd']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get("Username")); 
		//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Credentials.get); 
			driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(data.get("Password"));
			
			driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
			
			
		}
			
			
			
		}
		
		
		
	  
	}









package Parallel;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAddCustomerAddTariffPlan {
	
	WebDriver driver;
	
	@Given("^user is present on login page$")
	 public void user_is_present_on_loginpage()  
	 
	 {
	 System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://demo.guru99.com/V1/index.php");
	// it is a dummy comment	
	 
	 }
		
	 
	 @And("^title of login page is GTPL Bank Home Page$")
	 public void title_of_loginpage_is_gtpl_bank_homepage()

	 {
			  
	 String title = driver.getTitle();
	 System.out.println(title);
					
	 }

		  
	 @When("^user enters userID and password$")
	 public void user_enter_userid_password(DataTable dataTable) throws InterruptedException  
		  
	 {
		
	 List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class); 
		 
	 for(Map<String,String> e : userlist)
	 {
	 
	 WebElement userID = driver.findElement(By.xpath("//input[@name='uid']"));
	 WebElement enterpassword = driver.findElement(By.xpath("//input[@name='password']"));
			   	  
	 userID.sendKeys(e.get("userID"));
	 Thread.sleep(2000);
	 enterpassword.sendKeys(e.get("password"));
	 Thread.sleep(2000);
	 }
	 }	
	 

	 @And("^user clicks on login button$")
	 public void user_clicks_loginbutton() 
		   
	 {
			    
	 WebElement loginbutton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				
	 Actions act = new Actions(driver);
	 act.moveToElement(loginbutton).click().build().perform();
		     
	 }
		    

	 @Then("^user is on home page$")
	 public void user_on_homepage() throws InterruptedException  
			
	 {
				
	 String title = driver.getTitle();
	 System.out.println(title);
	 		 
	 
	 }		
		
	 @And("^user clicks on telecom project$")
	 public void user_click_on_telecom_project() throws InterruptedException 
		   
	 {
			    
	 WebElement telecomproject = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
				
	 Actions act = new Actions(driver);
	 act.moveToElement(telecomproject).click().build().perform();
	 
	 Thread.sleep(2000);
	 
	 WebElement closebutton = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
	 Actions act1 = new Actions(driver);
	 act1.moveToElement(closebutton).click().build().perform();	 
	 
	 }
	 
	 
	 @And("^user clicks on add customer$")
	 public void user_click_on_add_customer() throws InterruptedException 
		   
	 {
		 
	 WebElement iframe = driver.findElement(By.xpath("//iframe[@name='__uspapiLocator']"));
	 driver.switchTo().frame(iframe);
		 
	 Thread.sleep(2000); 
			    
	 WebElement addcustomer = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
				
	 Actions act = new Actions(driver);
	 act.moveToElement(addcustomer).click().build().perform();
		     
	 }
	 
	  
	 @When("^user selects background check as done and enters billing address$")
	 public void user_selects_background_check_and_enterts_billing_address(DataTable dataTable) throws InterruptedException
	 
	 {
		    
	 List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);       
	     
	 for (Map<String, String> e : userlist)
		    
	 {

	 WebElement done = driver.findElement(By.xpath("//input[@id='done']"));	 
	 WebElement firstname = driver.findElement(By.xpath("//input[@id='fname']"));
	 WebElement lastname = driver.findElement(By.xpath("//input[@id='lname']"));
	 WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	 WebElement address = driver.findElement(By.xpath("//textarea[@id='message']"));	
	 WebElement mobilenumber = driver.findElement(By.xpath("//input[@id='telephoneno']"));
	 
	 Actions act = new Actions(driver);
	 act.moveToElement(done).click().build().perform();
	 Thread.sleep(2000);
	 firstname.sendKeys(e.get("firstname"));
	 Thread.sleep(2000);
	 lastname.sendKeys(e.get("lastname"));
	 Thread.sleep(2000);
	 email.sendKeys(e.get("email")); 
	 Thread.sleep(2000);
	 address.sendKeys(e.get("address"));  
	 Thread.sleep(2000);
	 mobilenumber.sendKeys(e.get("mobilenumber"));  
	 Thread.sleep(2000);
	 
	 
	 WebElement submitbutton = driver.findElement(By.xpath("//input[@type='submit']"));
	 Actions act1 = new Actions(driver);
	 act1.moveToElement(submitbutton).click().build().perform();
	 
	 Thread.sleep(2000);
	 
	 WebElement homebutton = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
	 Actions act2 = new Actions(driver);
	 act2.moveToElement(homebutton).click().build().perform();
	 
	 Thread.sleep(2000);
	 
	 WebElement addcustomer = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
	 Actions act3 = new Actions(driver);
	 act3.moveToElement(addcustomer).click().build().perform();
	 
	  }
	  }
	 
	 @And("^user again comes on telecom projects homepage$")
	 public void user_again_comes_on_telecom_projects_homepage() throws InterruptedException 
		   
	 {
			    
	 WebElement telecomproject = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
				
	 Actions act = new Actions(driver);
	 act.moveToElement(telecomproject).click().build().perform();
	 
	 }	
	 
	 
	 @And("^user clicks on add tariff plan$")
	 public void user_clicks_on_add_tariff_plan() throws InterruptedException 
	 
	 {
		 
	 WebElement iframe = driver.findElement(By.xpath("//iframe[@name='__uspapiLocator']"));
	 driver.switchTo().frame(iframe);
			 
	 Thread.sleep(2000); 
		 
	WebElement AddTariffPlan = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
			
	 Actions act = new Actions(driver);
	 act.moveToElement(AddTariffPlan).click().build().perform(); 
		 
	 }
	 
	 
	 @When("^user enters add tariff plan details and clicks on submit button$")
	 public void user_enters_add_tariff_plan_details_and_clicks_on_submit_button(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	 
	 {
		   
	 List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);       
	     
	 for (Map<String, String> e : userlist)
			    
	 {

	 WebElement MonthlyRental               = driver.findElement(By.xpath("//input[@id='rental1']"));	 
	 WebElement FreeLocalMin                = driver.findElement(By.xpath("//input[@id='local_minutes']"));
	 WebElement FreeInternationalMin        = driver.findElement(By.xpath("//input[@id='inter_minutes']"));
	 WebElement FreeSMSPack                 = driver.findElement(By.xpath("//input[@id='sms_pack']"));
	 WebElement LocalPerMinCharges          = driver.findElement(By.xpath("//input[@id='minutes_charges']"));	
	 WebElement InternationalPerMinCharges  = driver.findElement(By.xpath("//input[@id='inter_charges']"));
	 WebElement SMSPerCharges               =  driver.findElement(By.xpath("//input[@id='sms_charges']"));	 
		
		 
	 MonthlyRental.sendKeys(e.get("monthly rental"));
	 Thread.sleep(2000);
	 
	 FreeLocalMin.sendKeys(e.get("free local min"));
	 Thread.sleep(2000);
		 
	 FreeInternationalMin .sendKeys(e.get("free international min")); 
	 Thread.sleep(2000);
		 
	 FreeSMSPack .sendKeys(e.get("free sms pack"));  
	 Thread.sleep(2000);
		 
	 LocalPerMinCharges.sendKeys(e.get("local per min charges"));  
	 Thread.sleep(2000);	
	 
	 InternationalPerMinCharges.sendKeys(e.get("international per min charges"));  
	 Thread.sleep(2000);	
	 
	 SMSPerCharges.sendKeys(e.get("sms per charges"));  
	 Thread.sleep(2000);	
	 
	 WebElement SubmitButton = driver.findElement(By.xpath("//input[@value='submit']"));
		
	 Actions act1 = new Actions(driver);
	 act1.moveToElement(SubmitButton).click().build().perform(); 
	 
	 Thread.sleep(2000);
	 
	 WebElement HomeButton = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
		
	 Actions act2 = new Actions(driver);
	 act2.moveToElement(HomeButton).click().build().perform(); 
		 
	 Thread.sleep(2000);
	 
	 WebElement AddTariffPlan = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		
	 Actions act = new Actions(driver);
	 act.moveToElement(AddTariffPlan).click().build().perform(); 
	 
	 
	 }	
	 }
	 
	 
	 @Then("^user again comes to telecom projects homepage by clicking on telecom project$")
	 public void user_again_comes_to_telecom_projects_homepage_by_clicking_on_homebutton()
	 
	 {
		 
	 WebElement telecomproject = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
			
	 Actions act = new Actions(driver);
	 act.moveToElement(telecomproject).click().build().perform();
		 
	 }	 
	 
	 
}

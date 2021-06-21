package stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.com.thoughtworks.xstream.io.xml.Dom4JDriver;

public class stepdefintion {
	
	
	
	@Given("^The application http://elearningm(\\d+)\\.upskills\\.in/ Url given$")
	
	public void the_application_http_elearningm_upskills_in_Url_given(int arg1) 
	
		{
	    
		System.setProperty("webdriver.chrome.driver","C://SDET//chromedriver_win32//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		
		}

	

/@When("^Start to register with the signup button$")
	
public void start_to_register_with_the_signup_button() 
	{
		driver.findElement(By.partialLinkText("Sign up!")).click();
	}

	@When("^Give the user details Firstname\"([^\"]*)\"$")
	public void give_the_user_details_Firstname(FirstName ) 
	{
		driver.findElement(By.xpath("//[@id='registration_firstname']")).sendkeys(FirstName);
	}

	@When("^add Lastname\"([^\"]*)\"$")
	public void add_Lastname(String LastName) 
	{
		driver.findElement(By.xpath("//[@id='registration_lastname']")).sendkeys(LastName);
	}

	@When("^Enter then e-mail address \"([^\"]*)\"$")
	public void enter_then_e_mail_address(String e-mail) 
	{
		driver.findElement(By.xpath("//[@id='registration_email']")).sendkeys(e-mail);	}

	@When("^Give the user details Username\"([^\"]*)\"$")
	public void give_the_user_details_Username(String UserName) 
	
	{
		driver.findElement(By.xpath("//[@id='username']")).sendkeys(UserName);
	}

	@When("^Enter the Pass\"([^\"]*)\"$")
	public void enter_the_Pass(String password)
	{
		
		driver.findElement(By.xpath("//[@id='pass1']")).sendkeys(password);
	}

	@Then("^confirm password \"([^\"]*)\"$")
	public void confirm_password(String ConfirmPassword) 
	
	
	{
		driver.findElement(By.xpath("//[@id='pass2']")).sendkeys(ConfirmPassword);
	}

	@Then("^Enter the Register button$")
	public void enter_the_Register_button() 
	{
		driver.findElement(By.xpath("//[@id='registration_submit']")).click();
	}

	@Then("^click dropmenu top right side$")
	public void click_dropmenu_top_right_side() 
	{
		driver.findElement(By.xpath("//[@ class='caret']")).click();
	}

	@Then("^click the Inbox$")
	public void click_the_Inbox()
	{
		
		driver.findElement(By.xpath("//[@ title=Inbox]")).click();
	}

	@Then("^click on the compose icon$")
	public void click_on_the_compose_icon() 
	
	{
		driver.findElement(By.xpath("//[@title='Compose message']").Click();
	}

	@Then("^enter the sendto mailId \"([^\"]*)\"$")
	public void enter_the_sendto_mailId(String mailID) 
	
	{
		driver.findElement(By.xpath("//class='select2-search__field']").sendkeys(mailID);
	}

	@Then("^Enter the subject \"([^\"]*)\" and Message \"([^\"]*)\"$")
	public void enter_the_subject_and_Message(String Subject, String Message) 
	{
		
		driver.findElement(By.xpath("//[@id='compose_message_title']").sendkeys(Subject,Message);
	}

	@Then("^Click on the send message$")
	public void click_on_the_send_message() 
	
	{
		driver.findElement(By.xpath("//[@id='compose_message_compose']").click();
		
	}

	@Then("^verify the message sent confirmation$")
	public void verify_the_message_sent_confirmation() {
	}


}

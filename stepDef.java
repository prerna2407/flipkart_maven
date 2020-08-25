package stepDefinition;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
 WebDriver driver;
 
 @Given("^Flipkart website is loaded$")
 public void flipkart_website_is_loaded() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","./src/test/resources/Drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	
     // Write code here that turns the phrase above into concrete actions
    
 }

 @When("^User enters UserName and password and login$")
 public void user_enters_UserName_and_password_and_login() throws Throwable {
	 driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']")).sendKeys( "Prerna");
		driver.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
     // Write code here that turns the phrase above into concrete actions
   
 }

@Then("^Login should not be successful and verify the error message$")
public void Login_should_not_be_successful_and_verify_the_error_message() throws Throwable{
assertEquals("Please enter valid Email ID/Mobile number",driver.findElement(By.xpath("//span[2]/span")).getText());
	
}

}

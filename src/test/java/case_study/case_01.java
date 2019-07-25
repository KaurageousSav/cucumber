package case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case_01 {
	WebDriver driver;
	@Given("Home page is openned")
	public void home_page_is_openned() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Given("Signup link is clicked")
	public void signup_link_is_clicked() {
		driver.findElement(By.linkText("SignUp")).click();
	    
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys("tuffy");
	    
	}

	@When("User gives his first name {string}")
	public void user_gives_his_first_name(String string) {
		driver.findElement(By.name("firstName")).sendKeys("savleen");
	   
	}

	@When("User gives his last name {string}")
	public void user_gives_his_last_name(String string) {
		driver.findElement(By.name("lastName")).sendKeys("kaur");
	   
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.name("password")).sendKeys("password123");
	    
	}

	@When("User re-enters the password as {string}")
	public void user_re_enters_the_password_as(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys("password123");
	    
	}

	@When("User selects gender as {string}")
	public void user_selects_gender_as(String string) {
		driver.findElement(By.xpath("//input[@type='radio' and @value='Female']")).click();
	    
	}

	@When("User gives email id {string}")
	public void user_gives_email_id(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys("1507054@kiit.ac.in");
	    
	}

	@When("User gives mobile number {string}")
	public void user_gives_mobile_number(String string) {
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1235678900");
	   
	}

	@When("User enter date of birth {string}")
	public void user_enter_date_of_birth(String string) {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
		  Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		  year.selectByVisibleText("2000");
		  Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
		  month.selectByVisibleText("Sep");
		  driver.findElement(By.linkText("9")).click();
	    
	}

	@When("User enters address {string}")
	public void user_enters_address(String string) {
		driver.findElement(By.id("address")).sendKeys("asdfghjkloiuytrewq");
	   
	}

	@When("User selects security question {string}")
	public void user_selects_security_question(String string) {
		Select pc=new Select(driver.findElement(By.name("securityQuestion")));
		  pc.selectByIndex(1);
	    
	}

	@When("User gives the answer to the security question {string}")
	public void user_gives_the_answer_to_the_security_question(String string) {
		driver.findElement(By.id("answer")).sendKeys("Snuffy");
		driver.findElement(By.name("Submit")).click();
	    
	}

	@Then("User will find the LogIn page")
	public void user_will_find_the_LogIn_page() {
		System.out.println("homepage title"+driver.getTitle());
	    
	}

}

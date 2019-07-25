package case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	@Given("User opens the application")
	public void user_opens_the_application(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	
	}
	@When("User clicks on Signin link")
	public void user_clicks_on_Signin_link() {
		driver.findElement(By.linkText("SignIn")).click();
		//driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	
	

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password){
		//driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys(username);
		//driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();

		driver.close();
	}

	@Then("Message is displayed Login Successfully")
	public void message_is_displayed_Login_Successfully() {

	}
}

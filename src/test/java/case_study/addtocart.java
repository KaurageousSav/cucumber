package case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtocart {
	WebDriver driver;
	@Given("User opens the Home page")
	public void user_opens_the_Home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Given("User clicks on the SignIn page")
	public void user_clicks_on_the_SignIn_page() {
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User gives username as {string}")
	public void user_gives_username_as(String string) {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	    
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("password123");
	    
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.name("Login")).click();
	   
	}

	@When("User searches {string} in the search bar to scroll down and select homepage")
	public void user_searches_in_the_search_bar_to_scroll_down_and_select_homepage(String string) {
		WebElement search=driver.findElement(By.name("products"));
		Actions act1=new Actions(driver);
		act1.sendKeys(search,"head").perform();
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	}

	@When("User clicks on Add to Cart button")
	public void user_clicks_on_Add_to_Cart_button() {
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		 
	}

	@When("User clicks on cart link")
	public void user_clicks_on_cart_link() {
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	}

	@Then("Cart page is displayed")
	public void cart_page_is_displayed() {
		System.out.println("Yoyo");
	    
	}

	@When("User clicks on Checkout button")
	public void user_clicks_on_Checkout_button() {
		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	}

	@When("User enters Shipping address as {string}")
	public void user_enters_Shipping_address_as(String string) throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@id='add1']")).sendKeys("Bengaluru");
		Thread.sleep(2000);
	}

	@When("User clicks on Proceed to pay button")
	public void user_clicks_on_Proceed_to_pay_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		Thread.sleep(5000);
	}

	@Then("Payment page is displayed")
	public void payment_page_is_displayed() {
	    System.out.println("Hi I am donut");
	}

	@When("User selects Bank in net banking")
	public void user_selects_Bank_in_net_banking() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		//driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"swit\"]/div[2]/div/label/i")).click();
		Thread.sleep(2000);
	    
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.xpath("//*[@id='btn']")).click();
	}

	@When("User provides username as {string}")
	public void user_provides_username_as(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'horizontalTab\']/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("transpwd")).click();
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("SignOut")).click();
	}

	@When("User clicks on LOGIN Button")
	public void user_clicks_on_LOGIN_Button() {
		System.out.println("Bye");
		
		//driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		//*[@id="horizontalTab"]/div[2]/div/div/div/div/form/div/div[2]/input
		//*[@id="horizontalTab"]/div[2]/div/div/div/div/form/div/div[3]/input
	    
	}

	@When("User enters transaction password as {string}")
	public void user_enters_transaction_password_as(String string) throws InterruptedException {
		System.out.println("Hello");
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\'horizontalTab\']/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
	    
	}

	@When("User clicks on PAYNOW Button")
	public void user_clicks_on_PAYNOW_Button() throws InterruptedException {
		System.out.println("Do");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	
	}//*[@id="horizontalTab"]/div[2]/div/div/div/div/form/div/div[2]/input

	@Then("Order details are displayed")
	public void order_details_are_displayed() throws InterruptedException {
		System.out.println("Go");
		//driver.findElement(By.linkText("SignOut")).click();
		
	    
	}

}

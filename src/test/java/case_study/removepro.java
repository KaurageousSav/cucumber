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

public class removepro {
	WebDriver driver;
	@Given("testMe app homepage is open")
	public void testme_app_homepage_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@When("user click on SignIn link")
	public void user_click_on_SignIn_link() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user provides {string} as username")
	public void user_provides_as_username(String string) {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	    
	}

	@When("user provides {string} as password")
	public void user_provides_as_password(String string) {
		driver.findElement(By.id("password")).sendKeys("password123");
	}

	@When("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("logIn page is displayed")
	public void login_page_is_displayed() {
		System.out.println("Go");
	}

	@When("user click on Search box")
	public void user_click_on_Search_box() {
		WebElement search=driver.findElement(By.name("products"));
		Actions act1=new Actions(driver);
		act1.sendKeys(search,"head").perform();
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("user enters {string} on search box to scroll down and select headphone")
	public void user_enters_on_search_box_to_scroll_down_and_select_headphone(String string) {
		System.out.println("Go");
	}

	@When("user clicks on Add to Cart button")
	public void user_clicks_on_Add_to_Cart_button() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("user clicks on cart link")
	public void user_clicks_on_cart_link() {
		System.out.println("Go");
	}

	@Then("cart page is displayed")
	public void cart_page_is_displayed() {
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	}

	@When("User clicks on remove button")
	public void user_clicks_on_remove_button() {
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")).click();
	   
	}

	@Then("Error message is displayed")
	public void error_message_is_displayed() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("SignOut")).click();
	    System.out.println("Go");
	}

}

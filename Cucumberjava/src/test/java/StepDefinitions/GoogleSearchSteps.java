package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

     WebDriver driver = null;

//	@Given("Browser is open")
//	public void browser_is_open() {
//
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is:     " + projectPath);
//
//		System.setProperty("webdriver.chrome.driver",
//				projectPath + "/src/test/resources/drivers/chromedriver-win64/chromedriver.exe");
//
//		// System.setProperty("webdriver.chrome.driver","C:/Users/manoj
//		// kumar/Documents/selenium-workspace/Selenium_libraries/eclipse/Cucumberjava/src/test/resources/drivers/chromedriver-win64/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//
//		System.out.println("Inside step-browser is open");
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//
//		driver.get("https://www.google.com/");
//
//		System.out.println("Inside step-user is on google search page");
//
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws Exception {
//
//		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation Step by Step");
//
//		System.out.println("Inside step-user enters a text in search box");
//
//		Thread.sleep(2000);
//		
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws Exception {
//
//		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
//
//		System.out.println("Inside step-hits enter");
//		
//		Thread.sleep(2000);
//
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//
//		driver.getPageSource().contains("Online Courses");
//
//		System.out.println("Inside step-user is navigated to search results");
//
//		driver.close();
//	}

}

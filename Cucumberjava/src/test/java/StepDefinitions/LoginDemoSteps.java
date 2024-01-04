package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {

	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:     " + projectPath);

		System.setProperty("webdriver.chrome.driver",
				projectPath + "/src/test/resources/drivers/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		System.out.println("Inside step-browser is open");

	}

	@And("user is on login page")
	public void user_is_on_login_page() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) {

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@And("user clicks on login")
	public void user_clicks_on_login() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

		driver.getPageSource().contains("Dashboard");
		driver.close();

	}

}

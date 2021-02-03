package sTEpdefinaton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeMacysTest {
	public static WebDriver driver;

	@Given("^I open chrome browser$")
	public void i_open_chrome_browser() throws Throwable {

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Given("^I type macys website$")
	public void i_type_macys_website() throws Throwable {

		driver.get("https://www.macys.com");

	}

	@When("^I verify shop by department button$")
	public void i_verify_shop_by_department_button() throws Throwable {

		boolean isDisplayed = driver.findElement(By.id("shopByDepartmentLabelText")).isDisplayed();

		boolean isEnbled = driver.findElement(By.id("shopByDepartmentLabelText")).isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}

	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {

		driver.quit();

	}

}

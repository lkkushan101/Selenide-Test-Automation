package stepdefs;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;

import com.codeborne.selenide.WebDriverRunner;
public class StepDefs {
	
	@Given("^User goes to google$")
	public void user_goes_to_google() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedrv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverRunner.setWebDriver(driver);
		open("http://www.google.lk");
	   
	}

	@When("^User search 'Selenide'$")
	public void user_search_Selenide() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		$(By.id("lst-ib")).setValue("Selenide");
		 $(By.className("lsb")).click();
	}

	@Then("^User should get the 'Selenide site' in the results page$")
	public void user_should_get_the_Selenide_site_in_the_results_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	//   throw new PendingException();
		
		 $(By.linkText("Selenide: concise UI tests in Java")).click();
		 String titlePage = title();
		 Assert.assertEquals(titlePage, "Selenide: concise UI tests in Java", "Titles are matching");
		 close();
	}


}

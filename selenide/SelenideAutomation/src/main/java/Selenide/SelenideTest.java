package Selenide;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;

import com.codeborne.selenide.WebDriverRunner;
public class SelenideTest {
	
	

@Test
public void searchGoogle()
{
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedrv\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverRunner.setWebDriver(driver);
	 open("http://www.google.lk");
	 $(By.id("lst-ib")).setValue("Sri Lanka");
	 $(By.className("lsb")).click();
	 $(By.linkText("Sri Lanka - Wikipedia")).click();
	 String titlePage = title();
	 Assert.assertEquals(titlePage, "Sri Lanka - Wikipedia", "Titles are matching");
	 close();
	}
}

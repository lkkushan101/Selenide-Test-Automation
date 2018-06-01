package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	

	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {"pretty"},
			glue = {"stepdefs"},//Your step definitions package.
			features = {"C:/Users/kam/eclipse-workspace-2/Selenide_Cucumber/src/main/java/features/GoogleSearch.feature"})
	
	public class JUnitRunner {}

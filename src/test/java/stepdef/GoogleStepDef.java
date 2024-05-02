package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class GoogleStepDef {
	public WebDriver wd;
	public String act;
	@Given("Browser should open app should launch")
	public void browser_should_open_app_should_launch() {
	    wd=new EdgeDriver();
	   wd.get("https://www.google.com");
		
	}

	@When("User captures Title of google page")
	public void user_captures_title_of_google_page() {
	   act= wd.getTitle();
	}

	@Then("Expected and Actual Title should match")
	public void expected_and_actual_title_should_match() {
	   if(act.contains("Google")) {
		   System.out.println("Tc is pass");
	   }else {
		   System.out.println("tc is fail");
	   }
	}
}

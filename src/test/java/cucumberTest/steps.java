package cucumberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberPage.colorPage;
import junit.framework.Assert;
import util.BrowserFactory;

public class steps {

	WebDriver driver;
	colorPage ColorPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		ColorPage =PageFactory.initElements(driver, colorPage.class);
	}
	
	String blue = "set SkyBlue Background";
	String white = "Set White Background";
	
	@Given("^\"([^\"]*)\" button exists$")
	public void buttonExists(String colorButton) {
		if(blue.contains(colorButton)) {
		colorButton = ColorPage.blueBackgroundButtonExists();
		Assert.assertEquals(colorButton, "Set SkyBlue Background");
	}else if (white.contains(colorButton)) {
		colorButton= ColorPage.whiteBackgroundButtonExists();
	}else {
		System.out.println("Either or both button dont exist");
	}
	}	
	
	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		String expectedColor = "#efefef";
		String actualColor = ColorPage.validatingBlueBackgroundColor();
		Assert.assertEquals(expectedColor, actualColor);
		
		BrowserFactory.tearDown();
	}
	
	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
		String expectedColor = "#ffffff";
		String actualColor = ColorPage.validatingWhiteBackgroundColor();
		Assert.assertEquals(expectedColor, actualColor);
		
		BrowserFactory.tearDown();
	}
}

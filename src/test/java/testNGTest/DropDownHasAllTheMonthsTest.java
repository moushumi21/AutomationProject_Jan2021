package testNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testNGPage.DropDownHasAllTheMonthsPage;
import util.BrowserFactory;

public class DropDownHasAllTheMonthsTest {

	WebDriver driver;
	
	@Test
	public void monthDropDown() {
		driver = BrowserFactory.init();
		
		DropDownHasAllTheMonthsPage monthsDropDown = PageFactory.initElements(driver, DropDownHasAllTheMonthsPage.class);
		monthsDropDown.validateMonthDropDown();
	}
}

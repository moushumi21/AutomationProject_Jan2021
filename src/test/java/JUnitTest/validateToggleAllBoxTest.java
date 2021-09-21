package JUnitTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import jUnitPage.validateToggleAllBoxPage;
import util.BrowserFactory;

public class validateToggleAllBoxTest {

	WebDriver driver;
	
	@Test
	public void validateAllBoxIsCheckedWhenToggleAllBoxIsChecked() {
		
		driver = BrowserFactory.init();
		
		validateToggleAllBoxPage validateToggleAll = PageFactory.initElements(driver, validateToggleAllBoxPage.class);
		validateToggleAll.addToList("abc");
		validateToggleAll.toggleBoxIsClicked();
		validateToggleAll.allBoxIsSelected();
	}
	
}

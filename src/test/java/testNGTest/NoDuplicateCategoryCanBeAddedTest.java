package testNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testNGPage.NoDuplicateCategoryCanBeAddedPage;
import util.BrowserFactory;

public class NoDuplicateCategoryCanBeAddedTest {
	
	WebDriver driver;
	
	@Test
	public void duplicateCategoryNameCannotBeAdded() {
		
		driver = BrowserFactory.init();
		
		NoDuplicateCategoryCanBeAddedPage duplicateCategory = PageFactory.initElements(driver, NoDuplicateCategoryCanBeAddedPage.class);
		duplicateCategory.addingCategoryName("def");
		duplicateCategory.addingCategoryName("def");
		duplicateCategory.validateNoDuplicateCategoryIsAdded();
	}

}

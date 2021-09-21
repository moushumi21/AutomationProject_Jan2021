package testNGTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testNGPage.AddingNewCategoryPage;
import util.BrowserFactory;

public class AddingNewCategoryTest {
	
	WebDriver driver;
	
	@Test
	public void userAddsNewCategoryName() throws IOException {
		driver = BrowserFactory.init();
		
		AddingNewCategoryPage addNewCategory = PageFactory.initElements(driver, AddingNewCategoryPage.class);
		addNewCategory.userShouldBeAbleToAddCategory("abc");
		addNewCategory.validateCategoryName();
	}

}

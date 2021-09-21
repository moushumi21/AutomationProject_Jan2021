package testNGPage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basePage.BasePage;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AddingNewCategoryPage extends BasePage{

	WebDriver driver;
	String category;
	public AddingNewCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.CSS, using = "input[name = 'categorydata']") WebElement ADD_CATEGORY_FIELD;
	@FindBy (how = How.CSS, using = "input[value = 'Add category']") WebElement ADD_CATEGORY_BUTTON;
	@FindBy (how = How.CSS, using = "a[title = 'Remove this category']") List<WebElement> CATEGORY_LIST; 
	
	public void userShouldBeAbleToAddCategory(String value) {
		
		category = value + randomNumber(999);
		ADD_CATEGORY_FIELD.sendKeys(category);
		ADD_CATEGORY_BUTTON.click();
		}

	public void validateCategoryName() throws IOException {
		int categorySize = CATEGORY_LIST.size();
		WebElement catName = CATEGORY_LIST.get(categorySize-1);
		String expectedCategoryName = catName.getText();
		Assert.assertEquals(expectedCategoryName, category);
	}
}

	
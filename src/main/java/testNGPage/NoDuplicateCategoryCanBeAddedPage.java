package testNGPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class NoDuplicateCategoryCanBeAddedPage {

	WebDriver driver;
	String category;
	public NoDuplicateCategoryCanBeAddedPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy (how = How.CSS, using = "input[name = 'categorydata']") WebElement ADD_CATEGORY_FIELD;
	@FindBy (how = How.CSS, using = "input[value = 'Add category']") WebElement ADD_CATEGORY_BUTTON;
	
	public void addingCategoryName(String value) {
		category = value;
		ADD_CATEGORY_FIELD.sendKeys(category);
		ADD_CATEGORY_BUTTON.click();
	}
	
	public void validateNoDuplicateCategoryIsAdded() {
		
		String message = driver.findElement(By.cssSelector("body")).getText();
		boolean duplicateMessage = message.contains("The category you want to add already exists:");
		Assert.assertTrue("No duplicate category is added", duplicateMessage);
	}
}

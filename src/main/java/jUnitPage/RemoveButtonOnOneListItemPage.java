package jUnitPage;



import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basePage.BasePage;

public class RemoveButtonOnOneListItemPage extends BasePage {

	WebDriver driver;
	
	public RemoveButtonOnOneListItemPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS, using = "input[name = 'todo[1]']") WebElement ONE_ITEM;
	@FindBy(how = How.CSS, using = "input[value = 'Remove']") WebElement REMOVE_BUTTON;
	
	public void oneItemIsSelected() {
		ONE_ITEM.click();
		boolean oneItemSelected = ONE_ITEM.isSelected();
		Assert.assertTrue("The item is not selected", oneItemSelected);
	}
	
	public void removeButtonIsClicked() {
		REMOVE_BUTTON.click();
	}
	
	public void itemIsRemoved() throws IOException{
		boolean itemDoesNotExist;
		try {
			itemDoesNotExist = ONE_ITEM.isDisplayed();
		}catch(NoSuchElementException e){
			itemDoesNotExist = true;
		}
		Assert.assertTrue("The item still exists", itemDoesNotExist);
	}
}

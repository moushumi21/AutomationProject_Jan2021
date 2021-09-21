package jUnitPage;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllListPage {

	WebDriver driver;
	
	public RemoveAllListPage(WebDriver driver) {
		
		this.driver = driver;	
	}
	
	@FindBy (how = How.CSS, using = "input[name = 'allbox']") WebElement TOGGLE_ALL_BOX;
	@FindBy (how = How.CSS, using = "input[value = 'Remove']") WebElement REMOVE_BUTTON;
	@FindBy(how = How.CSS, using = "input[type= 'checkbox']") List<WebElement> ALL_BOXES;
	
	public void userRemovesAllList() {
		TOGGLE_ALL_BOX.click();
		REMOVE_BUTTON.click();
	}
	
	public void allItemsAreRemoved() throws IOException{
		
		boolean itemDoesNotExist;
		
		for (int i = 0; i< ALL_BOXES.size(); i++) {
			
			try {
				itemDoesNotExist= ALL_BOXES.get(i).isSelected();
			}catch (NoSuchElementException e) {
				itemDoesNotExist = false;
			}
			
			Assert.assertFalse("Not all boxes are deleted", itemDoesNotExist);
		}
		
	}
}

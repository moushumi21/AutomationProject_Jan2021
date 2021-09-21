package jUnitPage;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basePage.BasePage;

public class validateToggleAllBoxPage extends BasePage{

	WebDriver driver;
	
	public validateToggleAllBoxPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS, using= "input[type='text'][name='data']") WebElement ADD_LIST_FIELD;
	@FindBy(how = How.CSS, using = "input[type='submit'][value='Add']") WebElement ADD_BUTTON;
	@FindBy(how = How.CSS, using = "input[name = 'allbox']") WebElement TOGGLE_BOX;
	@FindBy(how = How.CSS, using = "input[type= 'checkbox']") List<WebElement> ALL_BOXES;
	
	public void addToList(String msg) {
		
		ADD_LIST_FIELD.sendKeys(msg + randomNumber(999));
		ADD_BUTTON.click();
		
		ADD_LIST_FIELD.sendKeys(msg + randomNumber(999));
		ADD_BUTTON.click();
		
		ADD_LIST_FIELD.sendKeys(msg + randomNumber(999));
		ADD_BUTTON.click();
	}
	
	public void toggleBoxIsClicked() {
				TOGGLE_BOX.click();
	}
	
	public void allBoxIsSelected() {
		boolean toggle_box = TOGGLE_BOX.isSelected();
		Assert.assertTrue("Toogle all box is not selected", toggle_box);
		
		for(int i = 0; i<ALL_BOXES.size(); i++) {
			boolean all_boxes = ALL_BOXES.get(i).isSelected();
			
			Assert.assertTrue("Not all boxes are selected", all_boxes);
		}
	}
}
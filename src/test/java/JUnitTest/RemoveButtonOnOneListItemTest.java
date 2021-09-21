package JUnitTest;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import jUnitPage.RemoveButtonOnOneListItemPage;
import util.BrowserFactory;

public class RemoveButtonOnOneListItemTest {

	WebDriver driver;
	
	@Test
	public void validateOneItemIsRemovedWhenRemoveButtonIsClicked() throws IOException {
		
		driver = BrowserFactory.init();
		
		RemoveButtonOnOneListItemPage oneListItemRemoved = PageFactory.initElements(driver, RemoveButtonOnOneListItemPage.class);
		oneListItemRemoved.oneItemIsSelected();
		oneListItemRemoved.removeButtonIsClicked();
		oneListItemRemoved.itemIsRemoved();
	}
	
}

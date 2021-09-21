package JUnitTest;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import jUnitPage.RemoveAllListPage;
import util.BrowserFactory;

public class RemoveAllListTest {

WebDriver driver;
	
	@Test
	public void validateAllItemsAreDeleted() throws IOException {
		
		driver = BrowserFactory.init();
		
		RemoveAllListPage allListItemRemoved = PageFactory.initElements(driver, RemoveAllListPage.class);
		allListItemRemoved.userRemovesAllList();
		allListItemRemoved.allItemsAreRemoved();
	}
	
}

package testNGPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class DropDownHasAllTheMonthsPage {

	WebDriver driver;
	
	public DropDownHasAllTheMonthsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.CSS, using = "select[name = 'due_month']") WebElement MONTH_DROP_DOWN;
	
	public void validateMonthDropDown() {
		
		Select select = new Select(MONTH_DROP_DOWN);
		List<String> actualMonthValue = new ArrayList<String>();
		
		for (WebElement element: select.getOptions()) {
			actualMonthValue.add(element.getText());
		}
		
		List expectdMonthValue = new ArrayList();
		expectdMonthValue.add("None");
		expectdMonthValue.add("Jan");
		expectdMonthValue.add("Feb");
		expectdMonthValue.add("Mar");
		expectdMonthValue.add("Apr");
		expectdMonthValue.add("May");
		expectdMonthValue.add("Jun");
		expectdMonthValue.add("Jul");
		expectdMonthValue.add("Aug");
		expectdMonthValue.add("Sep");
		expectdMonthValue.add("Oct");
		expectdMonthValue.add("Nov");
		expectdMonthValue.add("Dec");
		
		for(int i=0; i<actualMonthValue.size(); i++) {
			
			Assert.assertTrue(actualMonthValue.get(i).equals(expectdMonthValue.get(i)));
		}
		
	}
	
}

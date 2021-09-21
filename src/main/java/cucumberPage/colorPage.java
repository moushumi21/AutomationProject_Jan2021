package cucumberPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class colorPage {

	WebDriver driver;
	public colorPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.CSS, using = "button['myFunctionSky()']") WebElement SKY_BLUE_BUTTON;
	@FindBy(how = How.CSS, using = "button['myFunctionWhite()']") WebElement WHITE_BUTTON;
	
	public String blueBackgroundButtonExists() {
		String blue = SKY_BLUE_BUTTON.getText();
		return blue;
	}
	
	public String whiteBackgroundButtonExists() {
		String white = WHITE_BUTTON.getText();
		return white;
	}
	
	public void clickBlueButtion() {
		SKY_BLUE_BUTTON.click();
	}
	
	public void clickWhiteButton() {
		WHITE_BUTTON.click();
	}
	public String validatingBlueBackgroundColor() {
		String blueBackground = Color.fromString(SKY_BLUE_BUTTON.getCssValue("background-color")).asHex();
		return blueBackground;
	}
	public String validatingWhiteBackgroundColor() {
		String whiteBackground = Color.fromString(WHITE_BUTTON.getCssValue("background-color")).asHex();
		return whiteBackground;
	}
}



import java.util.Random;

public class BasePage {

	public int randomNumber(int bound) {
		
		Random rand = new Random();
		int randNumber = rand.nextInt(bound);
		return randNumber;
		
		
	}
	
}

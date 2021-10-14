package baseclass;

import org.openqa.selenium.By;

public class Child_class extends Base_class{
	
	public static void main(String[] args) {
		getbrowser("chrome");
		geturl("https://www.facebook.com/");
		sendkeys(driver.findElement(By.id("email")), "9790982423");
	}

}

package createUser;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browser.browserInitilizer;

public class createUser {

	@Test
	public static void launchBrowser() throws Exception {
		browserInitilizer.readDriverUtils();
		browserInitilizer.driver.findElement(By.xpath(""));
	}

}

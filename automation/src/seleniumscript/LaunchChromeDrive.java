package seleniumscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDrive {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "A:\\ChromeDrives\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		 * ChromeDriver driver = new ChromeDriver();
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

	}

}

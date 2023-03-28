package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\JarFile\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}

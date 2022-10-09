package testLocalWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocalWebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///E:/Year 03 Semester 02/CS 3212/Activity 2022-09-07/index.html");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	}

}

package testLocalWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocalWebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///E:/Year 03 Semester 02/CS 3212/Activity 2022-09-07/index.html");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		
		//data to a text field
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Joseph Vijay");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input")).sendKeys("1974-06-22");
		
		//radio button data insert
		driver.findElement(By.id("male")).click();
		
		//checkbox data insert
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[8]/td[2]/input[1]")).click();
		
		
		// drop down list data insert
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[9]/td[2]/select")).sendKeys("B.Tech");
		
		
		

	}

}

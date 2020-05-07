package mavenSelenium;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@DisplayName("Selenium Test Suite")
public class SeleniumTests {
	
	@Test
	@DisplayName("Test Google Search")
	void googleSearch() {
		System.setProperty("webdriver.chrome.driver", "/Users/mbp16/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Power Rangers");
		
		driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
		
		assertEquals("Power Rangers - Google Search", driver.getTitle());
		
		driver.close();
	}

}

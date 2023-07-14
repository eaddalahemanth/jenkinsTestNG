package jenkin1project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1Test {
	WebDriver driver;
	@Test
	public void f1() {
		driver.get("https://www.google.co.in/");
	}

	@BeforeTest
	public void f2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
}

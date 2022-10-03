package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {
	public static void main(String[] args) {
		//setup the path using web driver manager
		WebDriverManager.chromedriver().setup();
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Open the url
		driver.get("https://www.zoomcar.com/in/chennai");
		//Maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//i [@class='z-swap']")).click();
		driver.findElement(By.xpath("//div [@class='placeholder']")).click();
		WebElement e =	 driver.findElement(By.xpath("//button [@class='button-primary']"));
		boolean actualValue = e.isEnabled();
		if (actualValue)
			System.out.println("Button is enabled");
		else
			System.out.println("Button is disabled");
}
}
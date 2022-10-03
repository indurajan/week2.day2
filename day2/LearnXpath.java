package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username'])")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password'])")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@name='USERNAME']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()=\"Create Lead\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Create Lead\"]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("BNY Mellon");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Indira");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Priyadarshini");
		driver.findElement(By.xpath("//a[text()=\"Create Lead\"]")).click();
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		
}
}
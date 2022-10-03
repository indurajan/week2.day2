package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {
	public static void main(String[] args) {
		//setup the path using web driver manager
		WebDriverManager.chromedriver().setup();
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Open the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the window
		driver.manage().window().maximize();
		//Verify the title
		String title = driver.getTitle();
		System.out.println(title);
		//find the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//find the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	//click on submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crmfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on CreateLead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BNY Mellon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indira");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priyadarshini");

		//Handle Dropdown
		WebElement dropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd = new Select(dropdown);
		dd.selectByIndex(4);
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd1 = new Select(dropdown1);
		dd1.selectByValue("IND_RETAIL");
		
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByVisibleText("Arizona");
		
		
	}
}

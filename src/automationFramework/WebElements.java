package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "/Users/minghuang/Documents/selenium-2.48.2/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath); 
		WebDriver driver = new ChromeDriver(); //this is different from the FF
		
		//open http://toolsqa.com/automation-practice-form/
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		//find first name input
		WebElement firstname = driver.findElement(By.name("firstname"));
		//write my firstname in the text input using sendKeys method
		firstname.sendKeys("Ming");
		
		//find last name input
		WebElement lastname = driver.findElement(By.name("lastname"));
		//write my lastname in the text input using sendKeys method
		lastname.sendKeys("Huang");
		
		//find the submit button using findElement by id
		driver.findElement(By.id("submit")).click();
		
		
	}

}

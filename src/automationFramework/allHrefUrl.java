package automationFramework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class allHrefUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "/Users/minghuang/Documents/selenium-2.48.2/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath); 
		WebDriver driver = new ChromeDriver(); //this is different from the FF
		
		//get http://stage.oceia.sfgov.org.710elmp02.blackmesh.com/
		driver.get("http://191armyband.com/");
		
		List<WebElement> lLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links: " + lLinks.size());
		
		for(int i=0; i<lLinks.size(); i++){
			
			Point location = lLinks.get(i).getLocation();
			String displayText = lLinks.get(i).getText();
			boolean bVisible = lLinks.get(i).isDisplayed();
			
			String url = lLinks.get(i).getAttribute("href");
			
			
			//Display null urls
			System.out.println("Null URLs:");
			if(url == null){
				System.out.println(location+ ": " + url);
				System.out.println("Display: " + bVisible);
			}else{
				System.out.println("Good Urls: ");
				System.out.println(url);
			}
		}
	
		driver.quit();
	}
}
		

	



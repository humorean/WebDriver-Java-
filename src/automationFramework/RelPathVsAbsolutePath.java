package automationFramework;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.JavascriptExecutor;

public class RelPathVsAbsolutePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://sfgov.org/oceia");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link:links){
			String linkUrl = link.getAttribute("href");
			
			//if linkUrl begins with http:// then say it is absolute link
			if(linkUrl.contains("http://")){
				System.out.println("Absolute Path: "+linkUrl);
			}else{
				System.out.println("Relative Path: "+linkUrl);
			}
		}//end loop
		driver.quit();

	}

}

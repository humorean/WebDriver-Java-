package automationFramework;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.JavascriptExecutor;

public class getAllAltText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
driver.get("http://sfgov.org/");
		
		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		System.out.println(imgs.size());
		
		for(WebElement img:imgs){
			String alt = img.getAttribute("alt");
			String src = img.getAttribute("src");
			boolean bVisible = img.isDisplayed();

				System.out.println("Visible: "+ bVisible +" && alt: "+alt +" && Source: "+src);
				
				if(alt.equals("")&&bVisible){
					((JavascriptExecutor) driver).executeScript("arguments[0].style.border='solid red 8px'", img);
				}else{
					((JavascriptExecutor) driver).executeScript("arguments[0].style.border='solid green 8px'", img);
				}
			
		}//end loop
		Thread.sleep(60000);
		driver.quit();


	}

}

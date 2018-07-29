package Pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.move.TestRightMove.BaseTest;



public class BasePage {
	
	
	protected WebDriver d;
	 Properties OR=  BaseTest.OR;
	 

	 public BasePage(WebDriver d){
		 this.d=d;
	 }
	 
	 public void getUrl(String baseUrl){
		 d.get(baseUrl +"/");
	 }
	public WebElement getObject(String Xpath) throws IOException{
		try{
		  return  d.findElement(By.xpath(OR.getProperty(Xpath)));
		}catch(Exception e){
			e.getMessage();
			BaseTest.takeScreenshot(Xpath);
			
			return null;
		}
		
		
	}
	
	public List<WebElement> getObjects(String Xpath) throws IOException{
		try{
		  return  d.findElements(By.xpath(OR.getProperty(Xpath)));
		}catch(Exception e){
			e.getMessage();
			BaseTest.takeScreenshot(Xpath);
			
			return null;
		}
		
		
	}
	/* Creating WebObject Using cssSelector */
	public WebElement getObjectFromSelector(String Selector) throws IOException {
		try {
			return d.findElement(By.cssSelector(OR.getProperty(Selector)));

		} catch (Throwable t) {
			// report error
			BaseTest.takeScreenshot(Selector);

			return null;
		}

	}
	

}

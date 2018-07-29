package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	public HomePage(WebDriver d) {
		super(d);
		
	}
	public void sendSearch(String search) throws IOException{
		getObject("searchInputbox").sendKeys(search);
	}
	
	public void clickFirstPredictiveLink() throws IOException{
	List<WebElement> predictiveLink=getObjects("predictiveSuggestionLinks");
	WebElement firstLink=predictiveLink.get(0);
	firstLink.click();
	
		
	}
	
	
	
	public void clickSaleSearchButton() throws IOException{
	getObject("saleSearchButton").click();
		
	}
}

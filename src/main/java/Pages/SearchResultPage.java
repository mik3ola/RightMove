package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{

	public SearchResultPage(WebDriver d) {
		super(d);
		
	}

	public boolean isSearchResultPageDisplayed() throws IOException{
		return getObject("searchTitle").isDisplayed();
		
	}
	
}

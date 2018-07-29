package Pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchLocationPage extends BasePage {

	public SearchLocationPage(WebDriver d) {
		super(d);
		
	}
	
	
	public void goToSearchLocationPage(String baseUrl){
		d.get(baseUrl + "/property-for-sale/search.html?searchLocation=London&locationIdentifier=REGION%5E87490&useLocationIdentifier=true&buy=For+sale");
		
	}
	public void selectSearchRadious(String mile) throws IOException{
		List <WebElement> selectRadiusMile=getObjects("selectRadiusMile");
		WebElement Mile=selectRadiusMile.get(5);
		Mile.click();
	}
		
		public void selectMinimumPrice(String minPrice) throws IOException{
			List <WebElement> selectMinP=getObjects("selectMinPrice");
			WebElement MinPrice=selectMinP.get(18);
			MinPrice.click();
		
	}
	
		public void selectMaximumPrice(String minPrice) throws IOException{
			List <WebElement> selectMaxP=getObjects("selectMaxPrice");
			WebElement MaxPrice=selectMaxP.get(23);
			MaxPrice.click();
		
	}
		
		public void selectProprtyType(String type) throws IOException{
			List <WebElement> selectType=getObjects("selectPropertyType");
			WebElement Type=selectType.get(1);
			Type.click();
		
	}
		
		public void clickFindPropertiesButton() throws IOException{
			getObject("findPropertiesButton").click();
		}
	public void isMySearchLocationTitlePresent() throws IOException{
	String titlePage=getObject("searchLocationTitle").getText();
	 Assert.assertTrue(titlePage.contains("London"));
	
	}

}

package com.move.TestRightMove;

import java.io.IOException;




import org.junit.Assert;

import Pages.BasePage;
import Pages.HomePage;
import Pages.SearchLocationPage;
import Pages.SearchResultPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseTest{
	private BasePage basePage;
	private HomePage homePage;
	private SearchLocationPage searchLP;
	private SearchResultPage searchRP;
	
	
	public StepDef(){
		super();
	basePage = new BasePage(BaseTest.d);
	homePage= new HomePage(BaseTest.d);
	searchLP=new SearchLocationPage(BaseTest.d);
	searchRP=new SearchResultPage(BaseTest.d);
	}
	
	
	
	@Given("^I am on RightMove Home Page on \"([^\"]*)\"$")
	public void i_am_on_RightMove_Home_Page_on(String browser) {
		basePage.getUrl(CONFIG.getProperty("siteName"));
	}
	@Given("^I am on search location page on \"([^\"]*)\"$")
	public void i_am_on_search_location_page_on(String baseUrl)  {
		searchLP.goToSearchLocationPage(CONFIG.getProperty("siteName"));
	}
	@When("^I enter my search as \"([^\"]*)\"$")
	public void i_enter_my_search_as(String search) throws IOException  {
		homePage.sendSearch(search);
	    
	}

	@When("^I click on the first link of the Predictive Search$")
	public void i_click_on_the_first_link_of_the_Predictive_Search() throws IOException  {
		homePage.clickFirstPredictiveLink();
	   
	}

	
	@When("^I click on for sale button$")
	public void i_click_on_for_sale_button() throws IOException  {
		homePage.clickSaleSearchButton();
	    
	}
	
	
	
	@When("^I select my search radious as \"([^\"]*)\"$")
	public void i_select_my_search_radious_as(String mile) throws Throwable {
		searchLP.selectSearchRadious(mile);
	  
	}

	@When("^I select minium price range as \"([^\"]*)\"$")
	public void i_select_minium_price_range_as(String minPrice) throws Throwable {
		searchLP.selectMinimumPrice(minPrice);
	   
	}

	@When("^I select maximum price range as \"([^\"]*)\"$")
	public void i_select_maximum_price_range_as(String maxPrice) throws Throwable {
		searchLP.selectMaximumPrice(maxPrice);
	   
	}

	@When("^I select Propery type as \"([^\"]*)\"$")
	public void i_select_Propery_type_as(String type) throws Throwable {
		searchLP.selectProprtyType(type);
	   
	}
	@When("^I click on find Properties button$")
	public void i_click_on_find_Properties_button() throws IOException  {
		searchLP.clickFindPropertiesButton();
	   
	}

	@Then("^I should be Presented with a Property for sale London page$")
	public void i_should_be_Presented_with_a_Property_for_sale_London_page() throws IOException {
	   searchLP.isMySearchLocationTitlePresent();
	}
	
	@Then("^I should be Presented with SearcH$")
	public void i_should_be_Presented_with_SearcH() throws Throwable {
	 Assert.assertTrue(searchRP.isSearchResultPageDisplayed());
	}


	@After()
	public void closeBrowser(){
		d.quit();
	}

}

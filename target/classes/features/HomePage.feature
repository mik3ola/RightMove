Feature: Search Functionality
         User should be a to search for any product
         by using the search feature
         


@Search      
 Scenario: Searching for Selenium book
 Given I am on RightMove Home Page on "browser"
 When  I enter my search as "Lo"
  And I click on the first link of the Predictive Search
  And  I click on for sale button
 Then I should be Presented with a Property for sale London page
Feature: find Functionality
         User should be a to find for property
         by using the search feature
         
         
         
         
         
         
 @SearchProperty      
 Scenario: Searching for a property of a price between 150 to 700k
 Given I am on search location page on "browser"
 When I select my search radious as "5miles"
  And I select minium price range as "200,000"
  And I select maximum price range as "700,000"
  And I select Propery type as "Houses"
  And I click on find Properties button
Then I should be Presented with SearcH 
         

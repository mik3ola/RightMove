$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/features/FindProperty.feature");
formatter.feature({
  "line": 1,
  "name": "find Functionality",
  "description": "       User should be a to find for property\r\n       by using the search feature",
  "id": "find-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Searching for a property of a price between 150 to 700k",
  "description": "",
  "id": "find-functionality;searching-for-a-property-of-a-price-between-150-to-700k",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@SearchProperty"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on search location page on \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I select my search radious as \"5miles\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I select minium price range as \"200,000\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select maximum price range as \"700,000\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select Propery type as \"Houses\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on find Properties button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be Presented with SearcH",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 33
    }
  ],
  "location": "StepDef.i_am_on_search_location_page_on(String)"
});
formatter.result({
  "duration": 7248742770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5miles",
      "offset": 31
    }
  ],
  "location": "StepDef.i_select_my_search_radious_as(String)"
});
formatter.result({
  "duration": 103270069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200,000",
      "offset": 32
    }
  ],
  "location": "StepDef.i_select_minium_price_range_as(String)"
});
formatter.result({
  "duration": 78690807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "700,000",
      "offset": 33
    }
  ],
  "location": "StepDef.i_select_maximum_price_range_as(String)"
});
formatter.result({
  "duration": 65912972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Houses",
      "offset": 26
    }
  ],
  "location": "StepDef.i_select_Propery_type_as(String)"
});
formatter.result({
  "duration": 69918711,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_on_find_Properties_button()"
});
formatter.result({
  "duration": 3191942817,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_be_Presented_with_SearcH()"
});
formatter.result({
  "duration": 156209103,
  "status": "passed"
});
formatter.after({
  "duration": 860073551,
  "status": "passed"
});
formatter.uri("main/resources/features/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Search Functionality",
  "description": "       User should be a to search for any product\r\n       by using the search feature",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Searching for Selenium book",
  "description": "",
  "id": "search-functionality;searching-for-selenium-book",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on RightMove Home Page on \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I enter my search as \"Lo\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on the first link of the Predictive Search",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on for sale button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should be Presented with a Property for sale London page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 32
    }
  ],
  "location": "StepDef.i_am_on_RightMove_Home_Page_on(String)"
});
formatter.result({
  "duration": 6027155670,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lo",
      "offset": 22
    }
  ],
  "location": "StepDef.i_enter_my_search_as(String)"
});
formatter.result({
  "duration": 288966327,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_on_the_first_link_of_the_Predictive_Search()"
});
formatter.result({
  "duration": 231765554,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_on_for_sale_button()"
});
formatter.result({
  "duration": 1271842649,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_be_Presented_with_a_Property_for_sale_London_page()"
});
formatter.result({
  "duration": 69332456,
  "status": "passed"
});
formatter.after({
  "duration": 796678731,
  "status": "passed"
});
});
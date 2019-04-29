$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/Search.feature");
formatter.feature({
  "name": "Typed words in text box it should suggest words that matches typed keyword. When user start",
  "description": "  typing word in text box it should suggest words that matches typed keyword",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "gets to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefs.gets_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user searches \"san\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDefs.user_searches_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "suggestions dropdown items should contain \"san\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefs.suggestions_dropdown_items_should_contain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects option 3 from the list",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefs.user_selects_option_from_the_list(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on reward programs",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefs.clicks_on_reward_programs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees list of \"Popular\" programs",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefs.user_sees_list_of_programs(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:96)\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\n\tat org.testng.Assert.assertTrue(Assert.java:44)\n\tat org.testng.Assert.assertTrue(Assert.java:54)\n\tat step_definitions.SearchStepDefs.user_sees_list_of_programs(SearchStepDefs.java:99)\n\tat ✽.user sees list of \"Popular\" programs(./src/test/resources/features/Search.feature:17)\n",
  "status": "failed"
});
formatter.step({
  "name": "user verifies the list is sorted",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefs.user_verifies_the_list_is_sorted()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user sees list of \"All\" programs",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefs.user_sees_list_of_programs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies the list is sorted",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefs.user_verifies_the_list_is_sorted()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "list of \"Popular\" programs contains \"Amazon.com Gift Card\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefs.list_of_programs_contains(String,String)"
});
formatter.result({
  "status": "skipped"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Luma_Signup.feature");
formatter.feature({
  "line": 1,
  "name": "LUMA Application Signup Flow",
  "description": "",
  "id": "luma-application-signup-flow",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Create An Account and Sign In With Valid Credentials",
  "description": "",
  "id": "luma-application-signup-flow;create-an-account-and-sign-in-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I navigate To The LUMA Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click On The Create An Account button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I fill in First Name as \u003c\"carl\"\u003e , Last Name as \u003c\"stark\"\u003e , Email as \u003c\"carlstark@gmail.com\"\u003e,  Password as \u003c\"securepwd\"\u003e, Confirm Password as \u003c\"securepwd\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I clicked Create An Account button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should Redirected To The SignIn Page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter Username as \u003c\"carlstark@gmail.com\"\u003e and Password as \u003c\"securepwd\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click The Loginbutton",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.i_navigate_To_The_LUMA_Home_Page()"
});
formatter.result({
  "duration": 6886861500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_click_On_The_Create_An_Account_button()"
});
formatter.result({
  "duration": 2415818100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "carl",
      "offset": 26
    },
    {
      "val": "stark",
      "offset": 50
    },
    {
      "val": "carlstark@gmail.com",
      "offset": 71
    },
    {
      "val": "securepwd",
      "offset": 109
    },
    {
      "val": "securepwd",
      "offset": 144
    }
  ],
  "location": "Step_Definition.i_fill_in_First_Name_as_Last_Name_as_Email_as_Password_as_Confirm_Password_as(String,String,String,String,String)"
});
formatter.result({
  "duration": 1621565500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_clicked_Create_An_Account_button()"
});
formatter.result({
  "duration": 238993200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_should_Redirected_To_The_SignIn_Page()"
});
formatter.result({
  "duration": 1902808200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "carlstark@gmail.com",
      "offset": 22
    },
    {
      "val": "securepwd",
      "offset": 62
    }
  ],
  "location": "Step_Definition.i_enter_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 617641200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.i_click_The_Loginbutton()"
});
formatter.result({
  "duration": 2429884500,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Java_Workspace/CucumberTutorial/Login/LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "User login",
  "description": "user should be login with valid credential",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should login with valid  credentials",
  "description": "",
  "id": "user-login;user-should-login-with-valid--credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter user name as \"\u003cuname\u003e\" and password \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I submit login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I redirect to the home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "user-login;user-should-login-with-valid--credentials;",
  "rows": [
    {
      "cells": [
        "uname",
        "pass"
      ],
      "line": 11,
      "id": "user-login;user-should-login-with-valid--credentials;;1"
    },
    {
      "cells": [
        "traymans_u2@mailinator.com",
        "Traymans_u21-trs"
      ],
      "line": 12,
      "id": "user-login;user-should-login-with-valid--credentials;;2"
    },
    {
      "cells": [
        "traymans_u2@mailinator.com",
        "traymans_u21-trs"
      ],
      "line": 13,
      "id": "user-login;user-should-login-with-valid--credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 130291,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should login with valid  credentials",
  "description": "",
  "id": "user-login;user-should-login-with-valid--credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter user name as \"traymans_u2@mailinator.com\" and password \"Traymans_u21-trs\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I submit login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I redirect to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_open_login_page()"
});
formatter.result({
  "duration": 208123736,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "traymans_u2@mailinator.com",
      "offset": 22
    },
    {
      "val": "Traymans_u21-trs",
      "offset": 64
    }
  ],
  "location": "StepDefination.i_enter_user_name_as_and_password(String,String)"
});
formatter.result({
  "duration": 2796845,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_submit_login_page()"
});
formatter.result({
  "duration": 195294,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_redirect_to_the_home_page()"
});
formatter.result({
  "duration": 86101,
  "status": "passed"
});
formatter.after({
  "duration": 54455,
  "status": "passed"
});
formatter.before({
  "duration": 66999,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should login with valid  credentials",
  "description": "",
  "id": "user-login;user-should-login-with-valid--credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter user name as \"traymans_u2@mailinator.com\" and password \"traymans_u21-trs\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I submit login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I redirect to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_open_login_page()"
});
formatter.result({
  "duration": 85245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "traymans_u2@mailinator.com",
      "offset": 22
    },
    {
      "val": "traymans_u21-trs",
      "offset": 64
    }
  ],
  "location": "StepDefination.i_enter_user_name_as_and_password(String,String)"
});
formatter.result({
  "duration": 204988,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_submit_login_page()"
});
formatter.result({
  "duration": 53314,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_redirect_to_the_home_page()"
});
formatter.result({
  "duration": 55595,
  "status": "passed"
});
formatter.after({
  "duration": 222664,
  "status": "passed"
});
formatter.before({
  "duration": 191018,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should login with invalid  credentials",
  "description": "",
  "id": "user-login;user-should-login-with-invalid--credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I enter invalid user name as \"test\" and password \"test\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I submit details of  login page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I redirect to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_am_on_login_page()"
});
formatter.result({
  "duration": 102637,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 30
    },
    {
      "val": "test",
      "offset": 50
    }
  ],
  "location": "StepDefination.i_enter_invalid_user_name_as_and_password(String,String)"
});
formatter.result({
  "duration": 311331,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_submit_details_of_login_page()"
});
formatter.result({
  "duration": 208694,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_redirect_to_login_page()"
});
formatter.result({
  "duration": 193013,
  "status": "passed"
});
formatter.after({
  "duration": 178188,
  "status": "passed"
});
});
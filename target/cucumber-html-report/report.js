$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SmokeMacys.feature");
formatter.feature({
  "line": 1,
  "name": "Test smoke macys",
  "description": "",
  "id": "test-smoke-macys",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test smoke scenario",
  "description": "",
  "id": "test-smoke-macys;test-smoke-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type macys website",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify shop by department button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
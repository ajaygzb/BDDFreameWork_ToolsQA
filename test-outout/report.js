$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataDrivenJson.feature");
formatter.feature({
  "line": 2,
  "name": "Automated End2End Tests",
  "description": "Description: The purpose of this feature is to test End 2 End integration.",
  "id": "automated-end2end-tests",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@E2E2"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter \"\u003ccustomer\u003e\" personal details on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "place the order",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "verify the order details",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 16,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;1"
    },
    {
      "cells": [
        "Lakshay"
      ],
      "line": 17,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3457178522,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@E2E2"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter \"Lakshay\" personal details on checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "place the order",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "verify the order details",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 31001265778,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 15
    }
  ],
  "location": "HomePageSteps.he_search_for(String)"
});
formatter.result({
  "duration": 11727454400,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.choose_to_buy_the_first_item()"
});
formatter.result({
  "duration": 62223927471,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.moves_to_checkout_from_mini_cart()"
});

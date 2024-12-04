# Overview

Project to study Rest Assured framework with java for API testing, creating test cases and scenarios, 
implementing the test suite. This project use ServeRest, a free API which simulate an online store, 
made with purpose to study API testing

## Postman collection
Before implementing in rest assured, the tests are done in postman, to validate the scenarios
and the inputs. The collection can be found in [...] (when I push the collection into the
project, this will be updated)

## Package Structure

The package so far is divided by the main features (login, user, products, cart), with the 
following internal structure

```
-src
|- main/java
|- |- utils         -> Classes to support the project, ie URLs, etc
|- |- login|user|products|cart
|- |- |- api        -> High level methods to manipulate data for testing
|- |- |- services   -> Accessing endpoints using RestAssured
|- test/java
|- |- login|user|products|cart
|- |- |- [...]      -> The scenarios execution
```

## So far

The tests implemented so far are the login successfully, done to validate the structure 
mentioned above.

## Future work
* Push postman collection with the test scenarios reflected in this project
* Finish products and cart test cases in postman
* Create the service and api structure for user, products, cart
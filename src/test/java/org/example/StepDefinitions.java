package org.example;

import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }
}

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    // First test
    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);//many type
        //assertNotEquals(expectedAnswer, actualAnswer); //change this to get failures
    }

    //how to write data tables in Cucumber ?
    //cucumber hook -fx before and after, before all, after all.
    //tags..applied on hook <<tags and hook>>
    //beforeAll - from io cucumber, not junit
    //before,after - tags
    //junit platform properties - glue, filter tags

    // Second test
    @Given("today is Wednesday")
    public void today_is_Wednesday() {
        today = "Wednesday";
    }

    @When("I inquire if it's Friday yet")
    public void i_inquire_if_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be informed {string}")
    public void i_should_be_informed(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("I am on the shopping page")
    public void i_am_on_the_shopping_page() {
        // code to navigate to the shopping page here
    }

    //write data tables in Cucumber
    @When("I add the following items to the cart:")
    public void i_add_items_to_the_cart(List<Map<String, String>> dataTable) {
        for (Map<String, String> row : dataTable) {
            String item = row.get("Item");
            String quantity = row.get("Quantity");

            // Simulate adding 'quantity' of 'item' to the cart
            // You would perform the actual actions here, such as interacting with the UI or API
            // For demonstration purposes, let's print a message to simulate the action
            System.out.println("Adding " + quantity + " " + item + " to the cart");
        }
    }


    @Then("the cart should contain {int} items")
    public void the_cart_should_contain_items(Integer itemCount) {
        // Implement code to verify the cart items count here
    }





}






//undefined got error
//    @Given("today is Sunday")
//    public void today_is_sunday() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("I ask whether it's Friday yet")
//    public void i_ask_whether_it_s_friday_yet() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should be told {string}")
//    public void i_should_be_told(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//}


//    @Given("an example scenario")
//    public void anExampleScenario() {
//    }
//
//    @When("all step definitions are implemented")
//    public void allStepDefinitionsAreImplemented() {
//    }
//
//    @Then("the scenario passes")
//    public void theScenarioPasses() {
//    }







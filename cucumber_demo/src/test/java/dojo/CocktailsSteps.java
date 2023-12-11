package dojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CocktailsSteps {

    private Order order;
    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String owner) {
        // Write code here that turns the phrase above into concrete actions
        order = new Order();
        order.declareOwner(owner);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_Juliette(String target) {
        // Write code here that turns the phrase above into concrete actions
        order.declareTarget(target);
    }

    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order() {
        // Write code here that turns the phrase above into concrete actions
        List<String> cocktails = order.getCocktails();
        assertEquals(0,cocktails.size());
    }
}

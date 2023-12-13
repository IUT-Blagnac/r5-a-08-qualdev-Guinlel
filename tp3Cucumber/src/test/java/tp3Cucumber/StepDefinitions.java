package tp3Cucumber;

import io.cucumber.java.en.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    Apartment apart;
    @Given("I look for my keys and i can't find my keys")
    public void i_look_for_my_keys_and_i_can_t_find_my_keys() {
        // Write code here that turns the phrase above into concrete actions
        apart = new Apartment();
        apart.hasKeys = false;

    }
    @When("i look everywhere in my apartment in found them in my pocket")
    public void i_look_everywhere_in_my_apartment_in_found_them_in_my_pocket() {
        // Write code here that turns the phrase above into concrete actions
        apart.lookForKey("Pocket");
    }
    @Then("I have my keys and i can leave")
    public void i_have_my_keys_and_i_can_leave() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(apart.hasKeys, true);
        apart.leave();
    }

}

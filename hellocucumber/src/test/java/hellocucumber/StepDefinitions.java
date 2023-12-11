package hellocucumber;

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

    String today;
    String dateAsked;
    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        this.dateAsked = IsItFriday.isItFriday(this.today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(this.dateAsked,string);
    }

}
class IsItFriday {
    static String isItFriday(String today){
        return "Friday".equals(today)?"TGIF":"Nope";
    }




}

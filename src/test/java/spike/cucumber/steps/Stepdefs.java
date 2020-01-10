package spike.cucumber.steps;

import io.cucumber.java.*;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.*;

public class Stepdefs{

    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    public Stepdefs(){
        System.out.println("This is in Stepdefs cons" + this);
    }

    @Given("today is Sunday")
    public void today_is_Sunday() {
        scenario.write("Thread ID - %2d - from Stepdefs feature file." + Thread.currentThread().getId());
        scenario.write("today_is_Sunday");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        scenario.write("Thread ID - %2d - from Stepdefs feature file." + Thread.currentThread().getId());
        scenario.write("i_ask_whether_it_s_Friday_yet");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        scenario.write("Thread ID - %2d - from Stepdefs feature file." + Thread.currentThread().getId());
        scenario.write("i_should_be_told");
    }

    @Given("today is Monday")
    public void today_is_Monday() {
        scenario.write("Thread ID - %2d - from Stepdefs2 feature file." + Thread.currentThread().getId());
        scenario.write("today_is_Monday");
    }


}

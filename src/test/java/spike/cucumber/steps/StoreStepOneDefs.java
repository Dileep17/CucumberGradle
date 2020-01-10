package spike.cucumber.steps;

import io.cucumber.java.*;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.*;
import spike.cucumber.driver.TestContext;


public class StoreStepOneDefs {

    private TestContext context;
    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    public StoreStepOneDefs(TestContext context){
        this.context = context;
        System.out.println("In StoreStepDefs const. inject TestContext = " + context + ". In thread = " + Thread.currentThread().getId());
    }

    @Given("^I store (.*?)$")
    public void iStoreValue(int i){
        context.setI(i);
        scenario.write("In iStoreValue. inject TestContext = " + context + ". In thread = " + Thread.currentThread().getId());
    }

    @When("^I wait for some (.*?) milliseconds$")
    public void iWaitForSomeTime(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
        scenario.write("In iWaitForSomeTime. inject TestContext = " + context + ". In thread = " + Thread.currentThread().getId());
    }

}

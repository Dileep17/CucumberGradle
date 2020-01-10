package spike.cucumber.steps;

import io.cucumber.java.*;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import spike.cucumber.driver.TestContext;

public class StoreStepTwoDefs{

    private TestContext context;
    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    public StoreStepTwoDefs(TestContext context){
        this.context = context;
        System.out.println("In StoreStepDefs const. inject TestContext = " + context + ". In thread = " + Thread.currentThread().getId());
    }

    @Then("^value stored should still be (.*?)$")
    public void storedValueShouldBePresent(int expectedValue){
        scenario.write("In storedValueShouldBePresent. inject TestContext = " + context + ". In thread = " + Thread.currentThread().getId());
        Assert.assertEquals(expectedValue, context.getI());
    }
}

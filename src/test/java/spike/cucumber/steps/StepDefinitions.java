package spike.cucumber.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinitions {

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        System.out.println("got " + cukes);
        Assert.assertTrue(true);
    }
}

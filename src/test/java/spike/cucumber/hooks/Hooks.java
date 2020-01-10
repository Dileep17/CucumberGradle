package spike.cucumber.hooks;

import io.cucumber.java.*;
import io.cucumber.core.api.Scenario;

import spike.cucumber.driver.Driver;

public class Hooks {

    Driver driver;

    public Hooks(Driver driver){
        this.driver = driver;
    }

    @Before
    public void setup(Scenario scenario){
        scenario.write("This is in Hooks for scenario " + scenario + ". Before" + this.driver);
    }

    @After
    public void tearDown(Scenario scenario){
        scenario.write("This is in Hooks for scenario " + scenario + ". After" + this.driver);
        driver.quitWebDriver();
    }
}





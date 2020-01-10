package spike.cucumber.steps;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import spike.cucumber.driver.Driver;
import spike.cucumber.pages.LandingPage;

public class LandingPageStepDefinitions {

    Driver driver;
    LandingPage landingPage;
    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    public LandingPageStepDefinitions(Driver driver){
        this.driver = driver;
        this.landingPage = new LandingPage(this.driver);
    }

    @Given("I opened automationpractice.com")
    public void open_website(){
        scenario.write("in open_website. driver = " + driver +". ThreadId" + Thread.currentThread().getId());
        this.landingPage.openAutomationPracticeWebSite();
    }

    @When("^I searched for (.*?)$")
    public void search_phrase(String phrase){
        scenario.write("in search_phrase. driver = " + driver + ". ThreadId" + Thread.currentThread().getId());
        this.landingPage.search(phrase);
    }

    @When("^I clicked on (.*?)$")
    public void  click_on(String link){
        scenario.write("in click_on. driver = " + driver +". ThreadId" + Thread.currentThread().getId());
        this.landingPage.clickLink(link);
    }
}

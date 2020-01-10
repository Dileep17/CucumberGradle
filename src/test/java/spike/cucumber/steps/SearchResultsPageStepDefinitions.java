package spike.cucumber.steps;


import io.cucumber.java.*;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.*;
import spike.cucumber.driver.Driver;
import spike.cucumber.pages.SearchResultsPage;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class SearchResultsPageStepDefinitions{
    SearchResultsPage searchResultsPage;
    Driver driver;
    Scenario scenario;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    public SearchResultsPageStepDefinitions(Driver driver){
        this.driver = driver;
        this.searchResultsPage = new SearchResultsPage(this.driver);
//        scenario.write("This is in SearchResultsPageStepDefinitions cons" + this.driver);
    }

    @Then("I should see below products in search results")
    public void verifySearchResults(List<String> expectedSearchResults){
        List<String> actualSearchResults = this.searchResultsPage.getProducts();
        actualSearchResults = actualSearchResults.stream().filter(product -> !product.isEmpty()).collect(Collectors.toList());
        scenario.write("printing the values read from UI:" + actualSearchResults.toString());
        scenario.write("printing the values expected    :" + expectedSearchResults.toString());
        assertTrue(actualSearchResults.containsAll(expectedSearchResults));
    }
}

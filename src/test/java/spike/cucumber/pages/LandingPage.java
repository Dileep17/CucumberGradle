package spike.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spike.cucumber.driver.Driver;

public class LandingPage {

    Driver driver;

    @FindBy(id = "search_query_top")
    WebElement searchTextField;

    @FindBy(name = "submit_search")
    WebElement searchButton;

    public LandingPage(Driver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver.getWebDriver(), this);
    }

    public void openAutomationPracticeWebSite(){
        driver.getWebDriver().get("http://automationpractice.com");
    }

    public void search(String searchPhrase) {
        searchTextField.sendKeys(searchPhrase);
        searchButton.click();
    }

    public void clickLink(String link) {
        this.driver.getWebDriver().findElement(By.linkText(link)).click();
    }
}

package spike.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spike.cucumber.driver.Driver;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {

    Driver driver;

    @FindBy(css = ".product_list .product-name")
    List<WebElement> searchResults;

    public SearchResultsPage(Driver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver.getWebDriver(), this);
    }

    public List<String> getProducts(){
//        List<WebElement> searchResults = driver.getWebDriver().findElements(By.cssSelector(".product_list .product-name"));
        List<String> productNames = new ArrayList<>();
        for (WebElement ele: searchResults){
            productNames.add(ele.getText());
        }
        return productNames;
    }
}

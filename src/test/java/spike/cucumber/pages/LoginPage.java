package spike.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spike.cucumber.driver.Driver;

public class LoginPage {

    Driver driver;

    @FindBy(id = "login_form")
    WebElement LoginSection;

    public LoginPage(Driver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver.getWebDriver(), this);
    }

    public boolean isLoginSectionDisplayed(){
        return LoginSection.isDisplayed();
    }


}

package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.Assert;
import resources.Base;
import pageTests.HomeTest;
import pageTests.LoginTest;

@RunWith(Cucumber.class)
public class Steps extends Base {
    HomeTest home = new HomeTest();
    LoginTest login = new LoginTest();

    @Given("^Initialize the browser$")
    public void initialize_the_browser() throws Throwable {
        home.initialize();
    }

    @And("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something(String site) throws Throwable {
        home.homepageToLogin(site);
        login.initializePage();
        login.closeCookie();
    }

    @When("^User Enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_Email_and_password_and_logs_in(String email, String password) throws Throwable {
        login.loginWith(email,password);
    }

    @Then("^Logged in is \"([^\"]*)\"$")
    public void logged_in_is(String validation) throws Throwable {
        String loginValidation = Boolean.toString(login.validateLogin());
        Assert.assertEquals(validation,loginValidation);
    }

}

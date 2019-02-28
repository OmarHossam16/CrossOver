package stepDefinitions;

        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.And;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;
        import pageTests.HomeTest;
        import pageTests.JobSearchTest;
        import pageTests.QATest;
        import resources.Base;

        import static pageTests.HomeTest.homePage;
        import static pageTests.JobSearchTest.jobsPage;
        import static pageTests.QATest.qaPage;


@RunWith(Cucumber.class)
public class ApplyForTheJob extends Base {
    HomeTest home = new HomeTest();
    JobSearchTest jobs = new JobSearchTest();
    QATest qa = new QATest();
    @Given("^Initialize the browser$")
    public void initialize_the_browser() throws Throwable {
        home.initialize();
    }

    @And("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something(String website) throws Throwable {
        driver.get(website);
    }

    @And("^Click See Available Jobs Button$")
    public void click_see_available_jobs_button() throws Throwable {
        homePage.getSeeAvailableJobs().click();
    }

    @And("^Choose Category \"([^\"]*)\" from The Category Dropdown$")
    public void choose_category_something_from_the_category_dropdown(String category) throws Throwable {
        jobs.initialize();
        jobs.closeCookie();
        jobsPage.getCategoriesDropdown().click();
        jobsPage.getCategory(category).click();
    }

    @And("^Search for \"([^\"]*)\" in the search box$")
    public void search_for_something_in_the_search_box(String search) throws Throwable {
        jobsPage.getSearchBox().sendKeys(search);
    }

    @And("^Click on Search Jobs Button$")
    public void click_on_something_button() throws Throwable {
        jobsPage.getSubmitButton().click();
    }

    @And("^Choose \"([^\"]*)\"$")
    public void choose_something(String job) throws Throwable {
        jobsPage.getJobItem(job).click();
    }
    @Then("Click On Apply Now Button$")
    public void click_on_apply_now_button() throws Throwable {
        qa.initialize();
        qaPage.getApplyNow().click();
    }
    @And("^Enter First Name \"([^\"]*)\" and Last Name \"([^\"]*)\" and Email \"([^\"]*)\" and LinkedIn \"([^\"]*)\" and Phone Number \"([^\"]*)\"$")
    public void enter_apply_data(String fname, String lname, String email, String linkedIn, String phone) throws Throwable {
        qaPage.getFirstName().sendKeys(fname);
        qaPage.getLastName().sendKeys(lname);
        qaPage.getEmail().sendKeys(email);
        qaPage.getLinkedIn().sendKeys(linkedIn);
        qaPage.getPhone().sendKeys(phone);
    }

    @And("^Choose Country \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void choose_data(String country, String automationExp, String programmingExp, String automationTools, String english, String performanceExp, String hiringEvent) throws Throwable {
        qaPage.getCountry().click();
        qaPage.getCountryItem(country).click();
        qaPage.getAutomationExp(automationExp).click();
        qaPage.getProgrammingExp(programmingExp).click();
        qaPage.getAutomationTools(automationTools).click();
        qaPage.getEnglish(english).click();
        qaPage.getPerformanceExp(performanceExp).click();
        qaPage.getHiringEvent(hiringEvent).click();
    }

    @And("^Click Continue$")
    public void click_continue() throws Throwable {
        qaPage.getContinueButton().click();
    }

}
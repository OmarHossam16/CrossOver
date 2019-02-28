package pageTests;

import org.openqa.selenium.WebElement;
import pageObjects.SearchJobsPage;
import resources.Base;

import java.io.IOException;

public class JobSearchTest extends Base {
    public static SearchJobsPage jobsPage;
    public void initializeLoginDriver(){
        driver = initializeDriver();
    }
    public void initialize() throws IOException {
        getProps();
        jobsPage = new SearchJobsPage(driver);
        log.info("initialize() Done");
    }

    public void closeCookie(){
        WebElement btn = jobsPage.getCloseCookieButton();
        if (btn.isDisplayed()){
            btn.click();
        }
    }

}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;

public class Footer{
    WebDriver driver;

    public Footer(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFooter(){
        return driver.findElement(By.className("footer-wrapper"));
    }

    public WebElement getHome() {
        return getFooter().findElement(By.linkText("Home"));
    }

    public WebElement getPeople() {
        return getFooter().findElement(By.linkText("People"));
    }

    public WebElement getPlaybooks() {
        return getFooter().findElement(By.linkText("Playbooks"));
    }

    public WebElement getProductivity() {
        return getFooter().findElement(By.linkText("Productivity"));
    }

    public WebElement getForCandidates() {
        return getFooter().findElement(By.linkText("For Candidates"));
    }

    public WebElement getBlog() {
        return getFooter().findElement(By.linkText("Blog"));
    }

    public WebElement getAboutUs() {
        return getFooter().findElement(By.linkText("About Us"));
    }

    public WebElement getContactUs() {
        return getFooter().findElement(By.linkText("Contact Us"));
    }

    public WebElement getHireGreatTalent() {
        return getFooter().findElement(By.linkText("Hire Great Talent"));
    }

    public WebElement getAvailableJobs() {
        return getFooter().findElement(By.linkText("Available Jobs"));
    }

    public WebElement getFaqs() {
        return getFooter().findElement(By.linkText("FAQs"));
    }

    public WebElement getTermsAndConditions() {
        return getFooter().findElement(By.linkText("Terms and Conditions"));
    }

    public WebElement getFacebook() {
        return getFooter().findElement(By.linkText("Facebook"));
    }

    public WebElement getTwitter() {
        return getFooter().findElement(By.linkText("Twitter"));
    }

    public WebElement getLinkedIn() {
        return getFooter().findElement(By.linkText("linkedIn"));
    }

}
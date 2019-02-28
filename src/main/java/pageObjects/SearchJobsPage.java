package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchJobsPage {
    WebDriver driver;

    public SearchJobsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchBox() {
        return driver.findElement(By.xpath("//input[@placeholder='Job title, keywords']"));
    }

    public WebElement getCategoriesDropdown() {
        return driver.findElement(By.cssSelector("span[class='ng-binding ng-scope']"));
    }

    public WebElement getCategory(String category){
        return driver.findElement(By.xpath("//span[@class='ng-binding'][contains(text(),'"+category+"')]"));
    }
    public WebElement getSubmitButton() {
        return driver.findElement(By.cssSelector("[type='submit']"));
    }

    public WebElement getJobItem(String jobTitle) {
        WebElement panelBody = driver.findElement(By.cssSelector("[class='jobs-list ng-isolate-scope']"));
        return panelBody.findElement(By.xpath("//*[contains(text(),'"+jobTitle+"')]"));
    }

    public WebElement getCloseCookieButton() {
        WebElement cookie = driver.findElement(By.tagName("cookie-banner"));
        return cookie.findElement(By.tagName("button"));
    }

}

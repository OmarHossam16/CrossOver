package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;
public class QAJobPage extends Base {
    WebDriver driver;
    WebElement form;

    public QAJobPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getApplyNow() {
        return driver.findElement(By.cssSelector("span[class='lightbox-handle sqs-system-button sqs-editable-button']"));
    }

    public WebElement getFirstName() {
        form = driver.findElement(By.cssSelector("[class='field-list clear']"));
        return form.findElement(By.cssSelector("[name='fname']"));
    }

    public WebElement getLastName() {
        return form.findElement(By.cssSelector("[name='lname']"));
    }

    public WebElement getEmail() {
        return form.findElement(By.cssSelector("[name='email']"));
    }

    public WebElement getLinkedIn() {
        return form.findElement(By.xpath("//label[contains(text(),'LinkedIn Profile Link')]/following-sibling::input"));
    }

    public WebElement getPhone() {
        return form.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
    }

    public WebElement getCountry() {
        return form.findElement(By.xpath("//label[contains(text(),'Country ')]/following-sibling::select"));
    }

    public WebElement getCountryItem(String country) {
        return form.findElement(By.cssSelector("option[value='"+country+"']"));
    }

    public WebElement getAutomationExp(String exp) {
        return form.findElement(By.cssSelector("input[value='"+exp+"']"));
    }

    public WebElement getProgrammingExp(String exp) {
        return form.findElement(By.cssSelector("input[value='"+exp+"']"));
    }

    public WebElement getAutomationTools(String exp) {
        return form.findElement(By.cssSelector("input[value='"+exp+"']"));
    }

    public WebElement getEnglish(String prof) {
        return form.findElement(By.cssSelector("input[value='"+prof+"']"));
    }

    public WebElement getPerformanceExp(String exp) {
        return form.findElement(By.cssSelector("input[value='"+exp+"']"));
    }

    public WebElement getHiringEvent(String event) {
        return form.findElement(By.cssSelector("input[value='"+event+"']"));
    }

    public WebElement getContinueButton() {
        return form.findElement(By.xpath("//input[@value='Continue']"));
    }

//    public WebElement getCloseCookieButton() {
//        WebElement cookie = driver.findElement(By.tagName("cookie-banner"));
//        return cookie.findElement(By.tagName("button"));
//    }
}

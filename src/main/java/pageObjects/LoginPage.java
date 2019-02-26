package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;

public class LoginPage extends Base {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmail() {
        return driver.findElement(By.cssSelector("[placeholder = 'Email Address']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.cssSelector("[placeholder = 'Password']"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("[type = 'submit']"));
    }

    public WebElement getLoginLinkedIn() {
        return driver.findElement(By.cssSelector("[class = 'fa fa-linkedin']"));
    }

    public WebElement getForgotPassword() {
        return driver.findElement(By.cssSelector("a[href*='/reset']"));
    }

    public WebElement getPolicy() {
        return driver.findElement(By.cssSelector("a[href*='/privacy-policy']"));
    }

    public WebElement getContactUs() {
        return driver.findElement(By.cssSelector("a[href*='/contact-us']"));
    }

    public WebElement getInvalidLogin() {
        return driver.findElement(By.cssSelector("[class = 'alert alert-warning small']"));
    }

    public WebElement getCloseCookieButton() {
        WebElement cookie = driver.findElement(By.tagName("cookie-banner"));
        return cookie.findElement(By.tagName("button"));
    }
}

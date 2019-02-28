package pageTests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class LoginTest extends Base {
    public static Logger log = LogManager.getLogger(Base.class.getName());
    LoginPage login;
     public void initializeLoginDriver(){
        driver = initializeDriver();
    }
    public void initialize() throws IOException {
        getProps();
        login = new LoginPage(driver);
        log.info("initialize() Done");
    }
    public void loginWith(String email,String password){
        login.getEmail().sendKeys(email);
        login.getPassword().sendKeys(password);
        login.getLoginButton().click();
    }
    public Boolean validateLogin(){
        return !login.getInvalidLogin().isDisplayed();
    }
    public void closeCookie(){
        WebElement btn = login.getCloseCookieButton();
        if (btn.isDisplayed()){
            btn.click();
        }
    }
}

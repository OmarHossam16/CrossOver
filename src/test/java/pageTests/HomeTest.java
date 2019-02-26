package pageTests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageObjects.Footer;
import pageObjects.HomePage;
import pageObjects.Menu;
import resources.Base;

import java.io.IOException;

public class HomeTest extends Base  {
    public static Logger log = LogManager.getLogger(Base.class.getName());
    Menu menu;
    HomePage home;
    Footer footer;
    public void initializeHomeDriver(){
        driver = initializeDriver();
    }
    public void initialize() throws IOException {
        getProps();
        menu = new Menu(driver,version);
        home = new HomePage(driver);
        footer = new Footer(driver);
        log.info("initialize() Done");
    }
    public void homepageToLogin(String website){
        driver.get(website);
        menu.getLoginButton().click();
        log.info("homepageToLogin() Done");
    }

    public void homepageToLogin(){
        driver.get(website);
        menu.getLoginButton().click();
        log.info("homepageToLogin() Done");
    }

}
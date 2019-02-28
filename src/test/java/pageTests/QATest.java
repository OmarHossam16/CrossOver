package pageTests;

import org.openqa.selenium.WebElement;
import pageObjects.QAJobPage;
import resources.Base;

import java.io.IOException;

public class QATest extends Base {

    public static QAJobPage qaPage;
    public void initializeLoginDriver(){
        driver = initializeDriver();
    }
    public void initialize() throws IOException {
        getProps();
        qaPage = new QAJobPage(driver);
        log.info("initialize() Done");
    }

//    public void closeCookie(){
//        WebElement btn = qaPage.getCloseCookieButton();
//        if (btn.isDisplayed()){
//            btn.click();
//        }
//    }
}

package resources;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class Base implements Globals{
    public static Logger log = LogManager.getLogger(Base.class.getName());
    public static WebDriver driver;
    public static Properties prop;

    public void getProps() throws IOException {
        prop = new Properties();
        String properties = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
        FileInputStream fis=new FileInputStream(properties);
        prop.load(fis);
    }

    public WebDriver initializeDriver(){
        setBrowserDriver(browser);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver;
    }

    public void setBrowserDriver(String browser){
        if (browser.equals("chrome")){
            System.setProperty(chromeDriver,chromePath);
            driver = new ChromeDriver();
        }else if (browser.equals("firefox")){
            // code
        }else if (browser.equals("IE")){
            // code
        }
    }

    public void shutDown(){
        driver.close();
        driver = null;
        log.info("shutDown() Done");
    }

    public static void takeScreenshot(String name) throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File(screenshotPath+name+" screenshot.png"));
    }

}
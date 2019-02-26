package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;


public class Menu extends Base {
    WebDriver driver;
    String version;
    public Menu(WebDriver driver,String version) {
        this.driver = driver;
        this.version = version;
    }

    public WebElement getMenu() {
        return driver.findElement(By.id(version));
    }


    public WebElement getPeopleButton() {

        return getMenu().findElement(By.cssSelector("a[href*='"+peoplePage+"']"));
    }

    public WebElement getPlaybooksButton() {
        return getMenu().findElement(By.cssSelector("a[href*='"+playbooksPage+"']"));
    }

    public WebElement getProductivityButton() {
        return getMenu().findElement(By.cssSelector("a[href*='"+productivityPage+"']"));
    }

    public WebElement getCandidatesButton() {
        return getMenu().findElement(By.cssSelector("a[href*='"+candidatesPage+"']"));
    }

    public WebElement getTestimonialsButton() {
        return getMenu().findElement(By.cssSelector("a[href*='"+testimonialsPage+"']"));
    }

    public WebElement getAboutButton() {
        return getMenu().findElement(By.cssSelector("a[href*='"+aboutPage+"']"));
    }

    public WebElement getContactButton() {
        return getMenu().findElement(By.cssSelector("a[href*='"+contactPage+"']"));
    }

    public WebElement getLoginButton() {
        return getMenu().findElement(By.cssSelector("a[href*='"+loginPage+"']"));
    }


}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSeeAvailableJobs() {
        return driver.findElement(By.xpath("//a[text()='SEE AVAILABLE JOBS']"));
    }

    public WebElement getScrollDown() {
        return driver.findElement(By.className("scroll-arrow"));
    }

    public WebElement getCard(int card) {
        return driver.findElements(By.className("card")).get(card);
    }

    public WebElement getMoreTestimonials() {
        return driver.findElement(By.xpath("//a[text()='MORE TESTIMONIALS']"));
    }

    public WebElement getScrollTop() {
        return driver.findElement(By.className("arrow"));
    }

}

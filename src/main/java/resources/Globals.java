package resources;

public interface Globals {
    String screenshotPath = Base.prop.getProperty("screenshotPath");
    String browser = Base.prop.getProperty("browser");
    String chromeDriver = Base.prop.getProperty("chromeDriver");
    String chromePath = Base.prop.getProperty("chromePath");

    String website = Base.prop.getProperty("website");
    String peoplePage = Base.prop.getProperty("peoplePage");
    String playbooksPage = Base.prop.getProperty("playbooksPage");
    String productivityPage = Base.prop.getProperty("productivityPage");
    String candidatesPage = Base.prop.getProperty("candidatesPage");
    String testimonialsPage = Base.prop.getProperty("testimonialsPage");
    String aboutPage = Base.prop.getProperty("aboutPage");
    String contactPage = Base.prop.getProperty("contactPage");
    String loginPage = Base.prop.getProperty("loginPage");
    String version = Base.prop.getProperty("desktopMenu");
}

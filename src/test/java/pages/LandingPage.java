package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;
    private static String url = "https://allegro.pl/";

    @FindBy(css="[data-role=accept-consent][data-analytics-interaction-value=accept]")
    private WebElement rodoButtonAccept;

    @FindBy(css="[data-role=reject-consent][data-analytics-interaction-value=reject]")
    private WebElement rodoButtonDeny;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public String getPage() {
        driver.get(url);
        return url;
    }

    public void rodoButtonAcceptClick() {
        rodoButtonAccept.click();
    }

    public void rodoButtonDenyClick() {
        rodoButtonDeny.click();
    }



}

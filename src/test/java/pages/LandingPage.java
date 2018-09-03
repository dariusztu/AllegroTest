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

public class LandingPage    extends BasePage {

    WebDriver driver;
    private static String url = "https://allegro.pl/";

    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-role=accept-consent][data-analytics-interaction-value=accept]")
    private WebElement rodoButtonAccept;

    @FindBy(css = "[data-role=reject-consent][data-analytics-interaction-value=reject]")
    private WebElement rodoButtonDeny;

    @FindBy(css = "[data-description='header account name']")
    private WebElement mojeAllegroButton;

    @FindBy(css = "[data-description='header login button']")
    private WebElement mojeAllegroToLoginButton;

    @FindBy(css = "[data-description='header logout button']")
    private WebElement mojeAllegroToLogoutButton;





    public String getPage() {
        driver.get(url);
        return url;
    }

    public LandingPage goTopage() {
        driver.get(url);
        return this;
    }

    public void rodoButtonAcceptClick() {
        rodoButtonAccept.click();
    }

    public void rodoButtonDenyClick() {
        rodoButtonDeny.click();
    }

    public void mojeAllegroButtonClicK() {
        mojeAllegroButton.click();
    }

    public void mojeAllegroToLoginButtonClick() {
        mojeAllegroToLoginButton.click();
    }

    public void mojeAllegroToLogoutButtonClick() {
        mojeAllegroToLogoutButton.click();
    }

    public boolean checkIfVisible() {
        boolean isVisible = rodoButtonAccept.isDisplayed();
        return isVisible;
    }

}

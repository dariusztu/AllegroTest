package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LandingPage;
import static org.assertj.core.api.Assertions.*;

public class LandingPageTest extends BaseTest {

    private LandingPage landingPageObject;

    @Test
    public void passIfCurrentUrlIsAsGiven() {
        landingPageObject = new LandingPage(driver);
        String url = landingPageObject.getPage();
        assertThat(url).isEqualTo(driver.getCurrentUrl());

    }

    @Test
    public void passIfRODOAcceptGoToNextPage() {
        landingPageObject = new LandingPage(driver);
        landingPageObject.
                goTopage().
                rodoButtonAcceptClick();
        assertThat(landingPageObject.checkIfVisible()).isFalse();

    }

    @Test
    public void passIfRODODenyDoesntGoToNextPage() {
        landingPageObject = new LandingPage(driver);
        landingPageObject.
                goTopage().
                rodoButtonDenyClick();
        assertThat(landingPageObject.checkIfVisible()).isFalse();
    }



}

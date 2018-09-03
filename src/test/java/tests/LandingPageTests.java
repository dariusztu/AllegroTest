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

public class LandingPageTests extends BaseTest {

    private LandingPage landingPageObject;

    @Test
    public void firstSampleTest() {
        landingPageObject = new LandingPage(driver);
        String url = landingPageObject.getPage();
        assertThat(url).isEqualTo(driver.getCurrentUrl());

    }
}

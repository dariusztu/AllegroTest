package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private LandingPage landingPageObject;
    private WebDriver driver;

    @BeforeClass
    public static void pathSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupDriver() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void firstSampleTest() {
        
    }

}

package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LandingPage;
import pages.LoginPage;

import static org.assertj.core.api.Assertions.*;

public class LoginPageTest {

    private LandingPage landingPageObject;
    private LoginPage loginPageObject;
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
    public void passIfLoginSuccessfull() {
        landingPageObject = new LandingPage(driver);
        loginPageObject = new LoginPage(driver);
        landingPageObject.getPage();
        landingPageObject.rodoButtonAcceptClick();
        landingPageObject.mojeAllegroButtonClicK();
        landingPageObject.mojeAllegroToLoginButtonClick();
        loginPageObject.loginOrEmailInputFormClick();
        loginPageObject.loginOrEmailFormEnterLogin("ALLEGRO_LOGIN");
        loginPageObject.passwordInputFormClick();
        loginPageObject.passwordFormEnterPassword("ALLEGRO_PASSWD");
        loginPageObject.loginButtonClick();

    }
}

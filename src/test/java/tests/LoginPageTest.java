package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Header.HeaderPage;
import pages.LandingPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;

public class LoginPageTest {

    private LandingPage landingPageObject;
    private LoginPage loginPageObject;
    private HeaderPage headerPageObject;
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
    public void passIfLoginSuccessfull() throws Exception {
        landingPageObject = new LandingPage(driver);
        loginPageObject = new LoginPage(driver);
        landingPageObject.getPage();
        landingPageObject.rodoButtonAcceptClick().
                mojeAllegroButtonClick().
                mojeAllegroToLoginButtonClick();

        loginPageObject.loginOrEmailInputFormClick().
                loginOrEmailFormEnterLogin().
                passwordInputFormClick().
                passwordFormEnterPassword().
                loginButtonClick();
            //TODO
    }

    @Test
    public void passIfLogOutSuccessfull() throws Exception{
        landingPageObject = new LandingPage(driver);
        loginPageObject = new LoginPage(driver);
        headerPageObject = new HeaderPage(driver);


        // LOGIN
        landingPageObject.getPage();
        landingPageObject.rodoButtonAcceptClick().
                mojeAllegroButtonClick().
                mojeAllegroToLoginButtonClick();

        loginPageObject.loginOrEmailInputFormClick().
                loginOrEmailFormEnterLogin().
                passwordInputFormClick().
                passwordFormEnterPassword().
                loginButtonClick();

        // LOGOUT
            //TODO


         assertThat(headerPageObject
                 .dropdownPage
                 .waitForAccoutNameVisiblity())
                 .isTrue();

        assertThat(headerPageObject
                .dropdownPage
                .mojeAllegroDropdownClick()

                .mojeAllegroDropdownWylogujButtonClick()
                .mojeAllegroDropdownCheckIfUserNameIsVisible())
                .isTrue();


    }
}

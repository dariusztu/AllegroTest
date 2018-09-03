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

import java.util.Map;

public class LoginPage extends BasePage{

    WebDriver driver;
    private static String url = "";
    private String myLoginOrEmail = System.getenv("ALLEGRO_LOGIN");
    private String myPasswd = System.getenv("ALLEGRO_PASSWD");


    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#username[placeholder='Login lub e-mail']")
    private WebElement loginOrEmailInputForm;

    @FindBy(css = "#password[placeholder='Hasło']")
    private WebElement passwordInputForm;

    @FindBy(xpath = "//span[text()= \"Zaloguj się\"]")
    private WebElement loginButton;

    public void loginOrEmailInputFormClick() {
        loginOrEmailInputForm.click();
    }

    public void passwordInputFormClick() {
        passwordInputForm.click();
    }

    public void loginButtonClick() {
        loginButton.click();
    }


    public String checkEnv(String env1) {

            try {
                String env = System.getenv(env1);

                if (env == null) {

                    throw new AssertionError("Environmental variable not set properly, please check.");
                }
                    return env;

            } catch (SecurityException e) {
                throw new AssertionError("Security policy doesn't allow access to system environment", e);
            }



    }

    public void loginOrEmailFormEnterLogin() {

        String checkLogin = checkEnv(myLoginOrEmail);
        if (!(checkLogin.isEmpty())) {
            loginOrEmailInputForm.sendKeys(myLoginOrEmail);
        } else {
            System.out.println("Login variable incorrect, please check environmental variable");
        }
    }

    public void passwordFormEnterPassword() {

        String checkPasswd = checkEnv(myPasswd);
        if (!(checkPasswd.isEmpty())) {
            passwordInputForm.sendKeys(myPasswd);
        } else {
            System.out.println("Password variable incorrect, please check environmental variable");
        }
    }
}

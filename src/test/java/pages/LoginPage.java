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

    public LoginPage loginOrEmailInputFormClick() {
        loginOrEmailInputForm.click();
        return this;
    }

    public LoginPage passwordInputFormClick() {
        passwordInputForm.click();
        return this;
    }

    public LoginPage loginButtonClick() {
        loginButton.click();
        return this;
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

    public LoginPage loginOrEmailFormEnterLogin(String login) {
        String checkLogin = checkEnv(login);
        if ((checkLogin.length() > 0)) {
            loginOrEmailInputForm.sendKeys(checkLogin);
        } else {
            System.out.println("Login variable incorrect, please check environmental variable");
        }
        return this;
    }

    public LoginPage passwordFormEnterPassword(String password) {
        String checkPasswd = checkEnv(password);
        if ((checkPasswd.length() > 0)) {
            passwordInputForm.sendKeys(checkPasswd);
        } else {
            System.out.println("Password variable incorrect, please check environmental variable");
        }
        return this;
    }
}

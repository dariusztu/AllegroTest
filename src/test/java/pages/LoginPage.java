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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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





        public static String[] readFileAsString() throws Exception
        {//TODO
            String[] loginAndPasswd = new String[2];

            File file = new File(System.getProperty("user.home").toString() + "/allegropasswd.txt");
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\n");
            loginAndPasswd[0] = sc.next().toString();
            loginAndPasswd[1] = sc.next().toString();
            return loginAndPasswd;
        }







    public LoginPage loginOrEmailFormEnterLogin() throws Exception {
        String[] login1 = readFileAsString();
        loginOrEmailInputForm.sendKeys(login1[0]);
        return this;
    }

    public LoginPage passwordFormEnterPassword() throws Exception {
        String[] passwd = readFileAsString();
        passwordInputForm.sendKeys(passwd[1]);
        return this;
    }
}

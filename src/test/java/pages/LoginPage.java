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

public class LoginPage {

    WebDriver driver;
    private static String url = "";
    private String myLoginOrEmail = System.getenv("$ALLEGRO_LOGIN");
    private String myPasswd = System.getenv("$ALLEGRO_PASSWD");


    public LoginPage(WebDriver driver) {
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

    public void loginOrEmailFormEnterLogin(){
        loginOrEmailInputForm.sendKeys(myLoginOrEmail);
    }

    public void passwordFormEnterPassword(){
        passwordInputForm.sendKeys(myPasswd);
    }
}

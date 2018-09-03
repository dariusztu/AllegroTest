package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;
    private static String url = "https://allegro.pl/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BasePage click(WebElement element) {
        element.click();
        return this;
    }

    public String getTextToString(WebElement element) {
        String elementText = element.getText();
        return elementText;

    }

    public BasePage sendKeysFromString(WebElement element, String keys) {
        element.sendKeys(keys);
        return this;
    }
}

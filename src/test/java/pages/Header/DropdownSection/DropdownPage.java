package pages.Header.DropdownSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class DropdownPage {

    WebDriver driver;

    public DropdownPage(WebDriver driver) extends BasePage {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
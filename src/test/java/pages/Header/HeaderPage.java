package pages.Header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.Header.DropdownSection.DropdownPage;
import pages.Header.SearchSection.SearchPage;

public class HeaderPage extends BasePage {

    WebDriver driver;
    public DropdownPage dropdownPage;
    public SearchPage searchPage;

    public HeaderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        dropdownPage = new DropdownPage(driver);
        searchPage = new SearchPage(driver);
    }
}

package pages.Header.SearchSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SearchPage extends BasePage {

    WebDriver driver;

    public SearchPage(WebDriver driver)

    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}

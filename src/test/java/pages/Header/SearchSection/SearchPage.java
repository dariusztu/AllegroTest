package pages.Header.SearchSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) extends BasePage

    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}

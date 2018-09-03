package pages.Header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.Header.DropdownSection.DropdownPage;
import pages.Header.SearchSection.SearchPage;
import sun.jvm.hotspot.memory.HeapBlock;

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

    @FindBy(css = ".fee54_1Uwxm.fee54_3KwDM > a")
    private WebElement starButtonObserwowaneOfety;

    @FindBy(css = ".fee54_1Njt4 > div:nth-child(2) > div > div > a")
    private WebElement koszyk;

    public HeaderPage starButtonObserwowaneOfetyClick() {
        starButtonObserwowaneOfety.click();
        return this;
    }

    public HeaderPage koszykClick() {
        koszyk.click();
        return this;
    }

}

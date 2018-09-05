package pages.Header.CategoriesSection.SubCategory9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory9Page extends BasePage {

    WebDriver driver;

    public SubCategory9Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Sport i turystyka subcategory


    @FindBy(css = "a[title=\"Wakacje\"]")
    private WebElement sportiTurystykaPodkategoriaWakacje;

    public WebElement getsportiTurystykaPodkategoriaWakacje() {
        return sportiTurystykaPodkategoriaWakacje;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaWakacjeClick() {
        sportiTurystykaPodkategoriaWakacje.click();
        return this;
    }

}

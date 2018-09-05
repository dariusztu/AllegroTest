package pages.Header.CategoriesSection.SubCategory7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory7Page extends BasePage {

    WebDriver driver;

    public SubCategory7Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Zdrowie subcategory



    @FindBy(css = "a[title=\"Erotyka\"]")
    private WebElement zdrowiePodkategoriaErotyka;

    public WebElement getzdrowiePodkategoriaErotyka() {
        return zdrowiePodkategoriaErotyka;
    }

    public SubCategory7Page zdrowiePodkategoriaErotykaClick() {
        zdrowiePodkategoriaErotyka.click();
        return this;
    }

}

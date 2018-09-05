package pages.Header.CategoriesSection.SubCategory12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory12Page extends BasePage {

    WebDriver driver;

    public SubCategory12Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Kolekcje i sztuka subcategory

    

    @FindBy(css = "a[title=\"Antyki i Sztuka\"]")
    private WebElement kolekcjeiSztukaPodkategoriaAntykiiSztuka;

    public WebElement getkolekcjeiSztukaPodkategoriaAntykiiSztuka() {
        return kolekcjeiSztukaPodkategoriaAntykiiSztuka;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaAntykiiSztukaClick() {
        kolekcjeiSztukaPodkategoriaAntykiiSztuka.click();
        return this;
    }

}

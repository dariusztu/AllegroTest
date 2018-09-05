package pages.Header.CategoriesSection.SubCategory13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory13Page extends BasePage {

    WebDriver driver;

    public SubCategory13Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Firma subcategory


    @FindBy(css = "a[title=\"Firma\"]")
    private WebElement firmaPodkategoriaFirma;

    public WebElement getfirmaPodkategoriaFirma() {
        return firmaPodkategoriaFirma;
    }

    public SubCategory13Page firmaPodkategoriaFirmaClick() {
        firmaPodkategoriaFirma.click();
        return this;
    }

}

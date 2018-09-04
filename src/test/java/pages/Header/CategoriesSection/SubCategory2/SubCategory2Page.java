package pages.Header.CategoriesSection.SubCategory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.Header.CategoriesSection.SubCategory1.SubCategory1Page;

public class SubCategory2Page extends BasePage {

    WebDriver driver;

    public SubCategory2Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Moda subcategory



    @FindBy(css = "a[title=\"Odzież, Obuwie, Dodatki\"]")
    private WebElement modaPodkategoriaOdziezObuwieDodatki;

    public WebElement getModaPodkategoriaOdziezObuwieDodatki() {
        return modaPodkategoriaOdziezObuwieDodatki;
    }

    public SubCategory2Page modaPodkategoriaOdziezObuwieDodatkiClick() {
        modaPodkategoriaOdziezObuwieDodatki.click();
        return this;
    }

}

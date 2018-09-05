package pages.Header.CategoriesSection.SubCategory6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory6Page extends BasePage {

    WebDriver driver;

    public SubCategory6Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Uroda subcategory

    

    @FindBy(css = "a[title=\"Odzież, Obuwie, Dodatki\"]")
    private WebElement urodaPodkategoriaPielegnacja;

    public WebElement geturodaPodkategoriaPielegnacja() {
        return urodaPodkategoriaPielegnacja;
    }

    public SubCategory6Page urodaPodkategoriaPielegnacjaClick() {
        urodaPodkategoriaPielegnacja.click();
        return this;
    }

}

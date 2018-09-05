package pages.Header.CategoriesSection.SubCategory8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory8Page extends BasePage {

    WebDriver driver;

    public SubCategory8Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Kultura i rozrywka subcategory

    

    @FindBy(css = "Bilety\"]")
    private WebElement kulturaiRozrywkaPodkategoriaBilety;

    public WebElement getkulturaiRozrywkaPodkategoriaBilety() {
        return kulturaiRozrywkaPodkategoriaBilety;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaBiletyClick() {
        kulturaiRozrywkaPodkategoriaBilety.click();
        return this;
    }

}

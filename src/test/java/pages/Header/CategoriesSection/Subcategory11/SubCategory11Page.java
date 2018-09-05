package pages.Header.CategoriesSection.SubCategory11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory11Page extends BasePage {

    WebDriver driver;

    public SubCategory11Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Ogloszenia i uslugi subcategory



    @FindBy(css = "a[title=\"Samochody osobowe\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaSamochodyOsobowe;

    public WebElement getogloszeniaiUslugiPodkategoriaSamochodyOsobowe() {
        return ogloszeniaiUslugiPodkategoriaSamochodyOsobowe;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaSamochodyOsoboweClick() {
        ogloszeniaiUslugiPodkategoriaSamochodyOsobowe.click();
        return this;
    }

}

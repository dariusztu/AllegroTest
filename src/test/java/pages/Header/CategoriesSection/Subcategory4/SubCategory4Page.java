package pages.Header.CategoriesSection.SubCategory4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory4Page extends BasePage {

    WebDriver driver;

    public SubCategory4Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Supermarket subcategory



    @FindBy(css = "a[title=\"Karma dla psa\"]")
    private WebElement supermarketPodkategoriaKarmaDlaPsa;

    public WebElement getsupermarketPodkategoriaKarmaDlaPsa() {
        return supermarketPodkategoriaKarmaDlaPsa;
    }

    public SubCategory4Page supermarketPodkategoriaKarmaDlaPsaClick() {
        supermarketPodkategoriaKarmaDlaPsa.click();
        return this;
    }

}

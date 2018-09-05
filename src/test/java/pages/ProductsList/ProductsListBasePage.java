package pages.ProductsList;
import  pages.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsListBasePage  extends BasePage {

    WebDriver driver;
    private static String url = "https://allegro.pl/";

    public ProductsListBasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".listing-title__category")
    private WebElement productsListCategoryTitle;

    public WebElement getProductsListCategoryTitle() {
        return productsListCategoryTitle;
    }

    public String productsListCategoryTitleGetText() {
        String CategoryTitle = productsListCategoryTitle.getText();
        return CategoryTitle;
    }

}

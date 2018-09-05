package pages.ProductsList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsListBasePage {

    WebDriver driver;
    private static String url = "https://allegro.pl/";

    public ProductsListBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".listing-title__category")
    private WebElement productsListCategoryTitle;

    public String setProductsListCategoryTitleGetText() {
        String CategoryTitle = productsListCategoryTitle.getText();
        return CategoryTitle;
    }

}

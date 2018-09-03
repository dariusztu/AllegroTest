package pages.Header.CategoriesSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class CategoriesPage extends BasePage {

    WebDriver driver;

    public CategoriesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href=\"/dzial/supermarket#to-category-map\"]")
    private WebElement wszystkiekategorie;

    public CategoriesPage wszystkiekategorieClick() {
        wszystkiekategorie.click();
        return this;
    }

}

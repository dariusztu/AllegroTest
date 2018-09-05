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

    // Dom i ogrod subcategory

    //TODO

    @FindBy(css = "a[title=\"Odzież, Obuwie, Dodatki\"]")
    private WebElement domiOgrodPodkategoriaBudownictwoiAkcesoria;

    public WebElement getdomiOgrodPodkategoriaBudownictwoiAkcesoria() {
        return domiOgrodPodkategoriaBudownictwoiAkcesoria;
    }

    public SubCategory4Page domiOgrodPodkategoriaBudownictwoiAkcesoriaClick() {
        domiOgrodPodkategoriaBudownictwoiAkcesoria.click();
        return this;
    }

}

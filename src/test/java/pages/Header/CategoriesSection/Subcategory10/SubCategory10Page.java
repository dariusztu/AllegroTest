package pages.Header.CategoriesSection.SubCategory10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory10Page extends BasePage {

    WebDriver driver;

    public SubCategory10Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Motoryzacja subcategory



    @FindBy(css = "Części samochodowe\"]")
    private WebElement motoryzacjaPodkategoriaCzesciSamochodowe;

    public WebElement getmotoryzacjaPodkategoriaCzesciSamochodowe() {
        return motoryzacjaPodkategoriaCzesciSamochodowe;
    }

    public SubCategory10Page motoryzacjaPodkategoriaCzesciSamochodoweClick() {
        motoryzacjaPodkategoriaCzesciSamochodowe.click();
        return this;
    }

}

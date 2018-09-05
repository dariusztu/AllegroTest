package pages.Header.CategoriesSection.SubCategory5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory5Page extends BasePage {

    WebDriver driver;

    public SubCategory5Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Dziecko subcategory

    
    @FindBy(css = "a[title=\"Dla mamy i dziecka\"]")
    private WebElement dzieckoPodkategoriaDlaMamyiDziecka;

    public WebElement getdzieckoPodkategoriaDlaMamyiDziecka() {
        return dzieckoPodkategoriaDlaMamyiDziecka;
    }

    public SubCategory5Page dzieckoPodkategoriaDlaMamyiDzieckaClick() {
        dzieckoPodkategoriaDlaMamyiDziecka.click();
        return this;
    }

}

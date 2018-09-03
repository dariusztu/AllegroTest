package pages.Header.SearchSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SearchPage extends BasePage {

    WebDriver driver;

    public SearchPage(WebDriver driver)

    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[type=\"search\"].metrum-search__query")
    private WebElement searchForm;

    @FindBy(css = "input[type=\"submit\"].metrum-search__submit")
    private WebElement searchButton;

    @FindBy(css = ".metrum-search__filters")
    private WebElement dropdownCategorySearch;

    @FindBy(css = ".metrum-search__drop _11qsv")
    private WebElement dropdownCategorySearchRolledDownList;

    @FindBy(css = ".opbox-metrum-header__search-slot > div > div > form > div > div > div:nth-child(1)")
    private WebElement dropdownCategorySearchJak;

    @FindBy(css = ".metrum-search__option.metrum-search__option--how")
    private WebElement dropdownCategorySearchWopisachOfertCheckbox; // No redirect URL



    @FindBy(css = ".opbox-metrum-header__search-slot > div > div > form > div > div > div:nth-child(4)")
    private WebElement dropdownCategorySearchGdzie; // No redirect URL

    @FindBy(css = "label[for=\"all-0\"]")
    private WebElement dropdownCategorySearchWszystkieDzialy;

    @FindBy(css = "label[for=\"department-1\"]")
    private WebElement dropdownCategorySearchDomiOgrod;

    @FindBy(css = "label[for=\"department-2\"]")
    private WebElement dropdownCategorySearchDziecko;


    @FindBy(css = "label[for=\"department-3\"]")
    private WebElement dropdownCategorySearchElektronika;

    @FindBy(css = "label[for=\"department-4\"]")
    private WebElement dropdownCategorySearchFirma;

    @FindBy(css = "label[for=\"department-5\"]")
    private WebElement dropdownCategorySearchKolekcjeiSztuka;

    @FindBy(css = "label[for=\"department-6\"]")
    private WebElement dropdownCategorySearchKulturaiRozrywka;

    @FindBy(css = "label[for=\"department-7\"]")
    private WebElement dropdownCategorySearchModa;

    @FindBy(css = "label[for=\"department-8\"]")
    private WebElement dropdownCategorySearchMotoryzacja;

    @FindBy(css = "label[for=\"department-9\"]")
    private WebElement dropdownCategorySearchOgloszeniaiUslugi;

    @FindBy(css = "label[for=\"department-10\"]")
    private WebElement dropdownCategorySearchSportiTurystyka;

    @FindBy(css = "label[for=\"department-11\"]")
    private WebElement dropdownCategorySearchSuperMarket;

    @FindBy(css = "label[for=\"department-12\"]")
    private WebElement dropdownCategorySearchUroda;

    @FindBy(css = "label[for=\"department-13\"]")
    private WebElement dropdownCategorySearchZdrowie;

    @FindBy(css = "label[for=\"department-14\"]")
    private WebElement dropdownCategorySearchUzytkownicy;

    @FindBy(css = "label[for=\"department-15\"]")
    private WebElement dropdownCategorySearchZakonczone;

    public SearchPage searchFormClick(){
        searchForm.click();
        return this;
    }

    public SearchPage searchFormSendKeys(String keys) {
        searchForm.sendKeys(keys);
        return this;
    }



    public SearchPage searchButtonClick() {
        searchButton.click();
        return this;
    }

    public SearchPage dropdownCategorySearchClick() {
        dropdownCategorySearch.click();
        return this;
    }




}

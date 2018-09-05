package pages.Header.CategoriesSection.SubCategory12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory12Page extends BasePage {

    WebDriver driver;

    public SubCategory12Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Kolekcje i sztuka subcategory


    @FindBy(css = "a[title=\"Antyki i Sztuka\"]")
    private WebElement kolekcjeiSztukaPodkategoriaAntykiiSztuka;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaProduktyInwestycyjne;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaKolekcje;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaRekodzielo;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaAkcesoriaPlastyczne;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaAntykwariat;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaDecoupage;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaMalarstwo;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaMilitaria;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaModelarstwo;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaNumizmatyka;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaTrafika;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaScrapbooking;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaPrzedmiotyHandmade;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaFilatelistyka;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaPamiatkiPRLu;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaPorcelanaRosenthal;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaSztukaWspolczesna;

    @FindBy(css = "a[title=\"\"]")
    private WebElement kolekcjeiSztukaPodkategoriaTkaniny;


    public WebElement getkolekcjeiSztukaPodkategoriaAntykiiSztuka() {

        return kolekcjeiSztukaPodkategoriaAntykiiSztuka;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaProduktyInwestycyjne() {
        return kolekcjeiSztukaPodkategoriaProduktyInwestycyjne;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaKolekcje() {
        return kolekcjeiSztukaPodkategoriaKolekcje;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaRekodzielo() {
        return kolekcjeiSztukaPodkategoriaRekodzielo;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaAkcesoriaPlastyczne() {
        return kolekcjeiSztukaPodkategoriaAkcesoriaPlastyczne;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaAntykwariat() {
        return kolekcjeiSztukaPodkategoriaAntykwariat;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaDecoupage() {
        return kolekcjeiSztukaPodkategoriaDecoupage;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaMalarstwo() {
        return kolekcjeiSztukaPodkategoriaMalarstwo;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaMilitaria() {
        return kolekcjeiSztukaPodkategoriaMilitaria;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaModelarstwo() {
        return kolekcjeiSztukaPodkategoriaModelarstwo;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaNumizmatyka() {
        return kolekcjeiSztukaPodkategoriaNumizmatyka;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaTrafika() {
        return kolekcjeiSztukaPodkategoriaTrafika;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaScrapbooking() {
        return kolekcjeiSztukaPodkategoriaScrapbooking;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaPrzedmiotyHandmade() {
        return kolekcjeiSztukaPodkategoriaPrzedmiotyHandmade;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaFilatelistyka() {
        return kolekcjeiSztukaPodkategoriaFilatelistyka;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaPamiatkiPRLu() {
        return kolekcjeiSztukaPodkategoriaPamiatkiPRLu;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaPorcelanaRosenthal() {
        return kolekcjeiSztukaPodkategoriaPorcelanaRosenthal;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaSztukaWspolczesna() {
        return kolekcjeiSztukaPodkategoriaSztukaWspolczesna;
    }

    public WebElement getKolekcjeiSztukaPodkategoriaTkaniny() {
        return kolekcjeiSztukaPodkategoriaTkaniny;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaAntykiiSztukaClick() {
        kolekcjeiSztukaPodkategoriaAntykiiSztuka.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaProduktyInwestycyjneClick() {
        kolekcjeiSztukaPodkategoriaProduktyInwestycyjne.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaKolekcjeClick() {
        kolekcjeiSztukaPodkategoriaKolekcje.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaRekodzieloClick() {
        kolekcjeiSztukaPodkategoriaRekodzielo.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaAkcesoriaPlastyczneClick() {
        kolekcjeiSztukaPodkategoriaAkcesoriaPlastyczne.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaAntykwariatClick() {
        kolekcjeiSztukaPodkategoriaAntykwariat.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaDecoupageClick() {
        kolekcjeiSztukaPodkategoriaDecoupage.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaMalarstwoClick() {
        kolekcjeiSztukaPodkategoriaMalarstwo.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaMilitariaClick() {
        kolekcjeiSztukaPodkategoriaMilitaria.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaModelarstwoClick() {
        kolekcjeiSztukaPodkategoriaModelarstwo.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaNumizmatykaClick() {
        kolekcjeiSztukaPodkategoriaNumizmatyka.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaTrafikaClick() {
        kolekcjeiSztukaPodkategoriaTrafika.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaScrapbookingClick() {
        kolekcjeiSztukaPodkategoriaScrapbooking.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaPrzedmiotyHandmadeClick() {
        kolekcjeiSztukaPodkategoriaPrzedmiotyHandmade.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaFilatelistykaClick() {
        kolekcjeiSztukaPodkategoriaFilatelistyka.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaPamiatkiPRLuClick() {
        kolekcjeiSztukaPodkategoriaPamiatkiPRLu.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaPorcelanaRosenthalClick() {
        kolekcjeiSztukaPodkategoriaPorcelanaRosenthal.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaSztukaWspolczesnaClick() {
        kolekcjeiSztukaPodkategoriaSztukaWspolczesna.click();
        return this;
    }

    public SubCategory12Page kolekcjeiSztukaPodkategoriaTkaninyClick() {
        kolekcjeiSztukaPodkategoriaTkaniny.click();
        return this;
    }
}

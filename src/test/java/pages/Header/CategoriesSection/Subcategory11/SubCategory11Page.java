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

    @FindBy(css = "a[title=\"Audi\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaAudi;

    @FindBy(css = "a[title=\"BMW\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaBMW;

    @FindBy(css = "a[title=\"Mercedes\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaMercedes;

    @FindBy(css = "a[title=\"Ford\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaFord;

    @FindBy(css = "a[title=\"Opel\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaOpel;

    @FindBy(css = "a[title=\"Fiat\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaFiat;

    @FindBy(css = "a[title=\"Toyota\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaToyota;

    @FindBy(css = "a[title=\"Volvo\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaVolvo;

    @FindBy(css = "a[title=\"Dostawcze (do 3,5t)\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaDostawczeDo35T;

    @FindBy(css = "a[title=\"Motocykle\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaMotocykle;

    @FindBy(css = "a[title=\"Quady\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaQuady;

    @FindBy(css = "a[title=\"Samochody ciężarowe\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaSamochodyCiezarowe;

    @FindBy(css = "a[title=\"Samochody zabytkowe\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaSamochodyZabytkowe;

    @FindBy(css = "a[title=\"Autobusy\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaAutobusy;

    @FindBy(css = "a[title=\"Maszyny budowlane\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaMaszynyBudowlane;

    @FindBy(css = "a[title=\"Maszyny rolnicze\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaMaszynyRolnicze;

    @FindBy(css = "a[title=\"Wózki widłowe\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaWozkiWidlowe;

    @FindBy(css = "a[title=\"Przyczepy, naczepy\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaPrzyczepyNaczepy;

    @FindBy(css = "a[title=\"Inne pojazdy i łodzie\"]")
    private WebElement ogloszeniaiUslugiPodkategoriaInnePojazdyiLodzie;


    public WebElement getogloszeniaiUslugiPodkategoriaSamochodyOsobowe() {
        return ogloszeniaiUslugiPodkategoriaSamochodyOsobowe;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaAudi() {
        return ogloszeniaiUslugiPodkategoriaAudi;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaBMW() {
        return ogloszeniaiUslugiPodkategoriaBMW;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaMercedes() {
        return ogloszeniaiUslugiPodkategoriaMercedes;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaFord() {
        return ogloszeniaiUslugiPodkategoriaFord;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaOpel() {
        return ogloszeniaiUslugiPodkategoriaOpel;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaFiat() {
        return ogloszeniaiUslugiPodkategoriaFiat;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaToyota() {
        return ogloszeniaiUslugiPodkategoriaToyota;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaVolvo() {
        return ogloszeniaiUslugiPodkategoriaVolvo;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaDostawczeDo35T() {
        return ogloszeniaiUslugiPodkategoriaDostawczeDo35T;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaMotocykle() {
        return ogloszeniaiUslugiPodkategoriaMotocykle;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaQuady() {
        return ogloszeniaiUslugiPodkategoriaQuady;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaSamochodyCiezarowe() {
        return ogloszeniaiUslugiPodkategoriaSamochodyCiezarowe;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaSamochodyZabytkowe() {
        return ogloszeniaiUslugiPodkategoriaSamochodyZabytkowe;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaAutobusy() {
        return ogloszeniaiUslugiPodkategoriaAutobusy;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaMaszynyBudowlane() {
        return ogloszeniaiUslugiPodkategoriaMaszynyBudowlane;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaMaszynyRolnicze() {
        return ogloszeniaiUslugiPodkategoriaMaszynyRolnicze;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaWozkiWidlowe() {
        return ogloszeniaiUslugiPodkategoriaWozkiWidlowe;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaPrzyczepyNaczepy() {
        return ogloszeniaiUslugiPodkategoriaPrzyczepyNaczepy;
    }

    public WebElement getOgloszeniaiUslugiPodkategoriaInnePojazdyiLodzie() {
        return ogloszeniaiUslugiPodkategoriaInnePojazdyiLodzie;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaSamochodyOsoboweClick() {
        ogloszeniaiUslugiPodkategoriaSamochodyOsobowe.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaAudiClick() {
        ogloszeniaiUslugiPodkategoriaAudi.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaBMWClick() {
        ogloszeniaiUslugiPodkategoriaBMW.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaMercedesClick() {
        ogloszeniaiUslugiPodkategoriaMercedes.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaFordClick() {
        ogloszeniaiUslugiPodkategoriaFord.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaOpelClick() {
        ogloszeniaiUslugiPodkategoriaOpel.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaFiatClick() {
        ogloszeniaiUslugiPodkategoriaFiat.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaToyotaClick() {
        ogloszeniaiUslugiPodkategoriaToyota.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaVolvoClick() {
        ogloszeniaiUslugiPodkategoriaVolvo.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaDostawczeDo35TClick() {
        ogloszeniaiUslugiPodkategoriaDostawczeDo35T.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaMotocykleClick() {
        ogloszeniaiUslugiPodkategoriaMotocykle.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaQuadyClick() {
        ogloszeniaiUslugiPodkategoriaQuady.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaSamochodyCiezaroweClick() {
        ogloszeniaiUslugiPodkategoriaSamochodyCiezarowe.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaSamochodyZabytkoweClick() {
        ogloszeniaiUslugiPodkategoriaSamochodyZabytkowe.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaAutobusyClick() {
        ogloszeniaiUslugiPodkategoriaAutobusy.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaMaszynyBudowlaneClick() {
        ogloszeniaiUslugiPodkategoriaMaszynyBudowlane.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaMaszynyRolniczeClick() {
        ogloszeniaiUslugiPodkategoriaMaszynyRolnicze.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaWozkiWidloweClick() {
        ogloszeniaiUslugiPodkategoriaWozkiWidlowe.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaPrzyczepyNaczepyClick() {
        ogloszeniaiUslugiPodkategoriaPrzyczepyNaczepy.click();
        return this;
    }

    public SubCategory11Page ogloszeniaiUslugiPodkategoriaInnePojazdyiLodzieClick() {
        ogloszeniaiUslugiPodkategoriaInnePojazdyiLodzie.click();
        return this;
    }
}

package pages.Header.CategoriesSection.Subcategory13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory13Page extends BasePage {

    WebDriver driver;

    public SubCategory13Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Firma subcategory


    @FindBy(css = "a[title=\"Firma\"]")
    private WebElement firmaPodkategoriaFirma;

    @FindBy(css = "a[title=\"Biuro i Reklama\"]")
    private WebElement firmaPodkategoriaBiuroiReklama;

    @FindBy(css = "a[title=\"Pakowanie i wysyłka\"]")
    private WebElement firmaPodkategoriaPakowanieiWysylka;

    @FindBy(css = "a[title=\"Reklama\"]")
    private WebElement firmaPodkategoriaReklama;

    @FindBy(css = "a[title=\"Meble biurowe\"]")
    private WebElement firmaPodkategoriaMebleBiurowe;

    @FindBy(css = "a[title=\"Sprzęt biurowy\"]")
    private WebElement firmaPodkategoriaSprzetBiurowy;

    @FindBy(css = "a[title=\"Przemysł\"]")
    private WebElement firmaPodkategoriaPrzemysl;

    @FindBy(css = "a[title=\"Materiały i akcesoria\"]")
    private WebElement firmaPodkategoriaMaterialyiAkcesoria;

    @FindBy(css = "a[title=\"Maszyny i urządzenia\"]")
    private WebElement firmaPodkategoriaMaszynyiUrzadzenia;

    @FindBy(css = "a[title=\"Odzież robocza i BHP\"]")
    private WebElement firmaPodkategoriaOdziezRoboczaiBHP;

    @FindBy(css = "a[title=\"Wyposażenie pomieszczeń\"]")
    private WebElement firmaPodkategoriaWyposazeniePomieszczen;

    @FindBy(css = "a[title=\"Folia stretch\"]")
    private WebElement firmaPodkategoriaFoliaStretch;

    @FindBy(css = "a[title=\"Fotele biurowe\"]")
    private WebElement firmaPodkategoriaFoteleBiurowe;

    @FindBy(css = "a[title=\"Artykuły piśmiennicze\"]")
    private WebElement firmaPodkategoriaArtykulyPismiennicze;

    @FindBy(css = "a[title=\"Sprzęt do prezentacji\"]")
    private WebElement firmaPodkategoriaSprzetDoPrezentacji;

    @FindBy(css = "a[title=\"Akcesoria biurowe\"]")
    private WebElement firmaPodkategoriaAkcesoriaBiurowe;

    @FindBy(css = "a[title=\"Zagęszczarki\"]")
    private WebElement firmaPodkategoriaZageszczarki;

    @FindBy(css = "a[title=\"Sklep i magazyn\"]")
    private WebElement firmaPodkategoriaSklepiMagazyn;

    @FindBy(css = "a[title=\"Sprzęt spawalniczy\"]")
    private WebElement firmaPodkategoriaSprzetSpawalniczy;

    @FindBy(css = "a[title=\"Rękawice robocze\"]")
    private WebElement firmaPodkategoriaRekawiceRobocze;

    @FindBy(css = "a[title=\"Regały\"]")
    private WebElement firmaPodkategoriaRegaly;


    public WebElement getfirmaPodkategoriaFirma() {

        return firmaPodkategoriaFirma;
    }

    public WebElement getFirmaPodkategoriaBiuroiReklama() {
        return firmaPodkategoriaBiuroiReklama;
    }

    public WebElement getFirmaPodkategoriaPakowanieiWysylka() {
        return firmaPodkategoriaPakowanieiWysylka;
    }

    public WebElement getFirmaPodkategoriaReklama() {
        return firmaPodkategoriaReklama;
    }

    public WebElement getFirmaPodkategoriaMebleBiurowe() {
        return firmaPodkategoriaMebleBiurowe;
    }

    public WebElement getFirmaPodkategoriaSprzetBiurowy() {
        return firmaPodkategoriaSprzetBiurowy;
    }

    public WebElement getFirmaPodkategoriaPrzemysl() {
        return firmaPodkategoriaPrzemysl;
    }

    public WebElement getFirmaPodkategoriaMaterialyiAkcesoria() {
        return firmaPodkategoriaMaterialyiAkcesoria;
    }

    public WebElement getFirmaPodkategoriaMaszynyiUrzadzenia() {
        return firmaPodkategoriaMaszynyiUrzadzenia;
    }

    public WebElement getFirmaPodkategoriaOdziezRoboczaiBHP() {
        return firmaPodkategoriaOdziezRoboczaiBHP;
    }

    public WebElement getFirmaPodkategoriaWyposazeniePomieszczen() {
        return firmaPodkategoriaWyposazeniePomieszczen;
    }

    public WebElement getFirmaPodkategoriaFoliaStretch() {
        return firmaPodkategoriaFoliaStretch;
    }

    public WebElement getFirmaPodkategoriaFoteleBiurowe() {
        return firmaPodkategoriaFoteleBiurowe;
    }

    public WebElement getFirmaPodkategoriaArtykulyPismiennicze() {
        return firmaPodkategoriaArtykulyPismiennicze;
    }

    public WebElement getFirmaPodkategoriaSprzetDoPrezentacji() {
        return firmaPodkategoriaSprzetDoPrezentacji;
    }

    public WebElement getFirmaPodkategoriaAkcesoriaBiurowe() {
        return firmaPodkategoriaAkcesoriaBiurowe;
    }

    public WebElement getFirmaPodkategoriaZageszczarki() {
        return firmaPodkategoriaZageszczarki;
    }

    public WebElement getFirmaPodkategoriaSklepiMagazyn() {
        return firmaPodkategoriaSklepiMagazyn;
    }

    public WebElement getFirmaPodkategoriaSprzetSpawalniczy() {
        return firmaPodkategoriaSprzetSpawalniczy;
    }

    public WebElement getFirmaPodkategoriaRekawiceRobocze() {
        return firmaPodkategoriaRekawiceRobocze;
    }

    public WebElement getFirmaPodkategoriaRegaly() {
        return firmaPodkategoriaRegaly;
    }

    public SubCategory13Page firmaPodkategoriaFirmaClick() {
        firmaPodkategoriaFirma.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaBiuroiReklamaClick() {
        firmaPodkategoriaBiuroiReklama.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaPakowanieiWysylkaClick() {
        firmaPodkategoriaPakowanieiWysylka.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaReklamaClick() {
        firmaPodkategoriaReklama.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaMebleBiuroweClick() {
        firmaPodkategoriaMebleBiurowe.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaSprzetBiurowyClick() {
        firmaPodkategoriaSprzetBiurowy.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaPrzemyslClick() {
        firmaPodkategoriaPrzemysl.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaMaterialyiAkcesoriaClick() {
        firmaPodkategoriaMaterialyiAkcesoria.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaMaszynyiUrzadzeniaClick() {
        firmaPodkategoriaMaszynyiUrzadzenia.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaOdziezRoboczaiBHPClick() {
        firmaPodkategoriaOdziezRoboczaiBHP.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaWyposazeniePomieszczenClick() {
        firmaPodkategoriaWyposazeniePomieszczen.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaFoliaStretchClick() {
        firmaPodkategoriaFoliaStretch.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaFoteleBiuroweClick() {
        firmaPodkategoriaFoteleBiurowe.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaArtykulyPismienniczeClick() {
        firmaPodkategoriaArtykulyPismiennicze.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaSprzetDoPrezentacjiClick() {
        firmaPodkategoriaSprzetDoPrezentacji.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaAkcesoriaBiuroweClick() {
        firmaPodkategoriaAkcesoriaBiurowe.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaZageszczarkiClick() {
        firmaPodkategoriaZageszczarki.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaSklepiMagazynClick() {
        firmaPodkategoriaSklepiMagazyn.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaSprzetSpawalniczyClick() {
        firmaPodkategoriaSprzetSpawalniczy.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaRekawiceRoboczeClick() {
        firmaPodkategoriaRekawiceRobocze.click();
        return this;
    }

    public SubCategory13Page firmaPodkategoriaRegalyClick() {
        firmaPodkategoriaRegaly.click();
        return this;
    }
}

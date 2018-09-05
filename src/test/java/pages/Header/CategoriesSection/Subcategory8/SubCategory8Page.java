package pages.Header.CategoriesSection.Subcategory8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory8Page extends BasePage {

    WebDriver driver;

    public SubCategory8Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Kultura i rozrywka subcategory


    @FindBy(css = "a[title=\"Bilety\"]")
    private WebElement kulturaiRozrywkaPodkategoriaBilety;

    @FindBy(css = "a[title=\"Filmy\"]")
    private WebElement kulturaiRozrywkaPodkategoriaFilmy;

    @FindBy(css = "a[title=\"Gry\"]")
    private WebElement kulturaiRozrywkaPodkategoriaGry;

    @FindBy(css = "a[title=\"Instrumenty\"]")
    private WebElement kulturaiRozrywkaPodkategoriaInstrumenty;

    @FindBy(css = "a[title=\"Książki i Komiksy\"]")
    private WebElement kulturaiRozrywkaPodkategoriaKsiazkiiKomiksy;

    @FindBy(css = "a[title=\"Podręczniki szkolne\"]")
    private WebElement kulturaiRozrywkaPodkategoriaPodrecznikiSzkolne;

    @FindBy(css = "a[title=\"Muzyka\"]")
    private WebElement kulturaiRozrywkaPodkategoriaMuzyka;

    @FindBy(css = "a[title=\"Muzyka dla dzieci\"]")
    private WebElement kulturaiRozrywkaPodkategoriaMuzykaDlaDzieci;

    @FindBy(css = "a[title=\"Ebooki\"]")
    private WebElement kulturaiRozrywkaPodkategoriaEbooki;

    @FindBy(css = "a[title=\"Audiobooki na CD\"]")
    private WebElement kulturaiRozrywkaPodkategoriaAudiobookiNaCD;

    @FindBy(css = "a[title=\"Gry komputerowe PC\"]")
    private WebElement kulturaiRozrywkaPodkategoriaGrykomputerowePC;

    @FindBy(css = "a[title=\"Gry na konsole\"]")
    private WebElement kulturaiRozrywkaPodkategoriaGryNaKonsole;

    @FindBy(css = "a[title=\"Gry na Xbox One\"]")
    private WebElement kulturaiRozrywkaPodkategoriaGryNaXboxOne;

    @FindBy(css = "a[title=\"Gry planszowe\"]")
    private WebElement kulturaiRozrywkaPodkategoriaGryPlanszowe;

    @FindBy(css = "a[title=\"Rock\"]")
    private WebElement kulturaiRozrywkaPodkategoriaRock;

    @FindBy(css = "a[title=\"Pop\"]")
    private WebElement kulturaiRozrywkaPodkategoriaPop;

    @FindBy(css = "a[title=\"Płyty winylowe\"]")
    private WebElement kulturaiRozrywkaPodkategoriaPlytyWinylowe;

    @FindBy(css = "a[title=\"Filmy na DVD\"]")
    private WebElement kulturaiRozrywkaPodkategoriaFilmyNaDVD;

    @FindBy(css = "a[title=\"Filmy na Blu-ray\"]")
    private WebElement kulturaiRozrywkaPodkategoriaFilmyNaBluray;

    @FindBy(css = "a[title=\"Poradniki i albumy\"]")
    private WebElement kulturaiRozrywkaPodkategoriaPoradnikiiAlbumy;


    public WebElement getkulturaiRozrywkaPodkategoriaBilety() {

        return kulturaiRozrywkaPodkategoriaBilety;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaFilmy() {
        return kulturaiRozrywkaPodkategoriaFilmy;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaGry() {
        return kulturaiRozrywkaPodkategoriaGry;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaInstrumenty() {
        return kulturaiRozrywkaPodkategoriaInstrumenty;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaKsiazkiiKomiksy() {
        return kulturaiRozrywkaPodkategoriaKsiazkiiKomiksy;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaPodrecznikiSzkolne() {
        return kulturaiRozrywkaPodkategoriaPodrecznikiSzkolne;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaMuzyka() {
        return kulturaiRozrywkaPodkategoriaMuzyka;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaMuzykaDlaDzieci() {
        return kulturaiRozrywkaPodkategoriaMuzykaDlaDzieci;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaEbooki() {
        return kulturaiRozrywkaPodkategoriaEbooki;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaAudiobookiNaCD() {
        return kulturaiRozrywkaPodkategoriaAudiobookiNaCD;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaGrykomputerowePC() {
        return kulturaiRozrywkaPodkategoriaGrykomputerowePC;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaGryNaKonsole() {
        return kulturaiRozrywkaPodkategoriaGryNaKonsole;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaGryNaXboxOne() {
        return kulturaiRozrywkaPodkategoriaGryNaXboxOne;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaGryPlanszowe() {
        return kulturaiRozrywkaPodkategoriaGryPlanszowe;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaRock() {
        return kulturaiRozrywkaPodkategoriaRock;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaPop() {
        return kulturaiRozrywkaPodkategoriaPop;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaPlytyWinylowe() {
        return kulturaiRozrywkaPodkategoriaPlytyWinylowe;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaFilmyNaDVD() {
        return kulturaiRozrywkaPodkategoriaFilmyNaDVD;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaFilmyNaBluray() {
        return kulturaiRozrywkaPodkategoriaFilmyNaBluray;
    }

    public WebElement getKulturaiRozrywkaPodkategoriaPoradnikiiAlbumy() {
        return kulturaiRozrywkaPodkategoriaPoradnikiiAlbumy;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaBiletyClick() {
        kulturaiRozrywkaPodkategoriaBilety.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaFilmyClick() {
        kulturaiRozrywkaPodkategoriaFilmy.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaGryClick() {
        kulturaiRozrywkaPodkategoriaGry.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaInstrumentyClick() {
        kulturaiRozrywkaPodkategoriaInstrumenty.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaKsiazkiiKomiksyClick() {
        kulturaiRozrywkaPodkategoriaKsiazkiiKomiksy.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaPodrecznikiSzkolneClick() {
        kulturaiRozrywkaPodkategoriaPodrecznikiSzkolne.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaMuzykaClick() {
        kulturaiRozrywkaPodkategoriaMuzyka.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaMuzykaDlaDzieciClick() {
        kulturaiRozrywkaPodkategoriaMuzykaDlaDzieci.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaEbookiClick() {
        kulturaiRozrywkaPodkategoriaEbooki.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaAudiobookiNaCDClick() {
        kulturaiRozrywkaPodkategoriaAudiobookiNaCD.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaGrykomputerowePCClick() {
        kulturaiRozrywkaPodkategoriaGrykomputerowePC.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaGryNaKonsoleClick() {
        kulturaiRozrywkaPodkategoriaGryNaKonsole.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaGryNaXboxOneClick() {
        kulturaiRozrywkaPodkategoriaGryNaXboxOne.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaGryPlanszoweClick() {
        kulturaiRozrywkaPodkategoriaGryPlanszowe.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaRockClick() {
        kulturaiRozrywkaPodkategoriaRock.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaPopClick() {
        kulturaiRozrywkaPodkategoriaPop.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaPlytyWinyloweClick() {
        kulturaiRozrywkaPodkategoriaPlytyWinylowe.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaFilmyNaDVDClick() {
        kulturaiRozrywkaPodkategoriaFilmyNaDVD.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaFilmyNaBlurayClick() {
        kulturaiRozrywkaPodkategoriaFilmyNaBluray.click();
        return this;
    }

    public SubCategory8Page kulturaiRozrywkaPodkategoriaPoradnikiiAlbumyClick() {
        kulturaiRozrywkaPodkategoriaPoradnikiiAlbumy.click();
        return this;
    }
}

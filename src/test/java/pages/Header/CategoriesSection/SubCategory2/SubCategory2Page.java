package pages.Header.CategoriesSection.SubCategory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory2Page extends BasePage {

    WebDriver driver;

    public SubCategory2Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Moda subcategory



    @FindBy(css = "a[title=\"Odzież, Obuwie, Dodatki\"]")
    private WebElement modaPodkategoriaOdziezObuwieDodatki;

    @FindBy(css = "a[title=\"Odzież damska\"]")
    private WebElement modaPodkategoriaOdzieDamska;

    @FindBy(css = "a[title=\"Bielizna damska\"]")
    private WebElement modaPodkategoriaBieliznaDamska;

    @FindBy(css = "a[title=\"Odziez meska\"]")
    private WebElement modaPodkategoriaOdziezMeska;

    @FindBy(css = "a[title=\"Bielizna meska\"]")
    private WebElement modaPodkategoriaBieliznaMeska;

    @FindBy(css = "a[title=\"Buty\"]")
    private WebElement modaPodkategoriaButy;

    @FindBy(css = "a[title=\"Galanteria i dodatki\"]")
    private WebElement modaPodkategoriaGalanteriaiDodatki;

    @FindBy(css = "a[title=\"Biżuteria i zegarki\"]")
    private WebElement modaPodkategoriaBizuteriaiZegarki;

    @FindBy(css = "a[title=\"Sukienki\"]")
    private WebElement modaPodkategoriaSukienki;

    @FindBy(css = "a[title=\"Stroje kąpielowe\"]")
    private WebElement modaPodkategoriaStrojeKapielowe;

    @FindBy(css = "a[title=\"Sandały damskie\"]")
    private WebElement modaPodkategoriaSandalyDamskie;

    @FindBy(css = "a[title=\"Trampki\"]")
    private WebElement modaPodkategoriaTrampki;

    @FindBy(css = "a[title=\"Modowe okazje\"]")
    private WebElement modaPodkategoriaModoweOkazje;

    @FindBy(css = "a[title=\"Outlet\"]")
    private WebElement modaPodkategoriaOutlet;

    @FindBy(css = "a[title=\"Markowe używane\"]")
    private WebElement modaPodkategoriaMarkoweUzywane;

    @FindBy(css = "a[title=\"Moda Plus Size\"]")
    private WebElement modaPodkategoriaModaPlusSize;

    @FindBy(css = "a[title=\"Ślub i wesele\"]")
    private WebElement modaPodkategoriaSlubiWesele;

    @FindBy(css = "a[title=\"Puccini\"]")
    private WebElement modaPodkategoriaPuccini;

    @FindBy(css = "a[title=\"TXM Textil Market\"]")
    private WebElement modaPodkategoriaTXMTextilMarket;

    @FindBy(css = "a[title=\"Zobacz więcej marek\"]")
    private WebElement modaPodkategoriaZobaczWiecejMarek;

    public WebElement getModaPodkategoriaOdzieDamska() {
        return modaPodkategoriaOdzieDamska;
    }

    public WebElement getModaPodkategoriaBieliznaDamska() {
        return modaPodkategoriaBieliznaDamska;
    }

    public WebElement getModaPodkategoriaOdziezMeska() {
        return modaPodkategoriaOdziezMeska;
    }

    public WebElement getModaPodkategoriaBieliznaMeska() {
        return modaPodkategoriaBieliznaMeska;
    }

    public WebElement getModaPodkategoriaButy() {
        return modaPodkategoriaButy;
    }

    public WebElement getModaPodkategoriaGalanteriaiDodatki() {
        return modaPodkategoriaGalanteriaiDodatki;
    }

    public WebElement getModaPodkategoriaBizuteriaiZegarki() {
        return modaPodkategoriaBizuteriaiZegarki;
    }

    public WebElement getModaPodkategoriaSukienki() {
        return modaPodkategoriaSukienki;
    }

    public WebElement getModaPodkategoriaStrojeKapielowe() {
        return modaPodkategoriaStrojeKapielowe;
    }

    public WebElement getModaPodkategoriaSandalyDamskie() {
        return modaPodkategoriaSandalyDamskie;
    }

    public WebElement getModaPodkategoriaTrampki() {
        return modaPodkategoriaTrampki;
    }

    public WebElement getModaPodkategoriaModoweOkazje() {
        return modaPodkategoriaModoweOkazje;
    }

    public WebElement getModaPodkategoriaOutlet() {
        return modaPodkategoriaOutlet;
    }

    public WebElement getModaPodkategoriaMarkoweUzywane() {
        return modaPodkategoriaMarkoweUzywane;
    }

    public WebElement getModaPodkategoriaModaPlusSize() {
        return modaPodkategoriaModaPlusSize;
    }

    public WebElement getModaPodkategoriaSlubiWesele() {
        return modaPodkategoriaSlubiWesele;
    }

    public WebElement getModaPodkategoriaPuccini() {
        return modaPodkategoriaPuccini;
    }

    public WebElement getModaPodkategoriaTXMTextilMarket() {
        return modaPodkategoriaTXMTextilMarket;
    }

    public WebElement getModaPodkategoriaZobaczWiecejMarek() {
        return modaPodkategoriaZobaczWiecejMarek;
    }

    public SubCategory2Page modaPodkategoriaOdzieDamskaClick() {
        modaPodkategoriaOdzieDamska.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaBieliznaDamskaClick() {
        modaPodkategoriaBieliznaDamska.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaOdziezMeskaClick() {
        modaPodkategoriaOdziezMeska.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaBieliznaMeskaClick() {
        modaPodkategoriaBieliznaMeska.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaButyClick() {
        modaPodkategoriaButy.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaGalanteriaiDodatkiClick() {
        modaPodkategoriaGalanteriaiDodatki.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaBizuteriaiZegarkiClick() {
        modaPodkategoriaBizuteriaiZegarki.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaSukienkiClick() {
        modaPodkategoriaSukienki.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaStrojeKapieloweClick() {
        modaPodkategoriaStrojeKapielowe.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaSandalyDamskieClick() {
        modaPodkategoriaSandalyDamskie.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaTrampkiClick() {
        modaPodkategoriaTrampki.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaModoweOkazjeClick() {
        modaPodkategoriaModoweOkazje.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaOutletClick() {
        modaPodkategoriaOutlet.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaMarkoweUzywaneClick() {
        modaPodkategoriaMarkoweUzywane.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaModaPlusSizeClick() {
        modaPodkategoriaModaPlusSize.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaSlubiWeseleClick() {
        modaPodkategoriaSlubiWesele.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaPucciniClick() {
        modaPodkategoriaPuccini.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaTXMTextilMarketClick() {
        modaPodkategoriaTXMTextilMarket.click();
        return this;
    }

    public SubCategory2Page modaPodkategoriaZobaczWiecejMarekClick() {
        modaPodkategoriaZobaczWiecejMarek.click();
        return this;
    }

    public WebElement getModaPodkategoriaOdziezObuwieDodatki() {
        return modaPodkategoriaOdziezObuwieDodatki;
    }

    public SubCategory2Page modaPodkategoriaOdziezObuwieDodatkiClick() {
        modaPodkategoriaOdziezObuwieDodatki.click();
        return this;
    }

}

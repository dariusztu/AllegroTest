package pages.Header.CategoriesSection.SubCategory9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory9Page extends BasePage {

    WebDriver driver;

    public SubCategory9Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Sport i turystyka subcategory


    @FindBy(css = "a[title=\"Wakacje\"]")
    private WebElement sportiTurystykaPodkategoriaWakacje;

    @FindBy(css = "a[title=\"Piłka nożna\"]")
    private WebElement sportiTurystykaPodkategoriaPilkaNozna;

    @FindBy(css = "a[title=\"Rowery i akcesoria\"]")
    private WebElement sportiTurystykaPodkategoriaRoweryiAkcesoria;

    @FindBy(css = "a[title=\"Suplementy i odżywki\"]")
    private WebElement sportiTurystykaPodkategoriaSuplementyiOdzywki;

    @FindBy(css = "a[title=\"Siłownia\"]")
    private WebElement sportiTurystykaPodkategoriaSilownia;

    @FindBy(css = "a[title=\"Fitness\"]")
    private WebElement sportiTurystykaPodkategoriaFitness;

    @FindBy(css = "a[title=\"Turystyka\"]")
    private WebElement sportiTurystykaPodkategoriaTurystyka;

    @FindBy(css = "a[title=\"Buty do biegania\"]")
    private WebElement sportiTurystykaPodkategoriaButyDoBiegania;

    @FindBy(css = "a[title=\"Latarki\"]")
    private WebElement sportiTurystykaPodkategoriaLatarki;

    @FindBy(css = "a[title=\"Walizki\"]")
    private WebElement sportiTurystykaPodkategoriaWalizki;

    @FindBy(css = "a[title=\"Wrotki\"]")
    private WebElement sportiTurystykaPodkategoriaWrotki;

    @FindBy(css = "a[title=\"Łyżwy\"]")
    private WebElement sportiTurystykaPodkategoriaLyzwy;

    @FindBy(css = "a[title=\"Kubki termiczne\"]")
    private WebElement sportiTurystykaPodkategoriaKubkiTermiczne;

    @FindBy(css = "a[title=\"Deski snowboardowe\"]")
    private WebElement sportiTurystykaPodkategoriaDeskiSnowboardowe;

    @FindBy(css = "a[title=\"Deskorolki\"]")
    private WebElement sportiTurystykaPodkategoriaDeskorolki;

    @FindBy(css = "a[title=\"Buty do koszykówki\"]")
    private WebElement sportiTurystykaPodkategoriaButyDoKoszykowki;

    @FindBy(css = "a[title=\"Noże i scyzoryki\"]")
    private WebElement sportiTurystykaPodkategoriaNozeiScyzoryki;

    @FindBy(css = "a[title=\"ASG\"]")
    private WebElement sportiTurystykaPodkategoriaASG;

    public WebElement getsportiTurystykaPodkategoriaWakacje() {

        return sportiTurystykaPodkategoriaWakacje;
    }

    public WebElement getSportiTurystykaPodkategoriaPilkaNozna() {
        return sportiTurystykaPodkategoriaPilkaNozna;
    }

    public WebElement getSportiTurystykaPodkategoriaRoweryiAkcesoria() {
        return sportiTurystykaPodkategoriaRoweryiAkcesoria;
    }

    public WebElement getSportiTurystykaPodkategoriaSuplementyiOdzywki() {
        return sportiTurystykaPodkategoriaSuplementyiOdzywki;
    }

    public WebElement getSportiTurystykaPodkategoriaSilownia() {
        return sportiTurystykaPodkategoriaSilownia;
    }

    public WebElement getSportiTurystykaPodkategoriaFitness() {
        return sportiTurystykaPodkategoriaFitness;
    }

    public WebElement getSportiTurystykaPodkategoriaTurystyka() {
        return sportiTurystykaPodkategoriaTurystyka;
    }

    public WebElement getSportiTurystykaPodkategoriaButyDoBiegania() {
        return sportiTurystykaPodkategoriaButyDoBiegania;
    }

    public WebElement getSportiTurystykaPodkategoriaLatarki() {
        return sportiTurystykaPodkategoriaLatarki;
    }

    public WebElement getSportiTurystykaPodkategoriaWalizki() {
        return sportiTurystykaPodkategoriaWalizki;
    }

    public WebElement getSportiTurystykaPodkategoriaWrotki() {
        return sportiTurystykaPodkategoriaWrotki;
    }

    public WebElement getSportiTurystykaPodkategoriaLyzwy() {
        return sportiTurystykaPodkategoriaLyzwy;
    }

    public WebElement getSportiTurystykaPodkategoriaKubkiTermiczne() {
        return sportiTurystykaPodkategoriaKubkiTermiczne;
    }

    public WebElement getSportiTurystykaPodkategoriaDeskiSnowboardowe() {
        return sportiTurystykaPodkategoriaDeskiSnowboardowe;
    }

    public WebElement getSportiTurystykaPodkategoriaDeskorolki() {
        return sportiTurystykaPodkategoriaDeskorolki;
    }

    public WebElement getSportiTurystykaPodkategoriaButyDoKoszykowki() {
        return sportiTurystykaPodkategoriaButyDoKoszykowki;
    }

    public WebElement getSportiTurystykaPodkategoriaNozeiScyzoryki() {
        return sportiTurystykaPodkategoriaNozeiScyzoryki;
    }

    public WebElement getSportiTurystykaPodkategoriaASG() {
        return sportiTurystykaPodkategoriaASG;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaWakacjeClick() {
        sportiTurystykaPodkategoriaWakacje.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaPilkaNoznaClick() {
        sportiTurystykaPodkategoriaPilkaNozna.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaRoweryiAkcesoriaClick() {
        sportiTurystykaPodkategoriaRoweryiAkcesoria.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaSuplementyiOdzywkiClick() {
        sportiTurystykaPodkategoriaSuplementyiOdzywki.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaSilowniaClick() {
        sportiTurystykaPodkategoriaSilownia.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaFitnessClick() {
        sportiTurystykaPodkategoriaFitness.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaTurystykaClick() {
        sportiTurystykaPodkategoriaTurystyka.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaButyDoBieganiaClick() {
        sportiTurystykaPodkategoriaButyDoBiegania.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaLatarkiClick() {
        sportiTurystykaPodkategoriaLatarki.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaWalizkiClick() {
        sportiTurystykaPodkategoriaWalizki.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaWrotkiClick() {
        sportiTurystykaPodkategoriaWrotki.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaLyzwyClick() {
        sportiTurystykaPodkategoriaLyzwy.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaKubkiTermiczneClick() {
        sportiTurystykaPodkategoriaKubkiTermiczne.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaDeskiSnowboardoweClick() {
        sportiTurystykaPodkategoriaDeskiSnowboardowe.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaDeskorolkiClick() {
        sportiTurystykaPodkategoriaDeskorolki.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaButyDoKoszykowkiClick() {
        sportiTurystykaPodkategoriaButyDoKoszykowki.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaNozeiScyzorykiClick() {
        sportiTurystykaPodkategoriaNozeiScyzoryki.click();
        return this;
    }

    public SubCategory9Page sportiTurystykaPodkategoriaASGClick() {
        sportiTurystykaPodkategoriaASG.click();
        return this;
    }
}

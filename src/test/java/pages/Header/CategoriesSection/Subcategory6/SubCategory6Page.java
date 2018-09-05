package pages.Header.CategoriesSection.SubCategory6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory6Page extends BasePage {

    WebDriver driver;

    public SubCategory6Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Uroda subcategory



    @FindBy(css = "a[title=\"Pielęgnacja\"]")
    private WebElement urodaPodkategoriaPielegnacja;

    @FindBy(css = "a[title=\"Kremy do twarzy\"]")
    private WebElement urodaPodkategoriaKremyDoTwarzy;

    @FindBy(css = "a[title=\"Kremy pod oczy\"]")
    private WebElement urodaPodkategoriaKremyPodOczy;

    @FindBy(css = "a[title=\"Oczyszczanie i demakijaż\"]")
    private WebElement urodaPodkategoriaOczyszczanieiDemakijaz;

    @FindBy(css = "a[title=\"Kąpiel i prysznic\"]")
    private WebElement urodaPodkategoriaKapieliPrysznic;

    @FindBy(css = "a[title=\"Makijaż\"]")
    private WebElement urodaPodkategoriaMakijaz;

    @FindBy(css = "a[title=\"Tusze do rzęs\"]")
    private WebElement urodaPodkategoriaTuszeDoRzes;

    @FindBy(css = "a[title=\"Podkłady\"]")
    private WebElement urodaPodkategoriaPodklady;

    @FindBy(css = "a[title=\"Pędzle do makijażu\"]")
    private WebElement urodaPodkategoriaPedzleDoMakijazu;

    @FindBy(css = "a[title=\"Manicure i pedicure\"]")
    private WebElement urodaPodkategoriaManicureiPedicure;

    @FindBy(css = "a[title=\"Lakiery hybrydowe\"]")
    private WebElement urodaPodkategoriaLakieryHybyrdowe;

    @FindBy(css = "a[title=\"Frezarki do paznokci\"]")
    private WebElement urodaPodkategoriaFrezarkiDoPaznocki;

    @FindBy(css = "a[title=\"Lampy UV i LED\"]")
    private WebElement urodaPodkategoriaLampyUViLED;

    @FindBy(css = "a[title=\"Perfumy\"]")
    private WebElement urodaPodkategoriaPerfumy;

    @FindBy(css = "a[title=\"Zapachy dla kobiet\"]")
    private WebElement urodaPodkategoriaZapachyDlaKobiet;

    @FindBy(css = "a[title=\"Zapachy dla mężczyzn\"]")
    private WebElement urodaPodkategoriaZapachyDlaMezczyzn;

    @FindBy(css = "a[title=\"Kosmetyki do opalania\"]")
    private WebElement urodaPodkategoriaKosmetykiDoOpalania;

    @FindBy(css = "a[title=\"Odżywki do rzęs\"]")
    private WebElement urodaPodkategoriaOdzywkiDoRzes;

    @FindBy(css = "a[title=\"Pielęgnacji brody i wąsów\"]")
    private WebElement urodaPodkategoriaPielegnacjiBrodyiWlosow;

    @FindBy(css = "a[title=\"Golenie\"]")
    private WebElement urodaPodkategoriaGolenie;

    


    public WebElement geturodaPodkategoriaPielegnacja() {

        return urodaPodkategoriaPielegnacja;
    }

    public WebElement getUrodaPodkategoriaKremyDoTwarzy() {
        return urodaPodkategoriaKremyDoTwarzy;
    }

    public WebElement getUrodaPodkategoriaKremyPodOczy() {
        return urodaPodkategoriaKremyPodOczy;
    }

    public WebElement getUrodaPodkategoriaOczyszczanieiDemakijaz() {
        return urodaPodkategoriaOczyszczanieiDemakijaz;
    }

    public WebElement getUrodaPodkategoriaKapieliPrysznic() {
        return urodaPodkategoriaKapieliPrysznic;
    }

    public WebElement getUrodaPodkategoriaMakijaz() {
        return urodaPodkategoriaMakijaz;
    }

    public WebElement getUrodaPodkategoriaTuszeDoRzes() {
        return urodaPodkategoriaTuszeDoRzes;
    }

    public WebElement getUrodaPodkategoriaPodklady() {
        return urodaPodkategoriaPodklady;
    }

    public WebElement getUrodaPodkategoriaPedzleDoMakijazu() {
        return urodaPodkategoriaPedzleDoMakijazu;
    }

    public WebElement getUrodaPodkategoriaManicureiPedicure() {
        return urodaPodkategoriaManicureiPedicure;
    }

    public WebElement getUrodaPodkategoriaLakieryHybyrdowe() {
        return urodaPodkategoriaLakieryHybyrdowe;
    }

    public WebElement getUrodaPodkategoriaFrezarkiDoPaznocki() {
        return urodaPodkategoriaFrezarkiDoPaznocki;
    }

    public WebElement getUrodaPodkategoriaLampyUViLED() {
        return urodaPodkategoriaLampyUViLED;
    }

    public WebElement getUrodaPodkategoriaPerfumy() {
        return urodaPodkategoriaPerfumy;
    }

    public WebElement getUrodaPodkategoriaZapachyDlaKobiet() {
        return urodaPodkategoriaZapachyDlaKobiet;
    }

    public WebElement getUrodaPodkategoriaZapachyDlaMezczyzn() {
        return urodaPodkategoriaZapachyDlaMezczyzn;
    }

    public WebElement getUrodaPodkategoriaKosmetykiDoOpalania() {
        return urodaPodkategoriaKosmetykiDoOpalania;
    }

    public WebElement getUrodaPodkategoriaOdzywkiDoRzes() {
        return urodaPodkategoriaOdzywkiDoRzes;
    }

    public WebElement getUrodaPodkategoriaPielegnacjiBrodyiWlosow() {
        return urodaPodkategoriaPielegnacjiBrodyiWlosow;
    }

    public WebElement getUrodaPodkategoriaGolenie() {
        return urodaPodkategoriaGolenie;
    }

    public SubCategory6Page urodaPodkategoriaPielegnacjaClick() {
        urodaPodkategoriaPielegnacja.click();
        return this;
    }

    public SubCategory6Page urodaPodkategoriaKremyDoTwarzyClick() {
         urodaPodkategoriaKremyDoTwarzy.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaKremyPodOczyClick() {
         urodaPodkategoriaKremyPodOczy.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaOczyszczanieiDemakijazClick() {
         urodaPodkategoriaOczyszczanieiDemakijaz.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaKapieliPrysznicClick() {
         urodaPodkategoriaKapieliPrysznic.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaMakijazClick() {
         urodaPodkategoriaMakijaz.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaTuszeDoRzesClick() {
         urodaPodkategoriaTuszeDoRzes.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaPodkladyClick() {
         urodaPodkategoriaPodklady.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaPedzleDoMakijazuClick() {
         urodaPodkategoriaPedzleDoMakijazu.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaManicureiPedicureClick() {
         urodaPodkategoriaManicureiPedicure.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaLakieryHybyrdoweClick() {
         urodaPodkategoriaLakieryHybyrdowe.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaFrezarkiDoPaznockiClick() {
         urodaPodkategoriaFrezarkiDoPaznocki.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaLampyUViLEDClick() {
         urodaPodkategoriaLampyUViLED.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaPerfumyClick() {
         urodaPodkategoriaPerfumy.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaZapachyDlaKobietClick() {
         urodaPodkategoriaZapachyDlaKobiet.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaZapachyDlaMezczyznClick() {
         urodaPodkategoriaZapachyDlaMezczyzn.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaKosmetykiDoOpalaniaClick() {
         urodaPodkategoriaKosmetykiDoOpalania.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaOdzywkiDoRzesClick() {
         urodaPodkategoriaOdzywkiDoRzes.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaPielegnacjiBrodyiWlosowClick() {
         urodaPodkategoriaPielegnacjiBrodyiWlosow.click();
    return this;
    }

    public SubCategory6Page urodaPodkategoriaGolenieClick() {
         urodaPodkategoriaGolenie.click();
    return this;
    }
}

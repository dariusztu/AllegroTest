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


    @FindBy(css = "a[title=\"Części samochodowe\"]")
    private WebElement motoryzacjaPodkategoriaCzesciSamochodowe;

    @FindBy(css = "a[title=\"Opony letnie\"]")
    private WebElement motoryzacjaPodkategoriaOponyLetnie;

    @FindBy(css = "a[title=\"Opony całoroczne\"]")
    private WebElement motoryzacjaPodkategoriaOponyCaloroczne;

    @FindBy(css = "a[title=\"Felgi aluminiowe\"]")
    private WebElement motoryzacjaPodkategoriaFelgiAluminiowe;

    @FindBy(css = "a[title=\"Akcesoria samochodowe\"]")
    private WebElement motoryzacjaPodkategoriaAkcesoriaSamochodowe;

    @FindBy(css = "a[title=\"Narzędzia i sprzęt warsztatowy\"]")
    private WebElement motoryzacjaPodkategoriaNarzedziaiSprzetWarsztatowy;

    @FindBy(css = "a[title=\"Chemia\"]")
    private WebElement motoryzacjaPodkategoriaChemia;

    @FindBy(css = "a[title=\"Części motocyklowe\"]")
    private WebElement motoryzacjaPodkategoriaCzesciMotocyklowe;

    @FindBy(css = "a[title=\"Odzież motocyklowa\"]")
    private WebElement motoryzacjaPodkategoriaOdziezMotocyklowa;

    @FindBy(css = "a[title=\"Części do maszyn\"]")
    private WebElement motoryzacjaPodkategoriaCzesciDoMaszyn;

    @FindBy(css = "a[title=\"Części karoserii\"]")
    private WebElement motoryzacjaPodkategoriaCzesciKaroserii;

    @FindBy(css = "a[title=\"Alkomaty\"]")
    private WebElement motoryzacjaPodkategoriaAlkomaty;

    @FindBy(css = "a[title=\"Kamery samochodowe\"]")
    private WebElement motoryzacjaPodkategoriaKamerySamochodowe;

    @FindBy(css = "a[title=\"Dywaniki\"]")
    private WebElement motoryzacjaPodkategoriaDywaniki;

    @FindBy(css = "a[title=\"Pokrowce\"]")
    private WebElement motoryzacjaPodkategoriaPokrowce;

    @FindBy(css = "a[title=\"Bagażniki i uchwyty\"]")
    private WebElement motoryzacjaPodkategoriaBagaznikiiUchwyty;

    @FindBy(css = "a[title=\"Oleje silnikowe\"]")
    private WebElement motoryzacjaPodkategoriaOlejeSilnikowe;

    @FindBy(css = "a[title=\"Samochody\"]")
    private WebElement motoryzacjaPodkategoriaSamochody;

    @FindBy(css = "a[title=\"Motocykle i quady\"]")
    private WebElement motoryzacjaPodkategoriaMotocykleiQuady;

    @FindBy(css = "a[title=\"Maszyny\"]")
    private WebElement motoryzacjaPodkategoriaMaszyny;


    public WebElement getmotoryzacjaPodkategoriaCzesciSamochodowe() {

        return motoryzacjaPodkategoriaCzesciSamochodowe;
    }

    public WebElement getMotoryzacjaPodkategoriaOponyLetnie() {
        return motoryzacjaPodkategoriaOponyLetnie;
    }

    public WebElement getMotoryzacjaPodkategoriaOponyCaloroczne() {
        return motoryzacjaPodkategoriaOponyCaloroczne;
    }

    public WebElement getMotoryzacjaPodkategoriaFelgiAluminiowe() {
        return motoryzacjaPodkategoriaFelgiAluminiowe;
    }

    public WebElement getMotoryzacjaPodkategoriaAkcesoriaSamochodowe() {
        return motoryzacjaPodkategoriaAkcesoriaSamochodowe;
    }

    public WebElement getMotoryzacjaPodkategoriaNarzedziaiSprzetWarsztatowy() {
        return motoryzacjaPodkategoriaNarzedziaiSprzetWarsztatowy;
    }

    public WebElement getMotoryzacjaPodkategoriaChemia() {
        return motoryzacjaPodkategoriaChemia;
    }

    public WebElement getMotoryzacjaPodkategoriaCzesciMotocyklowe() {
        return motoryzacjaPodkategoriaCzesciMotocyklowe;
    }

    public WebElement getMotoryzacjaPodkategoriaOdziezMotocyklowa() {
        return motoryzacjaPodkategoriaOdziezMotocyklowa;
    }

    public WebElement getMotoryzacjaPodkategoriaCzesciDoMaszyn() {
        return motoryzacjaPodkategoriaCzesciDoMaszyn;
    }

    public WebElement getMotoryzacjaPodkategoriaCzesciKaroserii() {
        return motoryzacjaPodkategoriaCzesciKaroserii;
    }

    public WebElement getMotoryzacjaPodkategoriaAlkomaty() {
        return motoryzacjaPodkategoriaAlkomaty;
    }

    public WebElement getMotoryzacjaPodkategoriaKamerySamochodowe() {
        return motoryzacjaPodkategoriaKamerySamochodowe;
    }

    public WebElement getMotoryzacjaPodkategoriaDywaniki() {
        return motoryzacjaPodkategoriaDywaniki;
    }

    public WebElement getMotoryzacjaPodkategoriaPokrowce() {
        return motoryzacjaPodkategoriaPokrowce;
    }

    public WebElement getMotoryzacjaPodkategoriaBagaznikiiUchwyty() {
        return motoryzacjaPodkategoriaBagaznikiiUchwyty;
    }

    public WebElement getMotoryzacjaPodkategoriaOlejeSilnikowe() {
        return motoryzacjaPodkategoriaOlejeSilnikowe;
    }

    public WebElement getMotoryzacjaPodkategoriaSamochody() {
        return motoryzacjaPodkategoriaSamochody;
    }

    public WebElement getMotoryzacjaPodkategoriaMotocykleiQuady() {
        return motoryzacjaPodkategoriaMotocykleiQuady;
    }

    public WebElement getMotoryzacjaPodkategoriaMaszyny() {
        return motoryzacjaPodkategoriaMaszyny;
    }

    public SubCategory10Page motoryzacjaPodkategoriaCzesciSamochodoweClick() {
        motoryzacjaPodkategoriaCzesciSamochodowe.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaOponyLetnieClick() {
        motoryzacjaPodkategoriaOponyLetnie.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaOponyCaloroczneClick() {
        motoryzacjaPodkategoriaOponyCaloroczne.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaFelgiAluminioweClick() {
        motoryzacjaPodkategoriaFelgiAluminiowe.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaAkcesoriaSamochodoweClick() {
        motoryzacjaPodkategoriaAkcesoriaSamochodowe.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaNarzedziaiSprzetWarsztatowyClick() {
        motoryzacjaPodkategoriaNarzedziaiSprzetWarsztatowy.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaChemiaClick() {
        motoryzacjaPodkategoriaChemia.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaCzesciMotocykloweClick() {
        motoryzacjaPodkategoriaCzesciMotocyklowe.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaOdziezMotocyklowaClick() {
        motoryzacjaPodkategoriaOdziezMotocyklowa.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaCzesciDoMaszynClick() {
        motoryzacjaPodkategoriaCzesciDoMaszyn.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaCzesciKaroseriiClick() {
        motoryzacjaPodkategoriaCzesciKaroserii.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaAlkomatyClick() {
        motoryzacjaPodkategoriaAlkomaty.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaKamerySamochodoweClick() {
        motoryzacjaPodkategoriaKamerySamochodowe.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaDywanikiClick() {
        motoryzacjaPodkategoriaDywaniki.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaPokrowceClick() {
        motoryzacjaPodkategoriaPokrowce.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaBagaznikiiUchwytyClick() {
        motoryzacjaPodkategoriaBagaznikiiUchwyty.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaOlejeSilnikoweClick() {
        motoryzacjaPodkategoriaOlejeSilnikowe.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaSamochodyClick() {
        motoryzacjaPodkategoriaSamochody.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaMotocykleiQuadyClick() {
        motoryzacjaPodkategoriaMotocykleiQuady.click();
        return this;
    }

    public SubCategory10Page motoryzacjaPodkategoriaMaszynyClick() {
        motoryzacjaPodkategoriaMaszyny.click();
        return this;
    }
}

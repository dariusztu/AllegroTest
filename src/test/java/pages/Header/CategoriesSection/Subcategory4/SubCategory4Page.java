package pages.Header.CategoriesSection.SubCategory4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory4Page extends BasePage {

    WebDriver driver;

    public SubCategory4Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Supermarket subcategory


    @FindBy(css = "a[title=\"Karma dla psa\"]")
    private WebElement supermarketPodkategoriaKarmaDlaPsa;

    @FindBy(css = "a[title=\"Kojce dla psów\"]")
    private WebElement supermarketPodkategoriaKojceDlaPsow;

    @FindBy(css = "a[title=\"Karma dla kota\"]")
    private WebElement supermarketPodkategoriaKarmaDlaKota;

    @FindBy(css = "a[title=\"Żwirek dla kota\"]")
    private WebElement supermarketPodkategoriaZwirekDlaKota;

    @FindBy(css = "a[title=\"Kuwety dla kotów\"]")
    private WebElement supermarketPodkategoriaKuwetyDlaKotow;

    @FindBy(css = "a[title=\"Akwarystyka\"]")
    private WebElement supermarketPodkategoriaAkwarystyka;

    @FindBy(css = "a[title=\"Mopy\"]")
    private WebElement supermarketPodkategoriaMopy;

    @FindBy(css = "a[title=\"Kosze na śmieci\"]")
    private WebElement supermarketPodkategoriaKoszeNaSmieci;

    @FindBy(css = "a[title=\"Suszarki do prania\"]")
    private WebElement supermarketPodkategoriaSuszarkiDoPrania;

    @FindBy(css = "a[title=\"Tabletki do zmywarek\"]")
    private WebElement supermarketPodkategoriaTabletkiDoZmywarek;

    @FindBy(css = "a[title=\"Delikatesy\"]")
    private WebElement supermarketPodkategoriaDelikatesy;

    @FindBy(css = "a[title=\"Kawy\"]")
    private WebElement supermarketPodkategoriaKawy;

    @FindBy(css = "a[title=\"Herbaty\"]")
    private WebElement supermarketPodkategoriaHerbaty;

    @FindBy(css = "a[title=\"Yerba mate\"]")
    private WebElement supermarketPodkategoriaYerbaMate;

    @FindBy(css = "a[title=\"Dekoracje cukiernicze\"]")
    private WebElement supermarketPodkategoriaDekoracjeCukiernicze;

    @FindBy(css = "a[title=\"Zdrowa żywność\"]")
    private WebElement supermarketPodkategoriaZdrowaZywnosc;

    @FindBy(css = "a[title=\"Żywność ekologiczna\"]")
    private WebElement supermarketPodkategoriaZywnoscEkologiczna;

    @FindBy(css = "a[title=\"Bakalie\"]")
    private WebElement supermarketPodkategoriaBakalie;

    @FindBy(css = "a[title=\"Ksylitol\"]")
    private WebElement supermarketPodkategoriaKsylitol;

    @FindBy(css = "a[title=\"Oleje\"]")
    private WebElement supermarketPodkategoriaOleje;

    public WebElement getSupermarketPodkategoriaKojceDlaPsow() {
        return supermarketPodkategoriaKojceDlaPsow;
    }

    public WebElement getSupermarketPodkategoriaKarmaDlaKota() {
        return supermarketPodkategoriaKarmaDlaKota;
    }

    public WebElement getSupermarketPodkategoriaZwirekDlaKota() {
        return supermarketPodkategoriaZwirekDlaKota;
    }

    public WebElement getSupermarketPodkategoriaKuwetyDlaKotow() {
        return supermarketPodkategoriaKuwetyDlaKotow;
    }

    public WebElement getSupermarketPodkategoriaAkwarystyka() {
        return supermarketPodkategoriaAkwarystyka;
    }

    public WebElement getSupermarketPodkategoriaMopy() {
        return supermarketPodkategoriaMopy;
    }

    public WebElement getSupermarketPodkategoriaKoszeNaSmieci() {
        return supermarketPodkategoriaKoszeNaSmieci;
    }

    public WebElement getSupermarketPodkategoriaSuszarkiDoPrania() {
        return supermarketPodkategoriaSuszarkiDoPrania;
    }

    public WebElement getSupermarketPodkategoriaTabletkiDoZmywarek() {
        return supermarketPodkategoriaTabletkiDoZmywarek;
    }

    public WebElement getSupermarketPodkategoriaDelikatesy() {
        return supermarketPodkategoriaDelikatesy;
    }

    public WebElement getSupermarketPodkategoriaKawy() {
        return supermarketPodkategoriaKawy;
    }

    public WebElement getSupermarketPodkategoriaHerbaty() {
        return supermarketPodkategoriaHerbaty;
    }

    public WebElement getSupermarketPodkategoriaYerbaMate() {
        return supermarketPodkategoriaYerbaMate;
    }

    public WebElement getSupermarketPodkategoriaDekoracjeCukiernicze() {
        return supermarketPodkategoriaDekoracjeCukiernicze;
    }

    public WebElement getSupermarketPodkategoriaZdrowaZywnosc() {
        return supermarketPodkategoriaZdrowaZywnosc;
    }

    public WebElement getSupermarketPodkategoriaZywnoscEkologiczna() {
        return supermarketPodkategoriaZywnoscEkologiczna;
    }

    public WebElement getSupermarketPodkategoriaBakalie() {
        return supermarketPodkategoriaBakalie;
    }

    public WebElement getSupermarketPodkategoriaKsylitol() {
        return supermarketPodkategoriaKsylitol;
    }

    public WebElement getSupermarketPodkategoriaOleje() {
        return supermarketPodkategoriaOleje;
    }

    public WebElement getsupermarketPodkategoriaKarmaDlaPsa() {

        return supermarketPodkategoriaKarmaDlaPsa;
    }

    public SubCategory4Page supermarketPodkategoriaKarmaDlaPsaClick() {
        supermarketPodkategoriaKarmaDlaPsa.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaKojceDlaPsowClick() {
        supermarketPodkategoriaKojceDlaPsow.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaKarmaDlaKotaClick() {
        supermarketPodkategoriaKarmaDlaKota.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaZwirekDlaKotaClick() {
        supermarketPodkategoriaZwirekDlaKota.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaKuwetyDlaKotowClick() {
        supermarketPodkategoriaKuwetyDlaKotow.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaAkwarystykaClick() {
        supermarketPodkategoriaAkwarystyka.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaMopyClick() {
        supermarketPodkategoriaMopy.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaKoszeNaSmieciClick() {
        supermarketPodkategoriaKoszeNaSmieci.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaSuszarkiDoPraniaClick() {
        supermarketPodkategoriaSuszarkiDoPrania.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaTabletkiDoZmywarekClick() {
        supermarketPodkategoriaTabletkiDoZmywarek.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaDelikatesyClick() {
        supermarketPodkategoriaDelikatesy.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaKawyClick() {
        supermarketPodkategoriaKawy.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaHerbatyClick() {
        supermarketPodkategoriaHerbaty.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaYerbaMateClick() {
        supermarketPodkategoriaYerbaMate.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaDekoracjeCukierniczeClick() {
        supermarketPodkategoriaDekoracjeCukiernicze.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaZdrowaZywnoscClick() {
        supermarketPodkategoriaZdrowaZywnosc.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaZywnoscEkologicznaClick() {
        supermarketPodkategoriaZywnoscEkologiczna.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaBakalieClick() {
        supermarketPodkategoriaBakalie.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaKsylitolClick() {
        supermarketPodkategoriaKsylitol.click();
        return this;
    }

    public SubCategory4Page supermarketPodkategoriaOlejeClick() {
        supermarketPodkategoriaOleje.click();
        return this;
    }


    public SubCategory4Page supermarketPodkategoriaKarmaDlaPsaClick() {
        supermarketPodkategoriaKarmaDlaPsa.click();
        return this;
    }

}

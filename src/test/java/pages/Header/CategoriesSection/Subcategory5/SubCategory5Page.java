package pages.Header.CategoriesSection.SubCategory5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory5Page extends BasePage {

    WebDriver driver;

    public SubCategory5Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Dziecko subcategory


    @FindBy(css = "a[title=\"Dla mamy i dziecka\"]")
    private WebElement dzieckoPodkategoriaDlaMamyiDziecka;

    @FindBy(css = "a[title=\"Artykuły szkolne\"]")
    private WebElement dzieckoPodkategoriaArtykulySzkolne;

    @FindBy(css = "a[title=\"Foteliki samochodowe\"]")
    private WebElement dzieckoPodkategoriaFotelikiSamochodowe;

    @FindBy(css = "a[title=\"Karmienie dziecka\"]")
    private WebElement dzieckoPodkategoriaKarmienieDziecka;

    @FindBy(css = "a[title=\"Obuwie\"]")
    private WebElement dzieckoPodkategoriaObuwie;

    @FindBy(css = "a[title=\"Odziez\"]")
    private WebElement dzieckoPodkategoriaOdziez;

    @FindBy(css = "a[title=\"Pokój dziecięcy\"]")
    private WebElement dzieckoPodkategoriaPokojDzieciecy;

    @FindBy(css = "a[title=\"Rowery i pojazdy\"]")
    private WebElement dzieckoPodkategoriaRoweryiPojazdy;

    @FindBy(css = "a[title=\"Wózki\"]")
    private WebElement dzieckoPodkategoriaWozki;

    @FindBy(css = "a[title=\"Zabawki\"]")
    private WebElement dzieckoPodkategoriaZabawki;

    @FindBy(css = "a[title=\"Zabawki ogrodowe\"]")
    private WebElement dzieckoPodkategoriaZabawkiOgrodowe;

    @FindBy(css = "a[title=\"Zdrowie i higiena\"]")
    private WebElement dzieckoPodkategoriaZdrowieiHigiena;

    @FindBy(css = "a[title=\"Zabawki edukacyjne\"]")
    private WebElement dzieckoPodkategoriaZabawkiEdukacyjne;

    @FindBy(css = "a[title=\"Klocki\"]")
    private WebElement dzieckoPodkategoriaKlocki;

    @FindBy(css = "a[title=\"Lalki i akcesoria\"]")
    private WebElement dzieckoPodkategoriaLalkiiAkcesoria;

    @FindBy(css = "a[title=\"Gry dla dzieci\"]")
    private WebElement dzieckoPodkategoriaGryDlaDzieci;

    @FindBy(css = "a[title=\"Kosmetyki dla dzieci\"]")
    private WebElement dzieckoPodkategoriaKosmetykiDlaDzieci;

    @FindBy(css = "a[title=\"Meble dla dzieci\"]")
    private WebElement dzieckoPodkategoriaMebleDlaDzieci;

    @FindBy(css = "a[title=\"Hulajnogi\"]")
    private WebElement dzieckoPodkategoriaHulajnogi;

    @FindBy(css = "a[title=\"Gniotki Squishy\"]")
    private WebElement dzieckoPodkategoriaGniotkiSquishy;

    public WebElement getDzieckoPodkategoriaArtykulySzkolne() {
        return dzieckoPodkategoriaArtykulySzkolne;
    }

    public WebElement getDzieckoPodkategoriaFotelikiSamochodowe() {
        return dzieckoPodkategoriaFotelikiSamochodowe;
    }

    public WebElement getDzieckoPodkategoriaKarmienieDziecka() {
        return dzieckoPodkategoriaKarmienieDziecka;
    }

    public WebElement getDzieckoPodkategoriaObuwie() {
        return dzieckoPodkategoriaObuwie;
    }

    public WebElement getDzieckoPodkategoriaOdziez() {
        return dzieckoPodkategoriaOdziez;
    }

    public WebElement getDzieckoPodkategoriaPokojDzieciecy() {
        return dzieckoPodkategoriaPokojDzieciecy;
    }

    public WebElement getDzieckoPodkategoriaRoweryiPojazdy() {
        return dzieckoPodkategoriaRoweryiPojazdy;
    }

    public WebElement getDzieckoPodkategoriaWozki() {
        return dzieckoPodkategoriaWozki;
    }

    public WebElement getDzieckoPodkategoriaZabawki() {
        return dzieckoPodkategoriaZabawki;
    }

    public WebElement getDzieckoPodkategoriaZabawkiOgrodowe() {
        return dzieckoPodkategoriaZabawkiOgrodowe;
    }

    public WebElement getDzieckoPodkategoriaZdrowieiHigiena() {
        return dzieckoPodkategoriaZdrowieiHigiena;
    }

    public WebElement getDzieckoPodkategoriaZabawkiEdukacyjne() {
        return dzieckoPodkategoriaZabawkiEdukacyjne;
    }

    public WebElement getDzieckoPodkategoriaKlocki() {
        return dzieckoPodkategoriaKlocki;
    }

    public WebElement getDzieckoPodkategoriaLalkiiAkcesoria() {
        return dzieckoPodkategoriaLalkiiAkcesoria;
    }

    public WebElement getDzieckoPodkategoriaGryDlaDzieci() {
        return dzieckoPodkategoriaGryDlaDzieci;
    }

    public WebElement getDzieckoPodkategoriaKosmetykiDlaDzieci() {
        return dzieckoPodkategoriaKosmetykiDlaDzieci;
    }

    public WebElement getDzieckoPodkategoriaMebleDlaDzieci() {
        return dzieckoPodkategoriaMebleDlaDzieci;
    }

    public WebElement getDzieckoPodkategoriaHulajnogi() {
        return dzieckoPodkategoriaHulajnogi;
    }

    public WebElement getDzieckoPodkategoriaGniotkiSquishy() {
        return dzieckoPodkategoriaGniotkiSquishy;
    }

    public WebElement getdzieckoPodkategoriaDlaMamyiDziecka() {

        return dzieckoPodkategoriaDlaMamyiDziecka;
    }

    public SubCategory5Page dzieckoPodkategoriaDlaMamyiDzieckaClick() {
        dzieckoPodkategoriaDlaMamyiDziecka.click();
        return this;
    }

    public SubCategory5Page dzieckoPodkategoriaArtykulySzkolneClick() {
         dzieckoPodkategoriaArtykulySzkolne.click();
    }

    public SubCategory5Page dzieckoPodkategoriaFotelikiSamochodoweClick() {
         dzieckoPodkategoriaFotelikiSamochodowe.click();
    }

    public SubCategory5Page dzieckoPodkategoriaKarmienieDzieckaClick() {
         dzieckoPodkategoriaKarmienieDziecka.click();
    }

    public SubCategory5Page dzieckoPodkategoriaObuwieClick() {
         dzieckoPodkategoriaObuwie.click();
    }

    public SubCategory5Page dzieckoPodkategoriaOdziezClick() {
         dzieckoPodkategoriaOdziez.click();
    }

    public SubCategory5Page dzieckoPodkategoriaPokojDzieciecyClick() {
         dzieckoPodkategoriaPokojDzieciecy.click();
    }

    public SubCategory5Page dzieckoPodkategoriaRoweryiPojazdyClick() {
         dzieckoPodkategoriaRoweryiPojazdy.click();
    }

    public SubCategory5Page dzieckoPodkategoriaWozkiClick() {
         dzieckoPodkategoriaWozki.click();
    }

    public SubCategory5Page dzieckoPodkategoriaZabawkiClick() {
         dzieckoPodkategoriaZabawki.click();
    }

    public SubCategory5Page dzieckoPodkategoriaZabawkiOgrodoweClick() {
         dzieckoPodkategoriaZabawkiOgrodowe.click();
    }

    public SubCategory5Page dzieckoPodkategoriaZdrowieiHigienaClick() {
         dzieckoPodkategoriaZdrowieiHigiena.click();
    }

    public SubCategory5Page dzieckoPodkategoriaZabawkiEdukacyjneClick() {
         dzieckoPodkategoriaZabawkiEdukacyjne.click();
    }

    public SubCategory5Page dzieckoPodkategoriaKlockiClick() {
         dzieckoPodkategoriaKlocki.click();
    }

    public SubCategory5Page dzieckoPodkategoriaLalkiiAkcesoriaClick() {
         dzieckoPodkategoriaLalkiiAkcesoria.click();
    }

    public SubCategory5Page dzieckoPodkategoriaGryDlaDzieciClick() {
         dzieckoPodkategoriaGryDlaDzieci.click();
    }

    public SubCategory5Page dzieckoPodkategoriaKosmetykiDlaDzieciClick() {
         dzieckoPodkategoriaKosmetykiDlaDzieci.click();
    }

    public SubCategory5Page dzieckoPodkategoriaMebleDlaDzieciClick() {
         dzieckoPodkategoriaMebleDlaDzieci.click();
    }

    public SubCategory5Page dzieckoPodkategoriaHulajnogiClick() {
         dzieckoPodkategoriaHulajnogi.click();
    }

    public SubCategory5Page dzieckoPodkategoriaGniotkiSquishyClick() {
         dzieckoPodkategoriaGniotkiSquishy.click();
    }
}

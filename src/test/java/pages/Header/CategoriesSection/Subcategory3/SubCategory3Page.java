package pages.Header.CategoriesSection.Subcategory3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory3Page extends BasePage {

    WebDriver driver;

    public SubCategory3Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Dom i ogrod subcategory


    @FindBy(css = "a[title=\"Odzież, Obuwie, Dodatki\"]")
    private WebElement domiOgrodPodkategoriaBudownictwoiAkcesoria;

    @FindBy(css = "a[title=\"Hydraulika i armatura\"]")
    private WebElement domiOgrodPodkategoriaHydraulikaiArmatura;

    @FindBy(css = "a[title=\"Meble\"]")
    private WebElement domiOgrodPodkategoriaMeble;

    @FindBy(css = "a[title=\"Nieruchomosci\"]")
    private WebElement domiOgrodPodkategoriaNieruchomosci;

    @FindBy(css = "a[title=\"Narzedzia\"]")
    private WebElement domiOgrodPodkategoriaNarzedzia;

    @FindBy(css = "a[title=\"Myjki ciśnieniowe\"]")
    private WebElement domiOgrodPodkategoriaMyjkiCisnieniowe;

    @FindBy(css = "a[title=\"Ogrod\"]")
    private WebElement domiOgrodPodkategoriaOgrod;

    @FindBy(css = "a[title=\"Meble ogrodowe\"]")
    private WebElement domiOgrodPodkategoriaMebleOgrodowe;

    @FindBy(css = "a[title=\"Wyposażenie\"]")
    private WebElement domiOgrodPodkategoriaWyposazenie;


    @FindBy(css = "a[title=\"Lampy\"]")
    private WebElement domiOgrodPodkategoriaLampy;

    @FindBy(css = "a[title=\"Drabiny\"]")
    private WebElement domiOgrodPodkategoriaDrabiny;

    @FindBy(css = "a[title=\"Baterie łazienkowe\"]")
    private WebElement domiOgrodPodkategoriaBaterieLazienkowe;

    @FindBy(css = "a[title=\"Meble kuchenne\"]")
    private WebElement domiOgrodPodkategoriaMebleKuchenne;

    @FindBy(css = "a[title=\"Sypialnia\"]")
    private WebElement domiOgrodPodkategoriaSypialnia;

    @FindBy(css = "a[title=\"Szlifierki i polerki\"]")
    private WebElement domiOgrodPodkategoriaSzlifierkiiPolerki;

    @FindBy(css = "a[title=\"Piły i pilarki\"]")
    private WebElement domiOgrodPodkategoriaPilyiPilarki;

    @FindBy(css = "a[title=\"Kosiarki spalinowe\"]")
    private WebElement domiOgrodPodkategoriaKosiarkiSpalinowe;

    @FindBy(css = "a[title=\"Rośliny\"]")
    private WebElement domiOgrodPodkategoriaRosliny;

    @FindBy(css = "a[title=\"Rolety\"]")
    private WebElement domiOgrodPodkategoriaRolety;

    @FindBy(css = "a[title=\"Garnki i patelnie\"]")
    private WebElement domiOgrodPodkategoriaGarnkiiPatelnie;

    public WebElement getdomiOgrodPodkategoriaBudownictwoiAkcesoria() {

        return domiOgrodPodkategoriaBudownictwoiAkcesoria;
    }

    public SubCategory3Page domiOgrodPodkategoriaGarnkiiPatelnieClick() {
        return this;
    }

    public WebElement getDomiOgrodPodkategoriaHydraulikaiArmatura() {
        return domiOgrodPodkategoriaHydraulikaiArmatura;
    }

    public WebElement getDomiOgrodPodkategoriaMeble() {
        return domiOgrodPodkategoriaMeble;
    }

    public WebElement getDomiOgrodPodkategoriaNieruchomosci() {
        return domiOgrodPodkategoriaNieruchomosci;
    }

    public WebElement getDomiOgrodPodkategoriaNarzedzia() {
        return domiOgrodPodkategoriaNarzedzia;
    }

    public WebElement getDomiOgrodPodkategoriaMyjkiCisnieniowe() {
        return domiOgrodPodkategoriaMyjkiCisnieniowe;
    }

    public WebElement getDomiOgrodPodkategoriaOgrod() {
        return domiOgrodPodkategoriaOgrod;
    }

    public WebElement getDomiOgrodPodkategoriaMebleOgrodowe() {
        return domiOgrodPodkategoriaMebleOgrodowe;
    }

    public WebElement getDomiOgrodPodkategoriaWyposazenie() {
        return domiOgrodPodkategoriaWyposazenie;
    }

    public WebElement getDomiOgrodPodkategoriaLampy() {
        return domiOgrodPodkategoriaLampy;
    }

    public WebElement getDomiOgrodPodkategoriaDrabiny() {
        return domiOgrodPodkategoriaDrabiny;
    }

    public WebElement getDomiOgrodPodkategoriaBaterieLazienkowe() {
        return domiOgrodPodkategoriaBaterieLazienkowe;
    }

    public WebElement getDomiOgrodPodkategoriaMebleKuchenne() {
        return domiOgrodPodkategoriaMebleKuchenne;
    }

    public WebElement getDomiOgrodPodkategoriaSypialnia() {
        return domiOgrodPodkategoriaSypialnia;
    }

    public WebElement getDomiOgrodPodkategoriaSzlifierkiiPolerki() {
        return domiOgrodPodkategoriaSzlifierkiiPolerki;
    }

    public WebElement getDomiOgrodPodkategoriaPilyiPilarki() {
        return domiOgrodPodkategoriaPilyiPilarki;
    }

    public WebElement getDomiOgrodPodkategoriaKosiarkiSpalinowe() {
        return domiOgrodPodkategoriaKosiarkiSpalinowe;
    }

    public WebElement getDomiOgrodPodkategoriaRosliny() {
        return domiOgrodPodkategoriaRosliny;
    }

    public WebElement getDomiOgrodPodkategoriaRolety() {
        return domiOgrodPodkategoriaRolety;
    }

    public WebElement getDomiOgrodPodkategoriaGarnkiiPatelnie() {
        return domiOgrodPodkategoriaGarnkiiPatelnie;
    }


    public SubCategory3Page domiOgrodPodkategoriaBudownictwoiAkcesoriaClick() {
        domiOgrodPodkategoriaBudownictwoiAkcesoria.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaHydraulikaiArmaturaClick() {
        domiOgrodPodkategoriaHydraulikaiArmatura.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaMebleClick() {
        domiOgrodPodkategoriaMeble.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaNieruchomosciClick() {
        domiOgrodPodkategoriaNieruchomosci.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaNarzedziaClick() {
        domiOgrodPodkategoriaNarzedzia.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaMyjkiCisnienioweClick() {
        domiOgrodPodkategoriaMyjkiCisnieniowe.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaOgrodClick() {
        domiOgrodPodkategoriaOgrod.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaMebleOgrodoweClick() {
        domiOgrodPodkategoriaMebleOgrodowe.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaWyposazenieClick() {
        domiOgrodPodkategoriaWyposazenie.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaLampyClick() {
        domiOgrodPodkategoriaLampy.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaDrabinyClick() {
        domiOgrodPodkategoriaDrabiny.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaBaterieLazienkoweClick() {
        domiOgrodPodkategoriaBaterieLazienkowe.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaMebleKuchenneClick() {
        domiOgrodPodkategoriaMebleKuchenne.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaSypialniaClick() {
        domiOgrodPodkategoriaSypialnia.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaSzlifierkiiPolerkiClick() {
        domiOgrodPodkategoriaSzlifierkiiPolerki.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaPilyiPilarkiClick() {
        domiOgrodPodkategoriaPilyiPilarki.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaKosiarkiSpalinoweClick() {
        domiOgrodPodkategoriaKosiarkiSpalinowe.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaRoslinyClick() {
        domiOgrodPodkategoriaRosliny.click();
        return this;
    }

    public SubCategory3Page domiOgrodPodkategoriaRoletyClick() {
        domiOgrodPodkategoriaRolety.click();
        return this;
    }

}

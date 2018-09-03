package pages.Header.DropdownSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class DropdownPage extends BasePage {

    WebDriver driver;

    public DropdownPage(WebDriver driver)  {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[data-dropdown-id=\"account_dropdown\"]")
    private WebElement mojeAllegroDropdown;

    @FindBy(css = "._8ntnf > div > a:nth-child(2)")
    private WebElement mojeAllegroDropdownWystawPrzedmiot;

    @FindBy(css = "._8ntnf > div > a:nth-child(4)")
    private WebElement mojeAllegroDropdownObserwowane;

    @FindBy(css = "._8ntnf > div > a:nth-child(5)")
    private WebElement mojeAllegroDropdownLicytujesz;

    @FindBy(css = "._8ntnf > div > a:nth-child(6)")
    private WebElement mojeAllegroDropdownKupione;

    @FindBy(css = "._8ntnf > div > a:nth-child(7)")
    private WebElement mojeAllegroDropdownOcenSprzedawce;

    @FindBy(css = "._8ntnf > div > a:nth-child(8)")
    private WebElement mojeAllegroDropdownOcenProdukty;

    @FindBy(css = "._8ntnf > div > a:nth-child(9)")
    private WebElement mojeAllegroDropdownMonetyiKupony;

    @FindBy(css = "._8ntnf > div > a:nth-child(11)")
    private WebElement mojeAllegroDropdownMojeOferty;

    @FindBy(css = "._8ntnf > div > a:nth-child(12)")
    private WebElement mojeAllegroDropdownSprzedajesz;

    @FindBy(css = "._8ntnf > div > a:nth-child(13)")
    private WebElement mojeAllegroDropdownSprzedane;

    @FindBy(css = "._8ntnf > div > a:nth-child(14)")
    private WebElement mojeAllegroDropdownMojeOceny;

    @FindBy(css = "._8ntnf > div > a:nth-child(15)")
    private WebElement mojeAllegroDropdownCentrumZnizek;

    @FindBy(css = "._8ntnf > div > a:nth-child(17)")
    private WebElement mojeAllegroDropdownMojeKonto;

    @FindBy(css = ".opbox-metrum-header__account-login > a:nth-child(2)")
    private WebElement mojeAllegroDropdownZalogujButton;

    @FindBy(css = ".opbox-metrum-header__account-login > a:nth-child(3)")
    private WebElement mojeAllegroDropdownZalozKontoButton;

    @FindBy(css = "._8ntnf > div > div:nth-child(19) > div > div > div > div > div > p > a:nth-child(1)")
    private WebElement mojeAllegroDropdownKupTerazGraphics;

    @FindBy(css = "._8ntnf > div > div:nth-child(19) > div > div > div > div > div > p > a:nth-child(2) > img")
    private WebElement mojeAllegroDropdownSmartGraphics;

    public DropdownPage mojeAllegroDropdownClick() {
        mojeAllegroDropdown.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownWystawPrzedmiotClick() {
        mojeAllegroDropdownWystawPrzedmiot.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownObserwowaneClick() {
        mojeAllegroDropdownObserwowane.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownLicytujeszClick() {
        mojeAllegroDropdownLicytujesz.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownKupioneClick() {
        mojeAllegroDropdownKupione.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownOcenSprzedawceClick() {
        mojeAllegroDropdownOcenSprzedawce.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownOcenProduktyClick() {
        mojeAllegroDropdownOcenProdukty.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownMonetyiKuponyClick() {
        mojeAllegroDropdownMonetyiKupony.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownMojeOfertyClick() {
        mojeAllegroDropdownMojeOferty.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownSprzedajeszClick() {
        mojeAllegroDropdownSprzedajesz.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownSprzedaneClick() {
        mojeAllegroDropdownSprzedane.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownMojeOcenyClick() {
        mojeAllegroDropdownMojeOceny.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownCentrumZnizekClick() {
        mojeAllegroDropdownCentrumZnizek.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownMojeKontoClick() {
        mojeAllegroDropdownMojeKonto.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownZalogujButtonClick() {
        mojeAllegroDropdownZalogujButton.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownZalozKontoButtonClick() {
        mojeAllegroDropdownZalozKontoButton.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownKupTerazGraphicsClick() {
        mojeAllegroDropdownKupTerazGraphics.click();
        return this;
    }

    public DropdownPage mojeAllegroDropdownSmartGraphicsClick() {
        mojeAllegroDropdownSmartGraphics.click();
        return this;
    }


}

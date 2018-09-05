package pages.Header.CategoriesSection.SubCategory7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SubCategory7Page extends BasePage {

    WebDriver driver;

    public SubCategory7Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Zdrowie subcategory



    @FindBy(css = "a[title=\"Erotyka\"]")
    private WebElement zdrowiePodkategoriaErotyka;
    
    @FindBy(css = "a[title=\"Korekcja wzroku\"]")
    private WebElement zdrowiePodkategoriaKorekcjaWzroku;
    
    @FindBy(css = "a[title=\"Soczewki kontaktowe\"]")
    private WebElement zdrowiePodkategoriaSoczewkiKontaktowe;
    
    @FindBy(css = "a[title=\"Płyny do soczewek\"]")
    private WebElement zdrowiePodkategoriaPlynyDoSoczewek;
    
    @FindBy(css = "a[title=\"Higiena jamy ustnej\"]")
    private WebElement zdrowiePodkategoriaHigienaJamyUstnej;
    
    @FindBy(css = "a[title=\"Szczoteczki elektryczne\"]")
    private WebElement zdrowiePodkategoriaSzczoteczkiElektryczne;
    
    @FindBy(css = "a[title=\"Zdrowie, medycyna\"]")
    private WebElement zdrowiePodkategoriaZdrowieMedycyna;
    
    @FindBy(css = "a[title=\"Suplementy diety\"]")
    private WebElement zdrowiePodkategoriaSuplementyDiety;
    
    @FindBy(css = "a[title=\"Poduszki ortopedyczne\"]")
    private WebElement zdrowiePodkategoriaPoduszkiOrtopedyczne;
    
    @FindBy(css = "a[title=\"Odzież medyczna\"]")
    private WebElement zdrowiePodkategoriaOdziezMedyczna;
    
    @FindBy(css = "a[title=\"Leki bez recepty\"]")
    private WebElement zdrowiePodkategoriaLekiBezRecepty;
    
    @FindBy(css = "a[title=\"Leki na alergię\"]")
    private WebElement zdrowiePodkategoriaLekiNaAlergie;
    
    @FindBy(css = "a[title=\"Rzucanie palenia\"]")
    private WebElement zdrowiePodkategoriaRzucaniePalenia;
    
    @FindBy(css = "a[title=\"Urządzenia medyczne\"]")
    private WebElement zdrowiePodkategoriaUrzadzeniaMedyczne;
    
    @FindBy(css = "a[title=\"Inhalatory\"]")
    private WebElement zdrowiePodkategoriaInhalatory;
    
    @FindBy(css = "a[title=\"Aparaty słuchowe\"]")
    private WebElement zdrowiePodkategoriaAparatySluchowe;
    
    @FindBy(css = "a[title=\"Medycyna naturalna\"]")
    private WebElement zdrowiePodkategoriaMedycynaNaturalna;
    
    @FindBy(css = "a[title=\"Zioła lecznicze\"]")
    private WebElement zdrowiePodkategoriaZiolaLecznicze;
    
    @FindBy(css = "a[title=\"Kremy i maści naturalne\"]")
    private WebElement zdrowiePodkategoriaKremyiMasciNaturalne;
    
    @FindBy(css = "a[title=\"Dermokosmetyki\"]")
    private WebElement zdrowiePodkategoriaDermokosmetyki;
    
    

    public WebElement getzdrowiePodkategoriaErotyka() {

        return zdrowiePodkategoriaErotyka;
    }

    public WebElement getZdrowiePodkategoriaKorekcjaWzroku() {
        return zdrowiePodkategoriaKorekcjaWzroku;
    }

    public WebElement getZdrowiePodkategoriaSoczewkiKontaktowe() {
        return zdrowiePodkategoriaSoczewkiKontaktowe;
    }

    public WebElement getZdrowiePodkategoriaPlynyDoSoczewek() {
        return zdrowiePodkategoriaPlynyDoSoczewek;
    }

    public WebElement getZdrowiePodkategoriaHigienaJamyUstnej() {
        return zdrowiePodkategoriaHigienaJamyUstnej;
    }

    public WebElement getZdrowiePodkategoriaSzczoteczkiElektryczne() {
        return zdrowiePodkategoriaSzczoteczkiElektryczne;
    }

    public WebElement getZdrowiePodkategoriaZdrowieMedycyna() {
        return zdrowiePodkategoriaZdrowieMedycyna;
    }

    public WebElement getZdrowiePodkategoriaSuplementyDiety() {
        return zdrowiePodkategoriaSuplementyDiety;
    }

    public WebElement getZdrowiePodkategoriaPoduszkiOrtopedyczne() {
        return zdrowiePodkategoriaPoduszkiOrtopedyczne;
    }

    public WebElement getZdrowiePodkategoriaOdziezMedyczna() {
        return zdrowiePodkategoriaOdziezMedyczna;
    }

    public WebElement getZdrowiePodkategoriaLekiBezRecepty() {
        return zdrowiePodkategoriaLekiBezRecepty;
    }

    public WebElement getZdrowiePodkategoriaLekiNaAlergie() {
        return zdrowiePodkategoriaLekiNaAlergie;
    }

    public WebElement getZdrowiePodkategoriaRzucaniePalenia() {
        return zdrowiePodkategoriaRzucaniePalenia;
    }

    public WebElement getZdrowiePodkategoriaUrzadzeniaMedyczne() {
        return zdrowiePodkategoriaUrzadzeniaMedyczne;
    }

    public WebElement getZdrowiePodkategoriaInhalatory() {
        return zdrowiePodkategoriaInhalatory;
    }

    public WebElement getZdrowiePodkategoriaAparatySluchowe() {
        return zdrowiePodkategoriaAparatySluchowe;
    }

    public WebElement getZdrowiePodkategoriaMedycynaNaturalna() {
        return zdrowiePodkategoriaMedycynaNaturalna;
    }

    public WebElement getZdrowiePodkategoriaZiolaLecznicze() {
        return zdrowiePodkategoriaZiolaLecznicze;
    }

    public WebElement getZdrowiePodkategoriaKremyiMasciNaturalne() {
        return zdrowiePodkategoriaKremyiMasciNaturalne;
    }

    public WebElement getZdrowiePodkategoriaDermokosmetyki() {
        return zdrowiePodkategoriaDermokosmetyki;
    }

    public SubCategory7Page zdrowiePodkategoriaErotykaClick() {
        zdrowiePodkategoriaErotyka.click();
        return this;
    }

    public SubCategory7Page zdrowiePodkategoriaKorekcjaWzrokuClick() {
         zdrowiePodkategoriaKorekcjaWzroku.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaSoczewkiKontaktoweClick() {
         zdrowiePodkategoriaSoczewkiKontaktowe.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaPlynyDoSoczewekClick() {
         zdrowiePodkategoriaPlynyDoSoczewek.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaHigienaJamyUstnejClick() {
         zdrowiePodkategoriaHigienaJamyUstnej.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaSzczoteczkiElektryczneClick() {
         zdrowiePodkategoriaSzczoteczkiElektryczne.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaZdrowieMedycynaClick() {
         zdrowiePodkategoriaZdrowieMedycyna.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaSuplementyDietyClick() {
         zdrowiePodkategoriaSuplementyDiety.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaPoduszkiOrtopedyczneClick() {
         zdrowiePodkategoriaPoduszkiOrtopedyczne.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaOdziezMedycznaClick() {
         zdrowiePodkategoriaOdziezMedyczna.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaLekiBezReceptyClick() {
         zdrowiePodkategoriaLekiBezRecepty.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaLekiNaAlergieClick() {
         zdrowiePodkategoriaLekiNaAlergie.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaRzucaniePaleniaClick() {
         zdrowiePodkategoriaRzucaniePalenia.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaUrzadzeniaMedyczneClick() {
         zdrowiePodkategoriaUrzadzeniaMedyczne.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaInhalatoryClick() {
         zdrowiePodkategoriaInhalatory.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaAparatySluchoweClick() {
         zdrowiePodkategoriaAparatySluchowe.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaMedycynaNaturalnaClick() {
         zdrowiePodkategoriaMedycynaNaturalna.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaZiolaLeczniczeClick() {
         zdrowiePodkategoriaZiolaLecznicze.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaKremyiMasciNaturalneClick() {
         zdrowiePodkategoriaKremyiMasciNaturalne.click();
     return this;
    }

    public SubCategory7Page zdrowiePodkategoriaDermokosmetykiClick() {
         zdrowiePodkategoriaDermokosmetyki.click();
     return this;
    }
}

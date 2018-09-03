package pages.Header.CategoriesSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.Header.CategoriesSection.SubCategory1.SubCategory1Page;

public class CategoriesPage extends BasePage {

    WebDriver driver;
    SubCategory1Page subCategory1Page;

    public CategoriesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        subCategory1Page = new SubCategory1Page(driver);
    }

    // Main category menu

    @FindBy(css = "a[href=\"/mapa-strony/kategorie\"]")
    private WebElement kategorieMainButton;

    @FindBy(css = "a[href=\"/dzial/supermarket#to-category-map\"]")
    private WebElement wszystkiekategorie;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/elektronika\"]")
    private WebElement kategoriaElektronika;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/moda\"]")
    private WebElement kategoriaModa;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/dom-i-ogrod\"]")
    private WebElement kategoriadomiOgrod;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/supermarket\"]")
    private WebElement kategoriaSupermarket;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/dziecko\"]")
    private WebElement kategoriaDziecko;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/uroda\"]")
    private WebElement kategoriaUroda;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/zdrowie\"]")
    private WebElement kategoriaZdrowie;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/kultura-i-rozrywka\"]")
    private WebElement kategoriaKulturaiRozrywka;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/sport-i-turystyka\"]")
    private WebElement kategoriaSportiTurystyka;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/motoryzacja\"]")
    private WebElement kategoriaMotoryzacja;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/ogloszenia-i-uslugi\"]")
    private WebElement kategoriaOgloszeniaiUslugi;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/kolekcje-i-sztuka\"]")
    private WebElement kategoriaKolekcjeiSztuka;

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/firma\"]")
    private WebElement kategoriaFirma;




    public CategoriesPage wszystkiekategorieClick() {
        wszystkiekategorie.click();
        return this;
    }

    public CategoriesPage kategorieMainButtonClick() {
        kategorieMainButton.;
        return this;
    }

}
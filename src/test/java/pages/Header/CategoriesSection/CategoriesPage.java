package pages.Header.CategoriesSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.Header.CategoriesSection.SubCategory1.SubCategory1Page;
import pages.Header.CategoriesSection.SubCategory2.SubCategory2Page;
import pages.Header.CategoriesSection.SubCategory3.SubCategory3Page;

import javax.swing.*;

public class CategoriesPage extends BasePage {

    WebDriver driver;
    public SubCategory1Page subCategory1Page;
    public SubCategory2Page subCategory2Page;
    public SubCategory3Page subCategory3Page;

    public CategoriesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        subCategory1Page = new SubCategory1Page(driver);
        subCategory2Page = new SubCategory2Page(driver);
        subCategory3Page = new SubCategory3Page(driver);
    }

    // Main category menu

    @FindBy(css = "a[href=\"/mapa-strony/kategorie\"]")
    private WebElement kategorieMainButton;

    @FindBy(css = "a[href=\"/dzial/elektronika#to-category-map\"]")
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

    public WebElement getKategoriaElektronika() {
        return kategoriaElektronika;
    }

    public WebElement getKategoriaModa() {
        return kategoriaModa;
    }

    public WebElement getKategoriadomiOgrod() {
        return kategoriadomiOgrod;
    }

    public WebElement getKategoriaSupermarket() {
        return kategoriaSupermarket;
    }

    public WebElement getKategoriaDziecko() {
        return kategoriaDziecko;
    }

    public WebElement getKategoriaUroda() {
        return kategoriaUroda;
    }

    public WebElement getKategoriaZdrowie() {
        return kategoriaZdrowie;
    }

    public WebElement getKategoriaKulturaiRozrywka() {
        return kategoriaKulturaiRozrywka;
    }

    public WebElement getKategoriaSportiTurystyka() {
        return kategoriaSportiTurystyka;
    }

    public WebElement getKategoriaMotoryzacja() {
        return kategoriaMotoryzacja;
    }

    public WebElement getKategoriaOgloszeniaiUslugi() {
        return kategoriaOgloszeniaiUslugi;
    }

    public WebElement getKategoriaKolekcjeiSztuka() {
        return kategoriaKolekcjeiSztuka;
    }

    public WebElement getKategoriaFirma() {
        return kategoriaFirma;
    }

    @FindBy(css = "._882d6_1Ba5t > div > [href=\"/dzial/firma\"]")
    private WebElement kategoriaFirma;




    public CategoriesPage wszystkiekategorieClick() {
        wszystkiekategorie.click();
        return this;
    }

    public CategoriesPage kategorieMainButtonClick() {
        kategorieMainButton.click();
        return this;
    }

    public CategoriesPage mouseHoverOverCategory(WebElement element) {

        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        return this;
    }

}

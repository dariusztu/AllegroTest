package pages.Header.CategoriesSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.Header.CategoriesSection.SubCategory1.SubCategory1Page;
import pages.Header.CategoriesSection.SubCategory2.SubCategory2Page;
import pages.Header.CategoriesSection.Subcategory3.SubCategory3Page;
import pages.Header.CategoriesSection.Subcategory4.SubCategory4Page;
import pages.Header.CategoriesSection.Subcategory5.SubCategory5Page;
import pages.Header.CategoriesSection.Subcategory6.SubCategory6Page;
import pages.Header.CategoriesSection.Subcategory7.SubCategory7Page;
import pages.Header.CategoriesSection.Subcategory8.SubCategory8Page;
import pages.Header.CategoriesSection.Subcategory9.SubCategory9Page;
import pages.Header.CategoriesSection.Subcategory10.SubCategory10Page;
import pages.Header.CategoriesSection.Subcategory11.SubCategory11Page;
import pages.Header.CategoriesSection.Subcategory12.SubCategory12Page;
import pages.Header.CategoriesSection.Subcategory13.SubCategory13Page;


import javax.swing.*;

public class CategoriesPage extends BasePage {

    WebDriver driver;
    public SubCategory1Page subCategory1Page;
    public SubCategory2Page subCategory2Page;
    public SubCategory3Page subCategory3Page;
    public SubCategory4Page subCategory4Page;
    public SubCategory5Page subCategory5Page;
    public SubCategory6Page subCategory6Page;
    public SubCategory7Page subCategory7Page;
    public SubCategory8Page subCategory8Page;
    public SubCategory9Page subCategory9Page;
    public SubCategory10Page subCategory10Page;
    public SubCategory11Page subCategory11Page;
    public SubCategory12Page subCategory12Page;
    public SubCategory13Page subCategory13Page;

    public CategoriesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        subCategory1Page = new SubCategory1Page(driver);
        subCategory2Page = new SubCategory2Page(driver);
        subCategory3Page = new SubCategory3Page(driver);
        subCategory4Page = new SubCategory4Page(driver);
        subCategory5Page = new SubCategory5Page(driver);
        subCategory6Page = new SubCategory6Page(driver);
        subCategory7Page = new SubCategory7Page(driver);
        subCategory8Page = new SubCategory8Page(driver);
        subCategory9Page = new SubCategory9Page(driver);
        subCategory10Page = new SubCategory10Page(driver);
        subCategory11Page = new SubCategory11Page(driver);
        subCategory12Page = new SubCategory12Page(driver);
        subCategory13Page = new SubCategory13Page(driver);
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

    public CategoriesPage kategoriaElektronikaClick() {
        kategoriaElektronika.click();
        return this;
    }

    public CategoriesPage kategoriaModaClick() {
        kategoriaModa.click();
        return this;
    }

    public CategoriesPage kategoriadomiOgrodClick() {
        kategoriadomiOgrod.click();
        return this;
    }

    public CategoriesPage kategoriaSupermarketClick() {
        kategoriaSupermarket.click();
        return this;
    }

    public CategoriesPage kategoriaDzieckoClick() {
        kategoriaDziecko.click();
        return this;
    }

    public CategoriesPage kategoriaUrodaClick() {
        kategoriaUroda.click();
        return this;
    }

    public CategoriesPage kategoriaZdrowieClick() {
        kategoriaZdrowie.click();
        return this;
    }

    public CategoriesPage kategoriaKulturaiRozrywkaClick() {
        kategoriaKulturaiRozrywka.click();
        return this;
    }

    public CategoriesPage kategoriaSportiTurystykaClick() {
        kategoriaSportiTurystyka.click();
        return this;
    }

    public CategoriesPage kategoriaMotoryzacjaClick() {
        kategoriaMotoryzacja.click();
        return this;
    }

    public CategoriesPage kategoriaOgloszeniaiUslugiClick() {
        kategoriaOgloszeniaiUslugi.click();
        return this;
    }

    public CategoriesPage kategoriaKolekcjeiSztukaClick() {
        kategoriaKolekcjeiSztuka.click();
        return this;
    }

    public CategoriesPage kategoriaFirmaClick() {
        kategoriaFirma.click();
        return this;
    }
}

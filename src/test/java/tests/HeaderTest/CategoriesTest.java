package tests.HeaderTest;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Header.CategoriesSection.CategoriesPage;
import pages.Header.HeaderPage;
import pages.Header.SearchSection.SearchPage;
import pages.LandingPage;
import pages.ProductsList.ProductsListBasePage;
import tests.BaseTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoriesTest extends BaseTest {

    private LandingPage landingPageObject;
    private HeaderPage headerPage;
    private ProductsListBasePage productsListBasePage;

    @Test
    public void passIfShowCategoryAfterMouseHoverIsSuccessfull(){
        landingPageObject = new LandingPage(driver);
        headerPage = new HeaderPage(driver);
        landingPageObject.
                goTopage().
                rodoButtonAcceptClick();

        headerPage.categoriesPage.
                kategorieMainButtonClick().
                mouseHoverOverCategory(headerPage.categoriesPage.getKategoriaModa());
        assertThat(headerPage.
                categoriesPage.
                subCategory2Page.
                getModaPodkategoriaOdziezObuwieDodatki().
                isDisplayed())
                .isTrue();




    }

    @Test
    public void passIfGoToEveryCategoryInZdrowieIsSuccessfull() {
        landingPageObject = new LandingPage(driver);
        headerPage = new HeaderPage(driver);
        productsListBasePage = new ProductsListBasePage(driver);


        landingPageObject.
                goTopage().
                rodoButtonAcceptClick();

        headerPage.
                categoriesPage.
                kategorieMainButtonClick().
                mouseHoverOverCategory(headerPage.categoriesPage.getKategoriaZdrowie());

        headerPage.categoriesPage.subCategory7Page.zdrowiePodkategoriaAparatySluchoweClick();
        assertThat(productsListBasePage.productsListCategoryTitleGetText()).isEqualTo("Aparaty słuchowe");


    }

    @Test public void passIfGoToEveryMainCategoryIsSuccessfull() {
        landingPageObject = new LandingPage(driver);
        headerPage = new HeaderPage(driver);
        productsListBasePage = new ProductsListBasePage(driver);

        landingPageObject.
                goTopage().
                rodoButtonAcceptClick();


        List<WebElement> allWebElements = headerPage.categoriesPage.CategoriesPageList();
        for (WebElement lista: allWebElements) { // Go to menu, click category, back to main page, repeat on every category
            headerPage.categoriesPage.kategorieMainButtonClick();
            headerPage.categoriesPage.categoryClick(lista);
            landingPageObject.goTopage();

            //assertThat(productsListBasePage.productsListCategoryTitleGetText()).isEqualTo();

        }

    }
}
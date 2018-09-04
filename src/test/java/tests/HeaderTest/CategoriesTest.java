package tests.HeaderTest;

import org.junit.Test;
import pages.Header.HeaderPage;
import pages.Header.SearchSection.SearchPage;
import pages.LandingPage;
import tests.BaseTest;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoriesTest extends BaseTest {

    private LandingPage landingPageObject;
    private HeaderPage headerPage;

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

}
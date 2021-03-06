package tests.HeaderTest;

import org.junit.Test;
import pages.Header.SearchSection.SearchPage;
import pages.LandingPage;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchFormTest extends BaseTest {


    private LandingPage landingPageObject;
    private SearchPage searchPageObject;

    @Test
    public void passIfFindSuccessfull() {
        landingPageObject = new LandingPage(driver);
        searchPageObject = new SearchPage(driver);
        landingPageObject.
                goTopage().
                rodoButtonAcceptClick();
        searchPageObject.
                searchFormSendKeys("iPhone").
                searchButtonClick();
        assertThat(driver.getPageSource()).contains("iPhone");
    }

    @Test
    public void passIfChosenCategoryIsDisplayingCorrectly() { //TODO PARAMETRIZED TEST
        landingPageObject = new LandingPage(driver);
        searchPageObject = new SearchPage(driver);
        landingPageObject.
                goTopage().
                rodoButtonAcceptClick();
        assertThat(
        searchPageObject.
                dropdownCategorySearchClick().
                dropdownCategorySearchDomiOgrodClick().
                dropdownCategorySearchReturnActiveValue()).
                contains("Dom i ogród");
    }
}

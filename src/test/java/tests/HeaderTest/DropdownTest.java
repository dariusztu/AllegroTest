package tests.HeaderTest;

import org.junit.Test;
import pages.Header.HeaderPage;
import pages.Header.SearchSection.SearchPage;
import pages.LandingPage;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class DropdownTest extends BaseTest {

    private LandingPage landingPageObject;
    private SearchPage searchPageObject;
    private HeaderPage headerPage;

    @Test
    public void passIfGoToWystawPrzedmiotIsSuccessfull(){
        landingPageObject = new LandingPage(driver);
        headerPage = new HeaderPage(driver);
        landingPageObject.
                goTopage().
                rodoButtonAcceptClick();

        headerPage.dropdownPage.
                mojeAllegroDropdownClick().
                mojeAllegroDropdownWystawPrzedmiotClick();
        assertThat(driver.getPageSource()).contains("Zalogowanie oznacza akceptację");
    }

}

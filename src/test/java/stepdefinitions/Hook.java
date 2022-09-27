package stepdefinitions;

import io.cucumber.java.Before;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;
import static utils.DriverUtils.setDriver;

public class Hook {

    public static final Actor user = new Actor("user");

    public WebDriver driver;

    @Before
    public void setTheStage() {
        driver = getProxiedDriver();
        setDriver(driver);
        user.whoCan(
                BrowseTheWeb.with(driver)
        );
        user.wasAbleTo(
                NavigateTo.LatamPage()
        );
    }
}

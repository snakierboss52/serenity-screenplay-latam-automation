package navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable LatamPage() {
        return Open.browserOn().the(LatamPage.class);
    }

}

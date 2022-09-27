package navigation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NavigateTo {

    public static Performable latamPage() {
        return Open.browserOn().the(LatamPage.class);
    }

}

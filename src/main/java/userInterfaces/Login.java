package userInterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Login {

    public static final Target LOGIN_BTN = Target.the("Iniciar Sesión").located(By.id("header__profile__lnk-sign-in"));
}

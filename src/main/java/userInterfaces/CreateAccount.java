package userInterfaces;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateAccount {

    public static final Target LOGIN_BTN = Target.the("Iniciar Sesión").located(By.id("header__profile__lnk-sign-in"));
    public static final Target CREATE_ACCOUNT_BTN = Target.the("Create account button").located(By.buttonText("Crear cuenta"));
    public static final Target CREATE_ACCOUNT_TXT = Target.the("Create account text validation").located(By.id("lbl-title"));
    public static final Target DOCUMENT_CODE = Target.the("Create account text validation").located(By.id("documentCode"));
}

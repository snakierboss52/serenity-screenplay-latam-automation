package userinterfaces;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateAccount {

    public static final Target LOGIN_BTN = Target
            .the("Iniciar Sesión")
            .located(By.id("header__profile__lnk-sign-in"));

    public static final Target CREATE_ACCOUNT_BTN = Target
            .the("Create account button")
            .located(By.buttonText("Crear cuenta"));

    public static final Target FORM_NAME = Target
            .the("Insert name")
            .located(By.id("name"));

    public static final Target FORM_LAST_NAME = Target
            .the("Insert name")
            .located(By.id("lastName"));

    public static final Target FORM_DOCUMENT_CODE = Target
            .the("Insert Document Identification")
            .located(By.id("documentCode"));

    public static final Target FORM_BIRTH_DATE = Target
            .the("Insert birth date")
            .located(By.id("birthDate"));

    public static final Target FORM_PHONE_NUMBER = Target
            .the("Insert Phone Number")
            .located(By.id("contactCode"));
}

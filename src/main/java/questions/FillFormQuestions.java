package questions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import net.serenitybdd.screenplay.Question;

import static userinterfaces.CreateAccount.FORM_LAST_NAME;
import static userinterfaces.CreateAccount.FORM_NAME;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FillFormQuestions{

    public static Question<String> nameIsCorrect() {
        return actor -> FORM_NAME.resolveFor(actor).getValue();
    }

    public static Question<String> lastnameIsCorrect() {
        return actor -> FORM_LAST_NAME.resolveFor(actor).getValue();
    }

}

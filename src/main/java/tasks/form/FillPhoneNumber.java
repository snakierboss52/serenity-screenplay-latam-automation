package tasks.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CreateAccount.FORM_PHONE_NUMBER;

@Data
@AllArgsConstructor
public class FillPhoneNumber implements Task {

    private String phoneNumber;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(FORM_PHONE_NUMBER),
                Enter.theValue(phoneNumber).into(FORM_PHONE_NUMBER)
        );
    }
}

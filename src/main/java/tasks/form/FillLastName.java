package tasks.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CreateAccount.FORM_LAST_NAME;

@Data
@AllArgsConstructor
public class FillLastName implements Task {

    private String lastname;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(FORM_LAST_NAME),
                Enter.theValue(lastname).into(FORM_LAST_NAME)
        );
    }
}

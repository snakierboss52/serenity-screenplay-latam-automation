package tasks.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CreateAccount.FORM_NAME;

@Data
@AllArgsConstructor
public class FillName implements Task {

    private String name;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(FORM_NAME),
                Enter.theValue(name).into(FORM_NAME)
        );
    }
}

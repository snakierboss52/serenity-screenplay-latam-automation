package tasks.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CreateAccount.FORM_BIRTH_DATE;

@Data
@AllArgsConstructor
public class FillBirthDate implements Task {

    private String birthDate;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //birthDate = birthDate.replace("-","");
        actor.attemptsTo(
                Clear.field(FORM_BIRTH_DATE),
                Enter.theValue(birthDate).into(FORM_BIRTH_DATE)
        );
    }
}

package tasks.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.CreateAccount.FORM_DOCUMENT_CODE;

@Data
@AllArgsConstructor
public class FillDocumentId implements Task {

    private String documentId;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(FORM_DOCUMENT_CODE),
                Enter.theValue(documentId).into(FORM_DOCUMENT_CODE)
        );
    }
}

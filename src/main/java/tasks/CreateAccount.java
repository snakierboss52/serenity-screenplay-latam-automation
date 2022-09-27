package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userInterfaces.CreateAccount.CREATE_ACCOUNT_BTN;
import static userInterfaces.CreateAccount.DOCUMENT_CODE;
import static userInterfaces.CreateAccount.LOGIN_BTN;

public class CreateAccount implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BTN),
                Click.on(CREATE_ACCOUNT_BTN),
                Enter.theValue("1014300826").into(DOCUMENT_CODE)
        );
    }

    public static CreateAccount withInformation(){
        return Tasks.instrumented(CreateAccount.class);
    }
}

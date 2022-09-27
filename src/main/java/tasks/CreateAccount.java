package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterfaces.Login.CREATE_ACCOUNT_BTN;
import static userInterfaces.Login.LOGIN_BTN;

public class CreateAccount implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BTN),
                Click.on(CREATE_ACCOUNT_BTN)
        );
    }

    public static CreateAccount withInformation(){
        return Tasks.instrumented(CreateAccount.class);
    }
}

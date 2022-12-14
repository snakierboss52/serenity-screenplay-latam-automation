package stepdefinitions;

import factories.FillForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import lombok.Data;

import net.serenitybdd.screenplay.actions.Scroll;

import net.serenitybdd.screenplay.waits.WaitUntil;
import questions.FillFormQuestions;
import tasks.CreateAccount;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static stepdefinitions.Hook.user;
import static userinterfaces.CreateAccount.FORM_NAME;
import static userinterfaces.CreateAccount.FORM_PHONE_NUMBER;

@Data
public class Flights {

    @Given("^User create account$")
    public void UserCreateAccount(List<Map<String,String>> dataForm) throws InterruptedException {
        user.attemptsTo(
                CreateAccount.withInformation(),
                FillForm.withDocumentId(dataForm.get(0).get("documentId")),
                FillForm.withName(dataForm.get(0).get("name")),
                FillForm.withLastName(dataForm.get(0).get("lastname")),
                FillForm.withBirthDate(dataForm.get(0).get("birthDate"))
        );
        user.should(
                seeThat(
                        FillFormQuestions.nameIsCorrect(), equalTo("Jorge")
                ),
                seeThat(
                        FillFormQuestions.lastnameIsCorrect(), equalTo("Lozano")

                )

        );

        user.attemptsTo(
                Scroll.to(FORM_PHONE_NUMBER),
                FillForm.withPhoneNumber(dataForm.get(0).get("phoneNumber"))

        );

        Thread.sleep(1000);
    }

    @Then("User login successfully")
    public void UserLoginSuccessfully(){

    }


}

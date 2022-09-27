package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import tasks.CreateAccount;

import static stepdefinitions.Hook.user;

public class Flights {

    @Given("User create account")
    public void UserCreateAccount() {
        user.attemptsTo(
                CreateAccount.withInformation()
        );
    }

    @Then("User login successfully")
    public void UserLoginSuccessfully(){

    }


}

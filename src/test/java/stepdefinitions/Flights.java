package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tasks.Login;

import static stepdefinitions.Hook.user;

public class Flights {

    @Given("User create account")
    public void UserCreateAccount() {
        user.attemptsTo(
                Login.withInformation()
        );
    }

    @Then("User login successfully")
    public void UserLoginSuccessfully(){

    }


}

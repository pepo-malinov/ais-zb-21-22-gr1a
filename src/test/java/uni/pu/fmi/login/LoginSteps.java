package uni.pu.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.login.models.LoginScreenModel;

public class LoginSteps {

	private LoginScreenModel loginModel;

	@Given("^Потребителя отваря формата за вход в системата$")
	public void navigateToLoginScreen() {
		loginModel = new LoginScreenModel();
	}

	@Given("^Въвежда валидно потребителско име$")
	public void enterValidUserName() {
		loginModel.setUsername("Ivan");
	}

	@Given("^Въвежда валидна парола$")
	public void enterValidPassword() {
		loginModel.setPassword("Pass123");
	}

	@When("^Натиска върху бутона за вход в системата$")
	public void loginButtonClick() {
		loginModel.loginButtonClick();
	}

	@Then("^Вижда съобщение за успех$")
	public void checkMessage() {
		assertEquals("OK", loginModel.getMessage());
	}

}

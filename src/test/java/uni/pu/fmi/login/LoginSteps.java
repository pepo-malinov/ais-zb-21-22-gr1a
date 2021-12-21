package uni.pu.fmi.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uni.pu.fmi.login.models.LoginScreenModel;

public class LoginSteps {

	private LoginScreenModel loginModel;

	public LoginSteps(LoginScreenModel loginModel) {
		this.loginModel = loginModel;
	}

	@Given("^Потребителя отваря формата за вход в системата$")
	public void navigateToLoginScreen() {
		// loginModel = new LoginScreenModel();
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

}

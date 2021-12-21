package uni.pu.fmi.register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uni.pu.fmi.login.models.LoginScreenModel;

public class RegisterSteps {

	private LoginScreenModel model;

	public RegisterSteps(final LoginScreenModel model) {
		this.model = model;
	}

	@Given("^Потребителя отваря формата за регистарция$")
	public void openRegisterForm() throws Throwable {
		// model = new LoginScreenModel();
	}

	@When("^Въвежда потребителско име: \"([^\"]*)\"$")
	public void setusername(final String username) throws Throwable {
		model.setUsername(username);
	}

	@When("^Въвежда парола: \"([^\"]*)\"$")
	public void setpassword(final String password) throws Throwable {
		model.setPassword(password);
	}

	@When("^Натиска бутона за регистрация$")
	public void clickOnRegisterButton() throws Throwable {
		model.clickOnRegisterButton();
	}

}

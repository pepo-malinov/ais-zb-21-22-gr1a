package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import uni.pu.fmi.login.models.LoginScreenModel;

public class SharedState {
	private LoginScreenModel model;

	public SharedState(LoginScreenModel model) {
		this.model = model;
	}
	
	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, model.getMessage());
	}
}

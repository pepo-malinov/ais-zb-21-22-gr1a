package uni.pu.fmi.login.models;

import uni.pu.fmi.register.servoces.RegisterService;
import uni.pu.fmi.services.login.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void loginButtonClick() {
		this.message = LoginService.login(username, password);
	}

	public void clickOnRegisterButton() {
		this.message = RegisterService.register(username, password);
		
	}
}

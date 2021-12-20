package uni.pu.fmi.models;

public class User {
	private final String username;
	private String password;

	public User(final String username, final String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
}

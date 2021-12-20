package uni.pu.fmi.services.login;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.models.User;

public class LoginService {

	private static List<User> usersDB = new ArrayList<>();

	static {
		usersDB.add(new User("Ivan", "Pass123"));
	}

	public static String login(String username, String password) {

		final boolean anyMatch = usersDB.stream()
				.anyMatch(u -> username.equals(u.getUsername()) && password.equals(u.getPassword()));

		return anyMatch ? "OK" : "404";
	}

}

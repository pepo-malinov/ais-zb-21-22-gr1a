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

		
		//username.equals(u.getUsername())
		// username!= null && username.equals(u.getUsername())
		
		// "TestName".equals(username)
		// "".equals(username)
		// username.equals("TestName")
		// u.getUsername().equals(username)
		
		
		
		final boolean anyMatch = usersDB.stream()
				.anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));

		return anyMatch ? "OK" : "404";
	}

}

package uni.pu.fmi.register.servoces;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.models.User;

public class RegisterService {

	private static final String SUCCESS = "success";
	private static final String FAIL = "Fail";
	private static List<User> usersDB = new ArrayList<>();

	static {
		usersDB.add(new User("Lencho1", "pass1234"));
	}

	public static String register(String username, String password) {

		if (isValid(password) && isValid(username)) {
			final boolean noneMatch = usersDB.stream()
					.noneMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
			if (noneMatch) {
				final User newUser = new User(username, password);
				usersDB.add(newUser);
				return SUCCESS;
			}
		}
		return FAIL;

	}

	private static boolean isValid(final String entry) {
		return null != entry && !"".equals(entry.trim());
	}

}

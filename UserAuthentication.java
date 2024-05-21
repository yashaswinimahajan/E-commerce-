package ecommercewebsite;
import java.util.ArrayList;
import java.util.List;

public class UserAuthentication {
	    private List<User> users;
		private int nextUserId;

		public UserAuthentication() {
			this.users = new ArrayList<>();
			this.nextUserId = 1; // Initialize user ID counter
		}

		public void register(User user) {
			user.SetUserId(getNextUserId()); // Set the user ID
			users.add(user);
			System.out.println("User registered successfully.");
		}

		int getNextUserId() {
			return nextUserId++;
		}

		public User login(String username, String password) {
			for (User user : users) {
				if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
					user.login();
					return user;
				}
			}
			System.out.println("Invalid username or password.");
			return null;
		}

		public void logout(User user) {
			user.logout();
		}
	}



package ecommercewebsite;
import java.util.Scanner;

public class EcommersDemonstrate {
	        public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			UserAuthentication authentication = new UserAuthentication();

			boolean loggedIn = false;
			User loggedInUser = null;

			while (!loggedIn) {
				System.out.println("Welcome to the E-Commerce System!");
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("3. Exit");
				System.out.println("Choose an option:");

				int option = scanner.nextInt();
				scanner.nextLine(); // Consume newline character

				switch (option) {
				case 1:
					// Registration
					System.out.println("Enter username:");
					String regUsername = scanner.nextLine();
					System.out.println("Enter password:");
					String regPassword = scanner.nextLine();
					System.out.println("Enter email:");
					String regEmail = scanner.nextLine();

					User newUser = new Customer(authentication.getNextUserId(), regUsername, regPassword, regEmail);
					authentication.register(newUser);
					System.out.println("User registered successfully.");
					break;
				case 2:
					// Login
					System.out.println("Enter username:");
					String username = scanner.nextLine();
					System.out.println("Enter password:");
					String password = scanner.nextLine();

					loggedInUser = authentication.login(username, password);
					if (loggedInUser != null) {
						loggedIn = true;
						System.out.println("Login successful.");
					} else {
						System.out.println("Invalid username or password. Please try again.");
					}
					break;
				case 3:
					// Exit
					System.out.println("Exiting the system. Goodbye!");
					return;
				default:
					System.out.println("Invalid option. Please choose again.");
				}
			}

			// User is logged in, proceed with actions
			while (loggedIn) {
				System.out.println("1. Logout");
				System.out.println("2. Exit");
				System.out.println("Choose an option:");

				int action = scanner.nextInt();
				scanner.nextLine(); // Consume newline character

				switch (action) {
				case 1:
					// Logout
					authentication.logout(loggedInUser);
					System.out.println("Logged out successfully.");
					loggedIn = false;
					break;
				case 2:
					// Exit
					System.out.println("Exiting the system. Goodbye!");
					return;
				default:
					System.out.println("Invalid option. Please choose again.");
				}
			}

			scanner.close();
		}
	}



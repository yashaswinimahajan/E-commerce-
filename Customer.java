package ecommercewebsite;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
       private List<Product> cart;

		public Customer(int userId, String username, String password, String email) {
			super(userId, username, password, email);
			this.cart = new ArrayList<>();
		}

		public void addToCart(Product product) {
			cart.add(product);
			System.out.println(product.getProductName() + " added to cart.");
		}

		public void removeFromCart(Product product) {
			cart.remove(product);
			System.out.println(product.getProductName() + " removed from cart.");
		}

		public void checkout() {
			System.out.println("Checking out the following items:");
			for (Product product : cart) {
				System.out.println(product.getProductDetails());
			}
			cart.clear();
		}

		@Override
		public void viewProfile() {
			System.out.println("Customer Profile: " + getUsername() + ", Email: " + getEmail());
		}

		@Override
		public void updateProfile(String newEmail, String newPassword) {
			if (newEmail != null && !newEmail.isEmpty()) {
				System.out.println("Updating email from " + getEmail() + " to " + newEmail);
			}
			if (newPassword != null && !newPassword.isEmpty()) {
				System.out.println("Updating password.");
			}
		}

		@Override
		protected void SetUserId(int nextUserId) {
			// TODO Auto-generated method stub
			
		}
	}



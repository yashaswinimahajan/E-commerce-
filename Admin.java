package ecommercewebsite;

public class Admin extends User {
	public Admin(int userId, String username, String password, String email) {
			super(userId, username, password, email);
		}

		public void addProduct(Product product) {
			System.out.println("Product added: " + product.getProductDetails());
		}

		public void removeProduct(Product product) {
			System.out.println("Product removed: " + product.getProductDetails());
		}

		public void updateProduct(Product product, double newPrice, int newQuantity) {
			product.updatePrice(newPrice);
			product.updateQuantity(newQuantity);
			System.out.println("Product updated: " + product.getProductDetails());
		}

		@Override
		public void viewProfile() {
			System.out.println("Admin Profile: " + getUsername() + ", Email: " + getEmail());
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




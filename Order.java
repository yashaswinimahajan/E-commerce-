package ecommercewebsite;
import java.util.Date;
import java.util.List;

public class Order implements OrderActions {
	    private int orderId;
		private int customerId;
		private Date orderDate;
		private String orderStatus;
		private List<Product> orderedProducts;

		public Order(int orderId, int customerId, List<Product> orderedProducts) {
			this.orderId = orderId;
			this.customerId = customerId;
			this.orderDate = new Date();
			this.orderStatus = "Placed";
			this.orderedProducts = orderedProducts;
		}

		public int getOrderId() {
			return orderId;
		}

		public int getCustomerId() {
			return customerId;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public List<Product> getOrderedProducts() {
			return orderedProducts;
		}

		@Override
		public void placeOrder() {
			System.out.println("Order placed with ID: " + orderId);
		}

		@Override
		public void cancelOrder() {
			orderStatus = "Cancelled";
			System.out.println("Order with ID " + orderId + " has been cancelled.");
		}

		@Override
		public void trackOrder() {
			System.out.println("Order with ID " + orderId + " is currently: " + orderStatus);
		}

		public void updateOrderStatus(String status) {
			this.orderStatus = status;
			System.out.println("Order status updated to:" + status);
		}
	}



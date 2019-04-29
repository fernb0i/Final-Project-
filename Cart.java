package model;

public class Cart {

	private int customer_customerID;
	private int product_productID;
	private int quantity;
	
	public Cart() {
		this.customer_customerID = 0;
		this.product_productID = 0;
		this.quantity = 0;
	}
	
	/**
	 * @param customer_customerID
	 * @param product_productID
	 * @param quantity
	 */
	public Cart(int customer_customerID, int product_productID, int quantity) {
		this.customer_customerID = customer_customerID;
		this.product_productID = product_productID;
		this.quantity = quantity;
	}

	/**
	 * @return the customer_customerID
	 */
	public int getCustomer_customerID() {
		return customer_customerID;
	}

	/**
	 * @param customer_customerID the customer_customerID to set
	 */
	public void setCustomer_customerID(int customer_customerID) {
		this.customer_customerID = customer_customerID;
	}

	/**
	 * @return the product_productID
	 */
	public int getProduct_productID() {
		return product_productID;
	}

	/**
	 * @param product_productID the product_productID to set
	 */
	public void setProduct_productID(int product_productID) {
		this.product_productID = product_productID;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cart [customer_customerID=" + customer_customerID + ", product_productID=" + product_productID
				+ ", quantity=" + quantity + "]";
	}
	
	
}

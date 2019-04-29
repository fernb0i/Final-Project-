package model;

public class CartProducts {

	private int quantity;
	private int productID;
	private int customerID;
	public CartProducts() {
		this.quantity = 0;
		this.productID = 1;
		this.customerID = 1;
	}
	public CartProducts(int quantity, int productID, int customerID) {
		this.quantity = quantity;
		this.productID = productID;
		this.customerID = customerID;
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
	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CartProducts [quantity=" + quantity + ", productID=" + productID + ", customerID=" + customerID + "]";
	}
}

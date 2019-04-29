package model;

public class Cart {

	private int cartID;
	private int totalPrice;
	private int customerID;
	public Cart() {
		this.cartID = 1;
		this.totalPrice = 0;
		this.customerID = 1;
	}
	public Cart(int cartID, int totalPrice, int customerID) {
		this.cartID = cartID;
		this.totalPrice = totalPrice;
		this.customerID = customerID;
	}
	/**
	 * @return the cartID
	 */
	public int getCartID() {
		return cartID;
	}
	/**
	 * @param cartID the cartID to set
	 */
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	/**
	 * @return the totalPrice
	 */
	public int getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
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
		return "Cart [cartID=" + cartID + ", totalPrice=" + totalPrice + ", customerID=" + customerID + "]";
	}
}

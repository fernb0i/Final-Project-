package model;

public class Product {

	private int productID;
	private String name;
	private int price;
	private int inventory;
	
	public Product() {
		this.productID = 1;
		this.name = "name";
		this.price = 10;
		this.inventory = 10;
	}
	
	/**
	 * @param productID
	 * @param name
	 * @param price
	 * @param inventory
	 */
	public Product(int productID, String name, int price, int inventory) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.inventory = inventory;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the inventory
	 */
	public int getInventory() {
		return inventory;
	}

	/**
	 * @param inventory the inventory to set
	 */
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", price=" + price + ", inventory=" + inventory
				+ "]";
	}
	
	
}

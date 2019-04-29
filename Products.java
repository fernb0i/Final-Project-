package model;

public class Products {
	
	private int productID;
	private String productName;
	private int productPrice;
	private String productImage;
	private int productQuantity;
	private String productDesc;
	
	public Products() {
		this.productID = 1;
		this.productName = "";
		this.productPrice = 0;
		this.productImage = "";
		this.productQuantity = 0;
		this.productDesc = "";
	}
	
	public Products(int productID, String productName, int productPrice, String productImage, int productQuantity,
			String productDesc) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productImage = productImage;
		this.productQuantity = productQuantity;
		this.productDesc = productDesc;
	}
	/**
	 * @return the product_ID
	 */
	public int getProductID() {
		return productID;
	}
	/**
	 * @param product_ID the product_ID to set
	 */
	public void setProduct_ID(int productID) {
		this.productID = productID;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public int getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the productImage
	 */
	public String getProductImage() {
		return productImage;
	}
	/**
	 * @param productImage the productImage to set
	 */
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	/**
	 * @return the productQuantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}
	/**
	 * @param productQuantity the productQuantity to set
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}
	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Products [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productImage=" + productImage + ", productQuantity=" + productQuantity + ", productDesc="
				+ productDesc + "]";
	}

}

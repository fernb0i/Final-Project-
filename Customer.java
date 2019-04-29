package model;

public class Customer {
	
	private int customerID;
	private String fName;
	private String lName;
	private String phoneNum;
	private String email;
	private String username;
	private String password;
	
	public Customer() {
		this.customerID = 1;
		this.fName = "first";
		this.lName = "last";
		this.phoneNum = "0";
		this.email = "email";
		this.username = "default";
		this.password = "default";
	}
	
	/**
	 * @param customerID
	 * @param fName
	 * @param lName
	 * @param phoneNum
	 * @param email
	 * @param username
	 * @param password
	 */
	
	public Customer(int customerID, String fName, String lName, String phoneNum, String email, String username,
			String password) {
		this.customerID = customerID;
		this.fName = fName;
		this.lName = lName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.username = username;
		this.password = password;
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

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", fName=" + fName + ", lName=" + lName + ", phoneNum=" + phoneNum
				+ ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}
	
	


}
